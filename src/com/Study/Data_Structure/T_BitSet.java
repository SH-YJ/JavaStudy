package com.Study.Data_Structure;

import java.util.BitSet;

public class T_BitSet {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);  // 设置初始大为16
        BitSet bits2 = new BitSet(16);

        // 给一些位赋值
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1:");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2:");
        System.out.println(bits2);

        // AND bits 逻辑与
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1:");
        System.out.println(bits2);

        // OR bits 逻辑或
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1:");
        System.out.println(bits2);

        // XOR bits 逻辑异或
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1:");
        System.out.println(bits2);
    }
}
