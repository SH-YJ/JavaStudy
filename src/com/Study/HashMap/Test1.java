package com.Study.HashMap;

import java.util.HashMap;

/**
 * @author SH_YJ
 * @date 2020/12/11 8:23
 */
public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        HashMap<String, String> map1 = (HashMap<String, String>) map.clone();
        System.out.println(map1);
    }
}
