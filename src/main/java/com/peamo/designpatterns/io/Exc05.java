package com.peamo.designpatterns.io;

import java.io.*;

/**
 * @author hwalong
 * @date 2018/9/23
 * 在程序中写一个"HelloJavaWorld你好世界"输出到操作系统文件Hello.txt文件中
 */
public class Exc05 {

    public static void main(String[] args) {
        String fileName = "/Users/long/Documents/Hello.txt";
        String text = "HelloJavaWorld你好世界";
        writeByStream(fileName,text);

        String fileName1 = "/Users/long/Documents/Hello1.txt";
        writeByStream(fileName1,text);
    }

    public static void writeByWriter(String fileName,String text) {
        try (Writer writer = new FileWriter(fileName)){
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByStream(String fileName,String text) {
        try(OutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(text.getBytes());
            outputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
