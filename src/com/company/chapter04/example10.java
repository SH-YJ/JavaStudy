package com.company.chapter04;

abstract class Animal3{
    abstract void shout();
    abstract void eat();
    abstract void run();
}

class Dog2 extends Animal3{
    @Override
    void shout(){
        System.out.println("发出汪汪叫");
    }
    @Override
    void eat(){
        System.out.println("吃饱了");
    }
    @Override
    void run(){
        System.out.println("跑了三圈了");
    }
}

public class example10{
    public static void main(String[] args){
        Dog2 d1= new Dog2();
        d1.shout();
        d1.eat();
        d1.run();
    }
}
