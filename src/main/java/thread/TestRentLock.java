package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestRentLock {

    public static void main(String[] args) throws InterruptedException {

        LockT lockT = new LockT();
        LockT lockT1 = new LockT();
        Thread t1 = new TT(lockT,lockT1);
        Thread t2 = new TT(lockT1,lockT);

        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();

//        ((Thread) t1).join();
//        ((Thread) t2).join();
        t2.interrupt();

//        System.out.print(lockT.count);
    }

}


class LockT {
    public Lock lock = new ReentrantLock();

    int count = 0;
    public void add(int length) {
        for (int i = 0; i < length; i++) {
            lock.tryLock();
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }
    }

}

class TT extends Thread{

    LockT lockT;

    LockT lockT1;

    public TT(LockT lockT,LockT lockT1) {
        this.lockT = lockT;
        this.lockT1 = lockT1;
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
//        lockT.add(100000);

        try {
            while(!lockT.lock.tryLock()) {
                TimeUnit.MICROSECONDS.sleep(10);
            }
            TimeUnit.MICROSECONDS.sleep(10);

        } catch (InterruptedException e) {
//            e.printStackTrace();
        }finally {
            lockT.lock.unlock();
            lockT1.lock.unlock();

            System.out.println(this.getName()+"===end");
        }

    }
}
