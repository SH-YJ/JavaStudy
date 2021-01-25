package com.Study.File;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author SH_YJ
 * @date 2020/12/18 8:21
 */

public class File_test6 {
    public static void main(String[] args) throws IOException {
        File file = new File("S:/Desktop/new.txt");
        file.createNewFile();  // 创建新文件
        FileWriter writer = new FileWriter(file);
        String message = "";
        message += "文件名称：" + file.getName() + "\n";
        message += "文件相对路径：" + file.getPath() + "\n";
        message += "文件绝对路径：" + file.getAbsolutePath() + "\n";
        message += "文件的父路径：" + file.getParent() + "\n";
        message += "文件是否可读？" + file.canRead() + "\n";
        message += "文件是否可写？" + file.canWrite() + "\n";
        message += "是否为一个文件？" + file.isFile() + "\n";
        message += "是否为一个目录？" + file.isDirectory() + "\n";
        message += "是否为绝对路径？" + file.isAbsolute() + "\n";
        message += "最后修改时间为：" + file.lastModified() + "\n";
        message += "文件大小为：" + file.length() + "bytes\n";
        writer.write(message);
        writer.close();

        String dirname = "S:/Desktop";
        File f = new File(dirname);
        FilenameFilter filter = new FilenameFilter() {  // 文件过滤器
            @Override
            public boolean accept(File dir, String name) {
                File currentfile = new File(dir, name);
                return currentfile.isFile() && name.endsWith(".txt");
            }
        };
        if (f.exists()) {
            String[] str = f.list(filter);
            assert str != null;  // 断言  通常用来判断变量对象是否为null。并且对象为null通常都会抛异常
            for (String s : str) {
                System.out.println(s);
            }
        }

    }
}