public class TestInterrupted {

    public static void main(String[] args) {
        byte[] lock = new byte[0];
        byte[] lock1 = new byte[0];


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000 && !Thread.currentThread().isInterrupted();i++) {

//                    synchronized (lock) {
//                        System.out.println(i+"==");
//                        synchronized (lock1) {
//                            System.out.println(i+"--");
//                        }
//                    }


//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000 && !Thread.currentThread().isInterrupted();i++) {

//                    synchronized (lock1) {
//                        System.out.println(i+"=====");
//
//                        synchronized (lock) {
//                            System.out.println(i+"-----");
//                        }
//                    }


//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        });

        thread.start();
        thread1.start();

    }
}
