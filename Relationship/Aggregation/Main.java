package Relationship.Aggregation;

class Passport{
    String passport;
    Passport(String pass){
        this.passport = pass;
    }
}
class Person{
    String name;
    Passport passport;

    Person(String name , Passport passport){
        this.name = name;
        this.passport = passport;
    }
    void displayDetails(){
        System.out.println("Person : " + name + " has Passport : " + passport.passport);
    }
}
public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("13o2328p");
        Person p1 = new Person("Rishabh", passport);
        p1.displayDetails();
    }
}
