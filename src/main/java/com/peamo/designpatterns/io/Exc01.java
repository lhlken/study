package com.peamo.designpatterns.io;

import java.io.*;

/**
 * @author hualong.li
 * @date 2018/9/23
 * 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
 * 录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
 * 件
 */
public class Exc01 {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/long/Documents/HelloWorld.txt");
        file.createNewFile();
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        File file1 = new File("/Users/long/Documents/IOTest");
        file1.mkdir();

        /**
         * 重命名方法，但可以起到移动文件的作用
         */
        File file2 = new File("/Users/long/Documents/IOTest/HelloWorld.txt");
        System.out.println(file.renameTo(file2));

        File[] files = file1.listFiles();
        for(File f : files) {
            System.out.println(f.getName());
        }
    }
}
