package com.peamo.designpatterns.io;

import java.io.File;

/**
 * @author hualong.li
 * @date 2018/9/23
 */
public class Exc03 {
    public static void main(String[] args) {
        File file = new File("./");
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
            if(file.getName().indexOf(".java") != -1) {
                System.out.println(file.getName());
            }

        }

    }
}
