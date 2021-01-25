package com.Study.HashSet;

import java.util.HashSet;

/**
 * @author SH_YJ
 * @date 2020/12/10 17:07
 */
public class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set.contains("a"));
        for (String str : set) {
            System.out.println(str);
        }
    }
}
