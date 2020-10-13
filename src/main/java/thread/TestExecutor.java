package thread;

import java.util.concurrent.*;

public class TestExecutor {

    public static void main(String[] args) {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,4,100, TimeUnit.SECONDS,blockingQueue, new ThreadPoolExecutor.AbortPolicy());

        final Integer ss = 0;
//        submitFuture(executor,ss);
//        submitCaller(executor,ss);
        futerTask(executor);

        executor.shutdown();
    }

    public static void futerTask(ThreadPoolExecutor executor) {

        FutureTask<Integer> future = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 11111;
            }
        });
        executor.execute(future);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void submitFuture(ThreadPoolExecutor executor,Integer ss) {
        for(int i = 0;i<100;i++) {
            Future future = executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(ss);
                }
            });
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public static void submitFuture1(ThreadPoolExecutor executor,Integer ss) {
        for(int i = 0;i<100;i++) {
            Object object = new Object();
            Future future = executor.submit(new Runnable() {
                @Override
                public void run() {
                }
            },object);
        }
    }

    public static void submitCaller(ThreadPoolExecutor executor,Integer ss) {
        for(int i = 0;i<100;i++) {
            Future future = executor.submit(new Callable<String>() {
                /**
                 * Computes a result, or throws an exception if unable to do so.
                 *
                 * @return computed result
                 * @throws Exception if unable to compute a result
                 */
                @Override
                public String call() throws Exception {
                    return "aaa";
                }
            });
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}


