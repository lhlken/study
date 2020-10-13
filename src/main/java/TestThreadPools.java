import java.util.concurrent.*;

public class TestThreadPools {

    public static void main(String[] args) {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(2);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,10,100
                , TimeUnit.MICROSECONDS,blockingQueue);

        for(int i =0;i<10;i++) {
            final int s = i;
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //业务逻辑
                        System.out.println(s);
                        throw new Exception("11");
                    } catch (RuntimeException x) {
                        //按需处理
                    } catch (Throwable x) {
                        //按需处理
                    }

                }
            });
        }
        poolExecutor.shutdown();
    }
}
