package Abstraction;

public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
    }
    abstract void career(String name);
    abstract void partner(String name , int age);
}
class Son extends Parent{
    Son(int age){
        super(age);
        // this.age = age;
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner(String name , int age){
        System.out.println("I love " + name + " and she is : " + age + " years old");
    }
}
