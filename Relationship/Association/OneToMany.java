package Relationship.Association;

import java.util.ArrayList;
import java.util.List;

class Students{
    private String name;
    private String id;
    Students(String name , String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}

class College{
    private String name;
    private List<Students> students;

    College(String name){
        this.name = name;
        students = new ArrayList<>();
    }
    void addStudent(Students student){
        students.add(student);
    }
    void displayAllStudents(){
        for(int i=0; i<students.size(); i++){
            System.out.println("Name : " + students.get(i).getName() + " | Id : " + students.get(i).getId());
        }
    }
}

public class OneToMany {
    public static void main(String[] args) {
        Students s1 = new Students("Riya","1");
        Students s2 = new Students("Ashmit","2");
        Students s3 = new Students("Siddhart", "3");
        College c1 = new College("Chitkara Univeristy");
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.displayAllStudents();
    }   
}
