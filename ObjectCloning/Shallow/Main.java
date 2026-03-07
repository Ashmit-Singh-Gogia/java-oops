package ObjectCloning.Shallow;

class Passport{
    String passportNumber;
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
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
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Passport passport = new Passport("2e23h3u23i");
        Student s1 = new Student("Vikas", passport);
        Student clonedStudent = (Student) s1.clone();
        System.out.println(s1.name + " " + s1.passport.passportNumber);
        System.out.println(clonedStudent.name + " " + clonedStudent.passport.passportNumber);

        System.out.println("////////////////////////////////////////////////////////////");
        // modify
        System.out.println("Making some modifications in cloned Object attribute / field");

        clonedStudent.name = "Rahul";
        
        System.out.println("Original object name : " + s1.name);
        System.out.println("Cloned Object named after modification : " + clonedStudent.name);


        System.out.println("////////////////////////////////////////////////////////////");
        // modifying the reference type attributes now
        System.out.println("Making some modifications in cloned Object attribute / field which are references");

        clonedStudent.passport.passportNumber = "Blah Blah";

        System.out.println("Original : " + s1.passport.passportNumber);
        System.out.println("Cloned after Modification : " + clonedStudent.passport.passportNumber);
        
        System.out.println("////////////////////////////////////////////////////////////");
        // This happened (Changing name did not change for original but changing a reference type attribute changed for both) why ?
        // Because When cloning (Shallow) then attricutes are copied but the attricutes which are reference to other objects
        // Only their references are copied and hence the changes appear at both the objects
    }
}

