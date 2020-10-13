package com.peamo.designpatterns.thread;

import com.peamo.designpatterns.Test;

/**
 * @author hualong.li
 * @date 2018/9/25
 */
public class TestSyn {

    public static int ant = 0;

    public static Object lock = new Object();

    public static void main(String[] args) {
        Runnable s1 = new SynchAdd();
        Runnable s2 = new SynchDel();

        new Thread(s1).start();
        new Thread(s2).start();
    }
}

class SynchAdd implements Runnable{

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
        for(int i = 0;i<1000;i++) {
            add();
        }

    }

    public void add() {
        synchronized(TestSyn.lock) {
            while(TestSyn.ant >= 100 ) {
                try {
                    TestSyn.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("add=="+(++TestSyn.ant));
            TestSyn.lock.notifyAll();
        }

    }


}
class SynchDel implements Runnable{

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
        for(int i = 0;i<1000;i++) {
            del();
        }
    }


    public void del() {
        synchronized(TestSyn.lock) {
            while(TestSyn.ant <= 0 ) {
                try {
                    TestSyn.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("del=="+(--TestSyn.ant));
            TestSyn.lock.notifyAll();
        }

    }


}


