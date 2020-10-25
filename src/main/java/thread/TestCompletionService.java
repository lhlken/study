package thread;

import java.util.concurrent.*;

public class TestCompletionService {

    public static void main(String[] args) {

        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        ExecutorService executorService = new ThreadPoolExecutor(3,3,1000,TimeUnit.SECONDS,linkedBlockingQueue);

        CompletionService cs = new ExecutorCompletionService(executorService);

        cs.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000);
                return 1;
            }
        });

        cs.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000);
                return 2;
            }
        });

        cs.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000);
                return 3;
            }
        });

        for(int i = 0;i<3;i++) {
            try {
                System.out.println(cs.poll(1000,TimeUnit.SECONDS).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
//            try {
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
        }

        executorService.shutdown();
    }
}
