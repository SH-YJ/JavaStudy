package com.company.chapter04;

import java.awt.*;
import java.util.Scanner;

class Animal1{ //父类
    String name;
    private String color;
    void shout(){
        System.out .println(name+"发出叫声");
    }
    void show(){
        System.out.println("动物的颜色是:"+color);
    }
    public void setColor(String color){
        this.color = color;
    }
}
//继承animal类
class Dog1 extends Animal1 {  //子类
    void shout(){
        super.shout(); //super访问父类的成员方法
    }
    void show(){
        super.show();
    }
    public void printname(){
        System.out.println("动物的名字是:"+name);
    }
}

public class example03 {

    public static void main(String[] args){
//        Dog1 dog = new Dog1();
//        dog.name = "萨摩耶";
//        dog.setColor("白色");
//        dog.printname();
//        dog.shout();
//        dog.show();
        char [] i = new char[26];
        i[0] = 'a';
        for (int j = 1;j<26;j++){
            i[j] = (char) (i[j-1]+1);
        }
        for (char na: i){
            System.out.println(na);
        }
    }
}
