package com.company.chapter04;

//定义ANimal接口
interface Animal4{
    abstract public void shout();
    abstract public void eat();
}

//定义Woo接口
interface Woo{
    abstract public void play();
    abstract public void run();
}

class realize implements Animal4,Woo{
    @Override
    public void shout(){
        System.out.println("发出汪汪叫");
    }
    @Override
    public void eat(){
        System.out.println("吃饱了");
    }
    @Override
    public void play(){
        System.out.println("出去玩");
    }
    @Override
    public void run(){
        System.out.println("跑");
    }
}

public class example11 {
    public static void main(String[] args){
        realize r1 = new realize();
        r1.shout();
        r1.eat();
        r1.play();
        r1.run();
    }
}
