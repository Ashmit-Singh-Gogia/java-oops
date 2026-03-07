package ObjectCloning.Deep;

class Passport implements Cloneable{
    String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Student implements Cloneable{
    String name;
    Passport passport;
    Student(String name , Passport passport){
        this.name = name;
        this.passport = passport;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Student st = (Student) super.clone();
        st.passport = (Passport) passport.clone();
        return st;
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Passport passport = new Passport("dfjkwncece");
        Student s1 = new Student("Aditya", passport);
        Student clonedStudent = (Student)s1.clone();
        System.out.println(s1.name + " " + s1.passport.passportNumber);
        System.out.println(clonedStudent.name + " " + clonedStudent.passport.passportNumber);

        System.out.println("//////////Modifications/////////////");

        clonedStudent.passport.passportNumber = "Blah Blah";

        System.out.println(s1.name + " " + s1.passport.passportNumber);
        System.out.println(clonedStudent.name + " " + clonedStudent.passport.passportNumber);
    }
}
