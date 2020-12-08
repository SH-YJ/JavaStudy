package com.Study.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author SH_YJ
 * @date 2020/12/6 16:22
 */
public class ArrayList_Test1 {
    public static void main(String[] args) {
        // 添加元素
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);

        // 访问元素
        System.out.println(sites.get(1));  // 访问第二个元素

        // 修改元素
        sites.set(2, "Wiki");  // 第一个参数为索引位置，第二个位置为要修改的值
        System.out.println(sites);

        // 删除元素
        sites.remove(2);
        System.out.println(sites);

        // 计算大小
        System.out.println(sites.size());

        // 迭代数组列表
        for (String str : sites) {
            System.out.println(str);
        }

        // ArrayList排序
        Collections.sort(sites);
        for (String i : sites) {
            System.out.println(i);
        }

    }
}
