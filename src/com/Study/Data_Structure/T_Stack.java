package com.Study.Data_Structure;

import java.util.EmptyStackException;
import java.util.Stack;

public class T_Stack {
    static void showpush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("Stack: " + st);
    }

    static void showpop(Stack<Integer> st){
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("empty Stack");
        }

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(300);
        s2.push(300);
        int p1 = s1.peek();
        int p2 = s2.peek();
        System.out.println(p1==p2);
        System.out.println(s1.peek()==s2.peek());
        System.out.println(s1.peek().equals(s2.peek()));
        //运用 == 插入值在[-128,127]内，两个输出值为true，若超出这个范围输出：true和false
        //运用equals()两次输出值都为true
    }
}
