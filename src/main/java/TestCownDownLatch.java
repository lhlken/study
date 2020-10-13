import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCownDownLatch {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);


        CountDownLatch latch1 = new CountDownLatch(2);
        for(int i = 0;i<2;i++) {

            es.submit(new Runnable() {
                @Override
                public void run() {

                    CountDownLatch latch2 = new CountDownLatch(2);
                    for(int j = 0;j<2;j++) {

                        es.submit(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println("latch2");
                                latch2.countDown();
                            }
                        });
                    }
                    try {
                        latch2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    latch1.countDown();

                }
            });

        }
        latch1.await();
        System.out.println("1111");
        es.shutdown();

    }
}
