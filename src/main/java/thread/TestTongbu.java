package thread;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class TestTongbu {

    public static void main(String[] args) {

        final CountDownLatch latch = new CountDownLatch(2);
        final List<Integer> list = new Vector<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(1);
                latch.countDown();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(2);
                latch.countDown();
            }
        });

        t1.start();
        t2.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("latch:"+ JSON.toJSONString(list));

        final List<Integer> list1 = new Vector<>();
        final List<Integer> list2 = new Vector<>();

        final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("barrier:"+JSON.toJSONString(list1)+"=="+JSON.toJSONString(list2));
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(100);
                    list1.add(1);
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(200);
                    list2.add(2);
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        });
        t3.start();
        t4.start();

    }
}
