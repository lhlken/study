public class Testss {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t = System.currentTimeMillis();
                for (int i = 1000; i < 100000000; i++) {
                    String s0 = String.valueOf(i);
                }
                System.out.println("耗时1:" + (System.currentTimeMillis() - t));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t = System.currentTimeMillis();
                for (int i = 1000; i < 100000000; i++) {
                    String s0 = Integer.toString(i);
                }
                System.out.println("耗时2:" + (System.currentTimeMillis() - t));
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t = System.currentTimeMillis();
                for (int i = 1000; i < 100000000; i++) {
                    String s = "" + 1111;
                }
                System.out.println("耗时3:" + (System.currentTimeMillis() - t));
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                long t = System.currentTimeMillis();
                for (int i = 1000; i < 100000000; i++) {
                    String s =  1111 + "";
                }
                System.out.println("耗时4:" + (System.currentTimeMillis() - t));
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
