package com.company.chapter04;

import jdk.internal.dynalink.beans.StaticClass;

interface Animal5{
    void shout();
}
class Cat implements Animal5{
    @Override
    public void shout(){
        System.out.println("喵喵......");
    }
}
class Dog3 implements Animal5{
    @Override
    public void shout() {
        System.out.println("汪汪......");
    }
}

public class example13 {
    public static void main(String[] args){
        Animal5 a1 = new Dog3();
        Animal5 a2 = new Cat();
        animal2Shout(a1);
        animal2Shout(a2);
    }
    private static void animal2Shout(Animal5 an) {
        an.shout();
    }

}
