import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;

public class TestWait {


    public static void main(String[] args) {

        Object object = new Object();
        List<Integer> list = new ArrayList<>();
        Thread thread1 = new Thread(new AA(object,list),"1");
        Thread thread11 = new Thread(new AA(object,list),"11");

        Thread thread2 = new Thread(new BB(object,list),"2");
        Thread thread21 = new Thread(new BB(object,list),"21");

        thread1.start();
        thread11.start();
        thread2.start();
        thread21.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        thread11.interrupt();

    }
}


class AA implements Runnable {

    private Object object;

    private List<Integer> list;

    public AA(Object object, List<Integer> list) {
        this.object = object;
        this.list = list;
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

        while (!Thread.currentThread().isInterrupted()) {

            synchronized (object) {
                while(list.size() == 0) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int ss = list.remove(0);
                System.out.println(Thread.currentThread()+"remove===="+ss);
                object.notifyAll();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }

    }
}

class BB implements  Runnable{

    private Object object;

    private List<Integer> list;

    public BB(Object object, List<Integer> list) {
        this.object = object;
        this.list = list;
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
            synchronized (object) {
                while (list.size() == 100) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int ss = (int)(Math.random()*100);
                list.add(ss);
                System.out.println(Thread.currentThread()+"add===="+ss);
                object.notifyAll();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
