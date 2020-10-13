/**
 * @(#)Hash.java Created by yi.tian on 2018/9/21	下午3:37
 * <p>
 * Copyrights (C) 2018保留所有权利
 */


import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:											<br>  
 * 修改日期    		修改人员   	版本	 		修改内容<br>  
 * -------------------------------------------------<br>  
 * 2018/9/21 下午3:37   yi.tian     1.0    	初始化创建<br>
 * </p> 
 *
 * @author yi.tian
 * @version 1.0
 * @since JDK1.7
 */
public class Hash {

    private HashMap<Integer, Integer> map1 = new HashMap<>();
    private ConcurrentHashMap<Integer, Integer> map2 = new ConcurrentHashMap<>();

    public Hash() {
        for (int i = 0; i < 1000000; i++) {
            map1.put(i, i);
            map2.put(i, i);
        }
    }


    public void testHashMap() {
        Thread [] thread1 = new Thread[16];
        for (int i = 0; i < thread1.length; i++) {
            thread1[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    long current = System.currentTimeMillis();
                    for (int i = 0; i < 1000000; i++) {
                        map1.get(i);
                    }
                    System.out.println("hash time is " + (System.currentTimeMillis() - current));
                }
            });
        }

        for (Thread thread : thread1) {
            thread.start();
        }
    }

    public void testConcurrentHashMap() {
        Thread [] thread1 = new Thread[16];
        for (int i = 0; i < thread1.length; i++) {
            thread1[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    long current = System.currentTimeMillis();
                    for (int i = 0; i < 1000000; i++) {
                        map2.get(i);
                    }
                    System.out.println("concurrenthash time is " + (System.currentTimeMillis() - current));
                }
            });
        }

        for (Thread thread : thread1) {
            thread.start();
        }
    }

    public static void main(String[] args) {
        Hash hash = new Hash();
        hash.testConcurrentHashMap();
        hash.testHashMap();

        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}