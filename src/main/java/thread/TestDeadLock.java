package thread;

public class TestDeadLock {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        ThreadA threadA = new ThreadA(a, b);
        ThreadA threadB = new ThreadA(b,a);

        threadA.setName("A");
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}

class ThreadA extends Thread {

    private Object a;

    private Object b;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public ThreadA(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        for(int i = 0;i<10000;i++) {
            synchronized (a) {
                synchronized (b) {
                    System.out.println(this.getName()+"==="+i);
                }
            }
        }

   }
}


