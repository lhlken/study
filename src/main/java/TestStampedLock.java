import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.StampedLock;

public class TestStampedLock {

    public static void main(String[] args) {
        final StampedLock stampedLock = new StampedLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    stampedLock.writeLockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LockSupport.park();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    stampedLock.readLockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2");

//        t1.start();
//        t2.start();

//        t2.interrupt();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                long stamp = stampedLock.readLock();
                try{

                    long ws = stampedLock.tryConvertToWriteLock(stamp);
                    if(ws != 0) {
                        stamp = ws;
                    }else {
                        stampedLock.unlockRead(stamp);
                    }

                }finally {
                    stampedLock.unlock(stamp);
                }
            }
        });

        t3.start();

    }
}
