package com.peamo.designpatterns.io;

import java.io.*;

/**
 * @author hwalong
 * @date 2018/9/23
 * 从磁盘读取一个文件到内存中，再打印到控制台
 */
public class Exc04 {
    public static void main(String[] args) {
        String text = "";
        String fileName = "姗姗.sql";
        text = getTextByReader(text, fileName);
        System.out.println(text);
    }

    private static String getTextByReader(String text,String fileName) {
        try(Reader reader = new FileReader(fileName)) {
            char[] chars = new char[1024];
            while(reader.read(chars) != -1) {
                text += new String(chars);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static String getTextByStream(String text, String fileName) {
        try (InputStream inputStream = new FileInputStream(fileName)){
            byte[] bytes = new byte[1024];
            while(inputStream.read(bytes) != -1) {
                text += new String(bytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
