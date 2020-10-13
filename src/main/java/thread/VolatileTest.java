package thread;

public class VolatileTest {

    long x = 0;

    boolean v = false;

    public void writer() {
        x = 78912112312312l;
//        v = true;
    }

    public void read() {
//        if(v == true) {
            System.out.println(x);
//        }
    }

    public static void main(String[] argss) {
        for(int i = 0;i<100000;i++) {
            VolatileTest volatileTest = new VolatileTest();
            ThR r = new ThR(volatileTest);
            ThW w = new ThW(volatileTest);

            new Thread(w).start();
            new Thread(r).start();


        }
    }


}

class ThR implements Runnable {

    private VolatileTest volatileTest;

    public ThR(VolatileTest volatileTest) {
        this.volatileTest = volatileTest;
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
        volatileTest.read();
    }
}

class ThW implements Runnable {
    private VolatileTest volatileTest;

    public ThW(VolatileTest volatileTest) {
        this.volatileTest = volatileTest;
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
        volatileTest.writer();
    }
}
