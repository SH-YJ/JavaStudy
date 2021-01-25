package com.NYNU;

/**
 * @author SH_YJ
 * @date 2020/12/28 13:32
 */
import java.io.*;

public class Exam3 {
    // 文件拷贝
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Desktop/1.jpg");
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(f1));
            File f2 = new File("C:/Desktop/2.jpg");
            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(f2));
            int a = 0;
            while ((a = bin.read()) != -1) {
                bout.write(a);
            }
            bin.close();
            bout.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
