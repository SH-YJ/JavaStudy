package com.company.chapter05;

import java.io.IOException;
import java.util.Random;
import java.util.*;

public class Example08 {
    public static void main(String[] args) throws IOException, InterruptedException {
        StringBuffer sb = new StringBuffer();
        char[] c = new char[10];
        sb.getChars(2,8,c,0);
        for (char c1: c) {
            System.out.println(c1);
        }

    }
}
