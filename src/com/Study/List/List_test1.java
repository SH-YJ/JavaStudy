package com.Study.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_test1 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        li.addAll(0,arr);
        arr.add(2342);
        arr.add(34534);
        Iterator it = arr.iterator();  // 获取Iterator对象
        while (it.hasNext()) {  //判断是否存在下一个元素
            Object obj = it.next();  //取出ArrayList中的元素
            System.out.println(obj);
        }
    }
}
