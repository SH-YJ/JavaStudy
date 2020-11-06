package com.Study.System;

public class System_test3 {
    public static void main(String[] args) {
        String p1 = "我是第一个报道得";
        String p2 = "我是刚刚跑过来的";
        char[] fromArray = p1.toCharArray();//源数组
        char[] toArray = p2.toCharArray();//目标数组
        System.arraycopy(fromArray, 2, toArray, 0, 4);//拷贝数组元素
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(i + "：" + toArray[i]);
        }

    }
}
