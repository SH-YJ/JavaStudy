package com.Study.Runtime;

import java.io.IOException;

public class Runtime_test1 {
    public static void main(String[] args) throws IOException,InterruptedException {
        Runtime rt = Runtime.getRuntime(); //获取
        System.out.println("处理器的个数："+ rt.availableProcessors() +"个");
        System.out.println("空闲内存数量："+ rt.freeMemory()/1024/1024 +"M");
        System.out.println("最大可用内存数量："+ rt.maxMemory()/1024/1024 +"M");
        Process process = rt.exec("notepad.exe");//得到表示进程的Process对象
        Thread.sleep(3000);  //休眠3秒
        process.destroy(); //杀掉进程
    }
}
