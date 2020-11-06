package com.Study.System;

public class System_test2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//循环结束后当前的时间
        System.out.println("程序运行的时间为:" + (endTime - startTime) + "毫秒");
    }
}
