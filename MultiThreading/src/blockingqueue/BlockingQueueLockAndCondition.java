package blockingqueue;

/*

ArrayList();

read() :
    1. read only when arraylist is not Empty.
    2. mark arraylist is not full.
write() :
    1. write only when arraylist is not full.
    2. mark arraylist is not Empty.
 */





import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueLockAndCondition<E> {

    private Queue<E> queue;
    private int max = 16;
    private ReentrantLock lock = new ReentrantLock();

    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();
    public BlockingQueueLockAndCondition(int size){
        queue = new ArrayDeque<>();
        this.max = size;
    }
    public void put(E e){
        try{
            lock.lock();
            while(queue.size() == max){ //if(queue.size() == max){
                notEmpty.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            lock.unlock();
        }
    }
    public E take() {
        lock.lock();
        E e = null;
        try {
            while (queue.size() == 0) { //if (queue.size() == 0) {
                notEmpty.await();
            }
            e = queue.peek();
            notFull.signalAll();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            lock.unlock();
        }
        return e;
    }
}
