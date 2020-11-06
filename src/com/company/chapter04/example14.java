package com.company.chapter04;

interface Animal6{
    void shout();
}

class Cat2 implements Animal6{
    @Override
    public void shout() {
        System.out.println("喵喵......");
    }
    public void sleep(){
        System.out.println("猫睡觉......");
    }
}

public class example14 {
    public static void main(String[] args){
        Cat2 cat = new Cat2();
        animal6Shout(cat);
    }

    private static void animal6Shout(Animal6 animal6) {
        Cat2 cat = (Cat2) animal6;
        cat.shout();
        cat.sleep();
    }
}
