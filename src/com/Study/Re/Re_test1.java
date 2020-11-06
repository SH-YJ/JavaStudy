package com.Study.Re;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re_test1 {
    public static void main(String[] args) {
        String s1 = "zoo";
        String s2 = "SmithekadljaSmythedasdaSmythSasdasmittSaskljdSmakjths";
        String p1 = "Sm[a-z]{0,3}t[a-z]{0,2}";
        String p2 = "[\\u4e00-\\u9fa5]";

        Pattern pattern1 = Pattern.compile(p1);
        Pattern pattern2 = Pattern.compile(p2);


        Matcher m1 = pattern1.matcher(s2);
        List<String> str = new ArrayList<>();
        while (m1.find()){
            str.add(m1.group());
        }
        for (int i = 0;i < str.size();i++){
            System.out.println(str.get(i));
        }
    }
}
