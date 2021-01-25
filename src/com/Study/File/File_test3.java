package com.Study.File;

import java.io.*;

/**
 * @author SH_YJ
 * @date 2020/12/14 8:15
 */
public class File_test3 {
    public static void main(String[] args) {
        try {
            long starttime = System.currentTimeMillis();
            FileReader reader = new FileReader("S:/Desktop/1.txt");
            FileWriter writer = new FileWriter("S:/Desktop/2.txt");
            int txt = 0;
            while ((txt = reader.read()) != -1) {
                System.out.print((char) txt);
                writer.write((char) txt);
            }
            writer.close();
            long endtime = System.currentTimeMillis();
            System.out.println(endtime - starttime);  // 2s
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
