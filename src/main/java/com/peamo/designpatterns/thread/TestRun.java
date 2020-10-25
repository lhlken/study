package com.peamo.designpatterns.thread;

/**
 * @author hwalong
 * @date 2018/9/25
 */
public class TestRun implements Runnable {

    private String name;

    public TestRun(String name) {
        this.name = name;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.µ
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            System.out.println(name+"===="+i);
        }
    }


    public static void main(String[] args) {
        Runnable run1 = new TestRun("run1");
        Runnable run2 = new TestRun("run2");

        new Thread(run1).start();
        new Thread(run2).start();
    }
}
