package com.peamo.designpatterns.thread;

//import org.omg.PortableServer.POA;

import java.io.*;

/**
 * @author hwalong
 * @date 2018/9/26
 */
public class TestClone{

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        long a = System.currentTimeMillis();
        Thread s1 = new Thread(new Threads());
        Thread s2 = new Thread(new Threads());
        Thread s3 = new Thread(new Threads());
        Thread s4 = new Thread(new Threads());

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();
        long b = System.currentTimeMillis();

        for(int i = 0;i<400;i++) {
            System.out.println(Po.getInstance());
        }
        long c = System.currentTimeMillis();
        System.out.println(b-a);
        System.out.println(c-b);


//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(new T());
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//
//        T object = (T) objectInputStream.readObject();
//
//        inputStream.reset();
//        objectInputStream = new ObjectInputStream(inputStream);
//        T object1 = (T) objectInputStream.readObject();

    }
}

class T implements Serializable{

}

class Threads implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            System.out.println(Po.getInstance());
        }
    }
}

class Po implements Serializable {
    private int aa;

    private String bb;

    public Po(int aa, String bb) {
        this.aa = aa;
        this.bb = bb;
    }

    private static class CC {
        private static Po po = new Po(1,"2");
    }

    private static ByteArrayOutputStream outputStream;
    private static ObjectOutputStream objectOutputStream;
    private static InputStream inputStream;
    private static ObjectInputStream objectInputStream;

    public static Po getInstance() {
        try {
            if(outputStream == null) {
                synchronized(Po.class) {
                    if(outputStream == null) {
                        System.out.println(111111);
                        outputStream = new ByteArrayOutputStream();
                        objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(CC.po);
                        inputStream = new ByteArrayInputStream(outputStream.toByteArray());
                        objectInputStream = new ObjectInputStream(inputStream);
                    }
                }
            }

            Po po = null;
            synchronized (Po.class) {
                inputStream.reset();
                objectInputStream = new ObjectInputStream(inputStream);
                po = (Po) objectInputStream.readObject();
            }

            return po;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }
}




