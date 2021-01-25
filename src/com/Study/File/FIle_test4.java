package com.Study.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author SH_YJ
 * @date 2020/12/14 8:50
 */
public class FIle_test4 {
    public static void main(String[] args) {
        int txt = 0;
        try {
            // 使用缓冲区减少时间
            long starttime = System.currentTimeMillis();
            BufferedWriter fo = new BufferedWriter(new FileWriter("S:/Desktop/2.txt"));
            BufferedReader fi = new BufferedReader(new FileReader("S:/Desktop/1.txt"));
            while (txt != -1) {
                txt = fi.read();
                fo.write(txt);
            }
            fi.close();
            fo.close();
            long endtime = System.currentTimeMillis();
            System.out.println(endtime - starttime);  // 1s
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
