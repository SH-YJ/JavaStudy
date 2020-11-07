package com.Study.Data_Structure;

import java.util.Vector;
import java.util.Enumeration;

public class T_Vector {
    public static void main(String[] args) {
        // 初始容量 3,增量 2
        Vector<Object> v = new Vector<>(3,2);
        //System.out.println("初始大小：" + v.size());组件的数量初始为0，该程序最后为11
        System.out.println("初始容量：" + v.capacity());
        v.addElement(1);//添加组件
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("增加4个数后的容量：" + v.capacity());

        v.addElement(5.45);
        System.out.println("当前容量：" + v.capacity());
        v.addElement(6.08);
        v.addElement(7);
        System.out.println("当前容量" + v.capacity());
        v.addElement(9.4);
        v.addElement(10);
        System.out.println("当前容量：" + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("首元素：" + v.firstElement());
        System.out.println("末尾元素：" + v.lastElement());
        if (v.contains(3)){
            System.out.println("Vector 包含 3.");
        }

        Enumeration<Object> vEnum = v.elements();
        System.out.println("\nVector 中的元素：");
        while (vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement() + " ");
        }
    }
}
