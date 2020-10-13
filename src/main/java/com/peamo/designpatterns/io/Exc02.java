package com.peamo.designpatterns.io;

import java.io.File;

/**
 * @author hualong.li
 * @date 2018/9/23
 * 递归实现输入任意目录，列出文件以及文件夹，效果看图
 */
public class Exc02 {

    public static void main(String[] args) {
        File file = new File("/Users/long/Documents/study");
        listFiles(file,0);
    }

    public static void listFiles(File file,int line) {
        for(int i =0;i<line;i++) {
            System.out.print("\t");
        }

        if(file.isDirectory()) {
            System.out.println("|-"+file.getName());
            File[] files = file.listFiles();
            for(File f:files) {
                listFiles(f,line+1);
            }
        }else {
            System.out.println(file.getName());
        }

    }
}
