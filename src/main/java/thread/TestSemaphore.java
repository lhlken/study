package thread;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

public class TestSemaphore {

    public static void main(String[] args) {

        ObjectPool pool = new ObjectPool(2);
        Thread t1 = new Thread(new TT(pool),"t1");
        Thread t2 = new Thread(new TT(pool),"t2");
        Thread t3 = new Thread(new TT(pool),"t3");

        t1.start();
        t2.start();
        t3.start();


    }
}

class TT implements Runnable{

    private ObjectPool objectPool;

    public TT(ObjectPool objectPool) {
        this.objectPool = objectPool;
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
        while (true) {
            objectPool.exec();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class ObjectPool{

    final Semaphore semaphore;

    final List<Object> objects;

    public ObjectPool(int size) {
        this.semaphore = new Semaphore(size);
        this.objects = new Vector<>(size);
        for(int i = 0;i<size;i++) {
            this.objects.add(new Object());
        }
    }

    public void exec() {

        Object object = null;
        try {
            semaphore.acquire();
            object  = objects.remove(0);
            System.out.println(Thread.currentThread().getName()+"=="+object);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            this.objects.add(object);
            semaphore.release();
        }

    }
}
