import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockQueue<T> {

    final Lock lock = new ReentrantLock();

    final Condition notFull = lock.newCondition();

    final Condition notEmpty = lock.newCondition();

    private List<T> list = new ArrayList<>();

    private int size;

    public BlockQueue(int size) {
        this.size = size;
    }

    //入队
    void enq(T x) {
        lock.lock();

        try {
            while (list.size() >= size) {
                notFull.await();
            }
            list.add(x);
//            notEmpty.signal();
            notEmpty.signalAll();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //出队
    T deenq() {
        lock.lock();
        T t = null;
        try {
            while (list.size() == 0) {
                notEmpty.await();
            }
            t = list.remove(0);
//            notFull.signal();
            notFull.signalAll();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return t;
    }

    public static void main(String[] args) throws InterruptedException {
        BlockQueue<String> blockQueue = new BlockQueue(100);

        Thread enqRunable = new Thread(new enqRunable(blockQueue));
        Thread enqRunable2 = new Thread(new enqRunable(blockQueue));
        Thread de = new Thread(new DenqRunable(blockQueue));

        enqRunable.start();
        enqRunable2.start();
        de.start();

        enqRunable.join();
        enqRunable2.join();
        de.join();



    }
}

class enqRunable implements Runnable {

    private BlockQueue<String> blockQueue;

    public enqRunable(BlockQueue<String> blockQueue) {
        this.blockQueue = blockQueue;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while(true) {
            String s = "str"+Math.random();
            blockQueue.enq(s);
            System.out.println("esr==="+s);
        }

    }
}

class DenqRunable implements Runnable {

    private BlockQueue<String> blockQueue;

    public DenqRunable(BlockQueue<String> blockQueue) {
        this.blockQueue = blockQueue;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while(true) {
           String s =  blockQueue.deenq();
           System.out.println("dsr==="+s);
        }

    }
}
