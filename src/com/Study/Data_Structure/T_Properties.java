package com.Study.Data_Structure;

import java.util.Properties;
import java.util.Set;

public class T_Properties {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set<Object> states;
        String str;

        capitals.put("Illinois","Springfiled");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Washington","Olympia");
        capitals.put("Claifornia","Sacramento");
        capitals.put("Indiana","Indianapolis");

        states = capitals.keySet();
        for (Object state : states) {
            str = (String) state;
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        str = capitals.getProperty("Florida","Not Found");
        System.out.println("The capital of Florida is " + str + ".");
    }
}
