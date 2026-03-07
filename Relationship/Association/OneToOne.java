package Relationship.Association;

class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;
    Student(String name , Passport passport){
        this.name = name;
        this.passport = passport;
    }
    public void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Passport : " + passport.getPassportNumber());
    }
}

public class OneToOne {
    public static void main(String[] args) {
        Passport passport = new Passport("9949293949292");
        Student student = new Student("Riya", passport);
        student.displayDetails();
    }
}
