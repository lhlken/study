import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {


    public static void main(String[] args) {
        Cache cache = new Cache();
        Thread t1 = new Thread(new A1(cache),"t1");
        Thread t2 = new Thread(new B1(cache),"t2");
        t1.start();
        t2.start();

    }
}

class A1 implements Runnable {

    private Cache cache;

    public A1(Cache cache) {
        this.cache = cache;
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
            System.out.println(Thread.currentThread().getName()+"==read=="+this.cache.get("t1"));
        }
    }
}

class B1 implements Runnable {

    private Cache cache;

    public B1(Cache cache) {
        this.cache = cache;
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
            String s = Math.random()+"";
            this.cache.setMap("t1", s);
            System.out.println(Thread.currentThread().getName()+"==write=="+s);
        }
    }
}

class Cache {

    private Map<String,String> map;

    private ReadWriteLock readWriteLock;

    private Lock readLock;

    private Lock writeLock;

    public Cache() {
        this.map = new HashMap<>();
        this.readWriteLock = new ReentrantReadWriteLock();
        this.writeLock = this.readWriteLock.writeLock();
        this.readLock = this.readWriteLock.readLock();
    }

    public String get(String key) {
        readLock.lock();
        try {
            return map.get(key);
        }finally {
            readLock.unlock();
        }
    }

    public void setMap(String key,String value) {
        writeLock.lock();
        try{

            map.put(key,value);
            readLock.lock();
        }finally {
            writeLock.unlock();
        }

        try {

        }finally {
            readLock.unlock();
        }

    }
}
