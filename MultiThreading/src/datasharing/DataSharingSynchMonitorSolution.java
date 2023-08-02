package datasharing;

public class DataSharingSynchMonitorSolution {

    public static void main(String[] args) throws InterruptedException {

        InventoryCounter inventoryCounter=new InventoryCounter();
        IncrementingThread incrementThread=new IncrementingThread(inventoryCounter);
        DecrementingThread decrementThread=new DecrementingThread(inventoryCounter);
        /*decrementThread.start();
        decrementThread.join();
        incrementThread.start();
        incrementThread.join();*/

        decrementThread.start();
        incrementThread.start();
        incrementThread.join();
        decrementThread.join();
        System.out.println("Final Inventory count:"+inventoryCounter.getItems());
    }
    private static class DecrementingThread extends Thread{

        private InventoryCounter inventoryCounter;

        public DecrementingThread(InventoryCounter inventoryCounter){
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                inventoryCounter.decrement();
            }
        }
    }
    private static class IncrementingThread extends Thread{

        private InventoryCounter inventoryCounter;

        public IncrementingThread(InventoryCounter inventoryCounter){
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                inventoryCounter.increment();
            }
        }
    }

    private static class InventoryCounter{
        private int items = 0;

        public synchronized void increment(){
            items++;
        }

        public synchronized void decrement(){
            items--;
        }

        public synchronized int getItems(){
            return items;
        }

    }

}
