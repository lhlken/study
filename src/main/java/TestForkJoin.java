import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestForkJoin {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        Fib fib = new Fib(40);

        Integer result = forkJoinPool.invoke(fib);
        System.out.println(result);

    }
}

// 0 1 1 2 3 5 8
class Fib extends RecursiveTask<Integer> {

    int n;

    public Fib(int n) {
        this.n = n;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Integer compute() {
        if(n <= 1) {
            return n;
        }

        Fib fib1 = new Fib(n - 2);
        Fib fib2 = new Fib(n - 1);

        fib2.fork();

        return fib1.compute() + fib2.join();
    }
}
