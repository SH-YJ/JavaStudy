package com.company.chapter04;

class Animal{ //父类
    String name;
    void shout(){
        System.out .println(name+"发出叫声");
    }
}
//继承animal类
class Dog extends Animal{  //子类
    void shout(){ //重写父类函数
        System.out.println(name+"发出汪汪叫声");
    }
    public void printname(){
        System.out.println("动物的名字是:"+name);
    }
}

public class example01 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "萨摩耶";
        dog.printname();
        dog.shout();
    }
}