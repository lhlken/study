package thread;

import java.util.ArrayList;
import java.util.List;

public class TestProducer {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Object object = new Object();
        Producer producer  = new Producer(list,object,false);
        Consumer consumer = new Consumer(list,object,false);

        producer.setName("producer");

        consumer.setName("consumer");

        producer.start();
        consumer.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        producer.setEnd(true);
        consumer.setEnd(true);

    }
}

class Producer extends Thread {

    private List<Object> list;

    private Object object;

    private Boolean end;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public Producer(List<Object> list,Object object,Boolean end) {
        this.list = list;
        this.object = object;
        this.end = end;
    }

    public void run() {
        int i = 0;
        while (!end) {
            synchronized (object) {
                while(list.size() >= 5 ) {
                    try {
                        object.wait(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                list.add(new Object());
//                object.notifyAll();
                System.out.println(this.getName()+"product_"+(i++));
            }

        }
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }
}

class Consumer extends Thread {

    private List<Object> list;

    private Object object;

    private Boolean end;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public Consumer(List<Object> list,Object object,Boolean end) {
        this.list = list;
        this.object = object;
        this.end = end;
    }

    public void run() {
        int i = 0;
        while(!end) {
            synchronized (object) {
                while(list.size() <= 0) {
                    try {
                        object.wait(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                list.remove(0);
//                object.notifyAll();
                System.out.println(this.getName() + "remove_"+(i++));
            }

        }
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }
}
