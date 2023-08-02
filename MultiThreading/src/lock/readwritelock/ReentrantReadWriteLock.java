package lock.readwritelock;

import java.util.*;

public class ReentrantReadWriteLock {

    public static void main(String[] args) throws InterruptedException {
        InventoryDatabase inventoryDatabase = new InventoryDatabase();
        Random random=new Random();
        for (int i = 0; i < 100000; i++) {
            inventoryDatabase.addItem(random.nextInt(1000));
        }
        Thread writer = new Thread(()->{
           while (true){
               inventoryDatabase.addItem(random.nextInt(1000));
               inventoryDatabase.removeItem(random.nextInt(1000));
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        writer.setDaemon(true);
        writer.start();
        int numberOfReaderThread = 7;
        List<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < numberOfReaderThread; i++) {
            Thread reader = new Thread(()->{
                for (int j = 0; j < 100000; j++) {
                    int upperBoundPrice = random.nextInt(1000);
                    int lowerBoundPrice = upperBoundPrice>0 ? random.nextInt(upperBoundPrice) : 0;
                    inventoryDatabase.getNumberOfItemsPriceRange(lowerBoundPrice,upperBoundPrice);
                }
            });
            reader.setDaemon(true);
            threadList.add(reader);
        }
        long startReadingTime = System.currentTimeMillis();
        for (Thread reader: threadList) {
            reader.start();
        }
        for (Thread reader: threadList) {
            reader.join();
        }
        long endReadingTime = System.currentTimeMillis();
        System.out.println(String.format("Read took %d ms", endReadingTime-startReadingTime));
    }
    public static class InventoryDatabase{
        private TreeMap<Integer, Integer> priceToCountMap=new TreeMap<>();
        private java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
        public int getNumberOfItemsPriceRange(int lowerBound, int upperBound){
            lock.lock();
            try{
                Integer fromKey = priceToCountMap.ceilingKey(lowerBound);
                Integer toKey = priceToCountMap.floorKey(upperBound);

                if(fromKey == null || toKey == null){
                    return 0;
                }
                NavigableMap<Integer, Integer> rangeOfPrices = priceToCountMap.subMap(fromKey,true, toKey,true);
                int sum = 0;
                for (int numberOfItemsForPrice: rangeOfPrices.values()) {
                    sum += numberOfItemsForPrice;
                }
                return sum;
            }finally {
                lock.unlock();
            }
        }

        public void addItem(int price){
            lock.lock();
            try{
                Integer numberOfItemsPrice = priceToCountMap.get(price);
                if(numberOfItemsPrice == null){
                    priceToCountMap.put(price,1);
                }else {
                    priceToCountMap.put(price,numberOfItemsPrice+1);
                }
            }finally {
                lock.unlock();
            }
        }

        public void removeItem(int price){
            lock.lock();
            try{
                Integer numberOfItemsPrice = priceToCountMap.get(price);
                if(numberOfItemsPrice == null || numberOfItemsPrice == 1){
                    priceToCountMap.remove(price);
                }else {
                    priceToCountMap.put(price,numberOfItemsPrice+1);
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
