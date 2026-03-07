package Relationship.Composition;

class Passport{
    String passport;
    Passport(String pass){
        this.passport = pass;
    }
}
class Person{
    String name;
    Passport passport;

    Person(String name , String passport){
        this.name = name;
        this.passport = new Passport(passport);
    }
    void displayDetails(){
        System.out.println("Person : " + name + " has Passport : " + passport.passport);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Raj", "123");
        p1.displayDetails();
    }
}
