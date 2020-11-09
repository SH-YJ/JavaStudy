package com.company.chapter06;

import java.util.HashSet;

class Student{
    private final String id;
    private final String name;
    public Student (String id, String name){
        this.id = id;
        this.name = name;
    }
    /**重写toString()方法*/
    @Override
    public String toString(){
        return id + ":" + name;
    }
    /**重写hashCode 方法*/
    @Override
    public int hashCode(){
        return id.hashCode();
    }
    /**重写equals方法*/
    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Student)) {return false;}
        Student student = (Student) o;
        return this.id.equals(student.id);
    }

}

public class Example09 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("1","Jack");
        Student s2 = new Student("2","Eve");
        Student s3 = new Student("1","Rose");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
