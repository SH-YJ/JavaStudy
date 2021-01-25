package com.Study.File;

import java.io.*;

/**
 * @author SH_YJ
 * @date 2020/12/15 19:39
 */
public class File_test5 {
    public static void main(String[] args) throws IOException {
        // 拷贝文件
        InputStream in = new FileInputStream("D:\\BaiduNetdiskDownload\\Java-master\\day21\\code\\demo\\哥有老婆.mp4");
        OutputStream out = new FileOutputStream("S:/Desktop/1.mp4");
        int len;  // 定义一个int类型的变量len，记住每一个读取的字节
        long begintime = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime - begintime);
        in.close();
        out.close();
    }
}
