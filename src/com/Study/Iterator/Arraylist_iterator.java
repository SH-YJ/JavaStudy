package com.Study.Iterator;

import java.util.*;

/**
 * @author SH_YJ
 * @date 2020/12/6 15:52
 */
public class Arraylist_iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        //第一种遍历方式使用 For-Each 遍历list
        for (String str : list) {
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String s : strArray) {
            System.out.println(s);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
