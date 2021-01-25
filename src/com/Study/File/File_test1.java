package com.Study.File;

import java.io.File;
import java.util.Scanner;

public class File_test1 {
    public static void main(String[] args){
        String dirname = "S:/Desktop/Java文件/Normal";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("目录:"+dirname);
            String[] s = f1.list();
            assert s != null;
            for (String value : s) {
                File f = new File(dirname + "/" + value);
                if (f.isDirectory()) {
                    System.out.println(value + " 是一个目录");
                } else {
                    System.out.println(value + " 是一个文件");
                }
            }
        }
        else {
            System.out.println(dirname+" 不是一个目录");
        }
    }
}
