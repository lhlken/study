package thread;


public class Test10000 {

    public int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Test10000 test10000 = new Test10000();

        Threa t1 = new Threa(test10000);

        Threa t2 = new Threa(test10000);

        t1.start();
//        t2.start();

//        t1.join();
//        t2.join();

        for(int i = 0;i<=100000;i++) {
            if(i == 100000) {
                t1.interrupt();
                System.out.println("11111111");
            }
        }

        System.out.println(test10000.count);

    }
}

class Threa extends Thread {

    private Test10000 t;

    public Threa(Test10000 t) {
        this.t = t;
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
        add10000();
    }

    public void add10000() {
        int i = 0;
        while (i++ < 100000000 && !this.isInterrupted()) {
            t.count++;
        }
    }
}
