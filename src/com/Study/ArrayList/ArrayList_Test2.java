package com.Study.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author SH_YJ
 * @date 2020/12/6 17:34
 */
public class ArrayList_Test2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        // 添加两个以上元素时，自动增加大小
        strings.ensureCapacity(2);
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.replaceAll(e ->e.toUpperCase(Locale.ROOT));
        System.out.println(strings);
    }
}
