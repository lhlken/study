package com.peamo.designpatterns.thread;

/**
 * @author hwalong
 * @date 2018/9/25
 */
public class TestThread extends Thread{

    private String name;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public TestThread(String name) {
        this.name = name;
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            System.out.println(name+"===="+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new TestThread("th1");
        Thread thread2 = new TestThread("th2");

        thread1.start();
        thread2.start();
        thread1.join();
//        thread2.join();
        System.out.println("=================");
    }
}
