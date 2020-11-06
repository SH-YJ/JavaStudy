package com.company.chapter04;

public class example21 {
    public static void main(String[] args){
        try{
            System.out.println(div(9,0));
        }catch (ArithmeticException e){
            System.out.println("数学运算异常 "+e.getClass());
        }
    }
    public static int div(int x,int y){
        return x/y;
    }
}
