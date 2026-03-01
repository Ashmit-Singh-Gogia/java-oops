package Inheritance;

class School{
    private String name;
    School(String name){
        this.name = name;
    }
    void printSchoolName(){
        System.out.println("School Name is : " + name);
    }
    protected void demo(){
        System.out.println("Demo by school");
    }
}

class Student extends School{
    private String name;
    Student(String name){
        super("DFS");
        this.name = name;
    }
    void printStudentName(){
        System.out.println("Student name is : " + name);
    }
    @Override
    public void demo(){
        super.demo();   // Can use super to access the accessible properties or behavior of parent or super-class
        System.out.println("Demo by Student");
    }
}

public class Main{
    public static void main(String[] args) {
        Student st1 = new Student("Riya");
        st1.printSchoolName();
        st1.printStudentName();
        st1.demo();
    }
}