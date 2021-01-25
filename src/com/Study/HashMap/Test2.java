package com.Study.HashMap;

import java.util.HashMap;

/**
 * @author SH_YJ
 * @date 2020/12/15 20:18
 */
public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"syj");
        map.put(2,"lsn");
        for (String str: map.values()
             ) {
            System.out.println(str);
        }
    }
}
