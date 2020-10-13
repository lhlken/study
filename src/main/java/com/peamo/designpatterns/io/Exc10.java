package com.peamo.designpatterns.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * @author hualong.li
 * @date 2018/9/23
 * 使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
 */
public class Exc10 {

    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/long/Documents/Hello.txt","r")) {
            System.out.println(randomAccessFile.getFilePointer());
//            randomAccessFile.seek(23);
            System.out.println(randomAccessFile.length());
            System.out.println(randomAccessFile.getFilePointer());
            byte[] bytes = new byte[1024];
            int n = randomAccessFile.read(bytes);
            System.out.println(new String(bytes,0,n));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
