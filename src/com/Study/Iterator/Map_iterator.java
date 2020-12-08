package com.Study.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author SH_YJ
 * @date 2020/12/6 16:01
 */
public class Map_iterator {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        // 第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= " + key + " and value= " + map.get(key));
        }

        // 第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 第四种
        System.out.println("通过Map.value()遍历所有的value，但不能遍历key");
        for (String v: map.values()) {
            System.out.println("value= " + v);
        }

    }
}
