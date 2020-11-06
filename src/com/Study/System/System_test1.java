package com.Study.System;

import java.util.Properties;
import java.util.Set;

public class System_test1 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<String> ProoertyNames = properties.stringPropertyNames();
        for (String key : ProoertyNames) {
            String value = System.getProperty(key);
            System.out.println(key + "--->" + value);
        }
    }
}
