package com.peamo.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hualong.li
 * @date 2018/8/25
 */
public class Test {

    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i =0;i<10;i++) {
            service.submit(new Thread() {
                @Override
                public void run() {
                    SingletonEnum.INSTANCE.add();

                }
            });
        }

        service.shutdown();


    }
}
