import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestMyThreadPool {

    public static void main(String[] args) {
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(2);
        MyThreadPool pool = new MyThreadPool(2,blockingQueue);

        pool.addExecute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
    }
}

class MyThreadPool {

    BlockingQueue<Runnable> blockingQueue;

    List<WorkThread> workThreads;

    public MyThreadPool(int size,BlockingQueue<Runnable> blockingQueue) {
        this.blockingQueue = blockingQueue;
        this.workThreads = new ArrayList<>();
        for(int i = 0;i<size;i++) {
            WorkThread workThread = new WorkThread(this.blockingQueue);
            workThread.start();
            this.workThreads.add(workThread);
        }
    }

    public void addExecute(Runnable command) {
        try {
            this.blockingQueue.put(command);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class WorkThread extends Thread {

        private BlockingQueue<Runnable> blockingQueue;

        public WorkThread(BlockingQueue<Runnable> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Runnable runnable = blockingQueue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


