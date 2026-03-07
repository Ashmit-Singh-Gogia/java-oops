package Relationship.Association;

import java.util.ArrayList;
import java.util.List;

class Customer{
    private String name;
    private List<Course> courses;
    Customer(String name){
        this.name = name;
        courses = new ArrayList<>();
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public void displayDetails(){
        System.out.printf(name + " has following Courses : \n");
        for(int i=0; i<courses.size(); i++){
            System.out.println("Course Name : " + courses.get(i).getName());
        }
    }
    public String getName(){
        return name;
    }
}

class Course{
    private String name;
    private List<Customer> customers;
    Course(String name){
        this.name = name;
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void displayDetails(){
        System.out.printf("Buyer of Course : " + name + " are : \n");
        for(int i=0; i<customers.size(); i++){
            System.out.println("Customer Name : " + customers.get(i).getName());
        }
    }
    public String getName(){
        return name;
    }
}

public class ManyToMany {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rakesh");
        Customer c2 = new Customer("Manish");
        Customer c3 = new Customer("Simu");
        Course course1 = new Course("Python");
        Course course2 = new Course("Java");
        course1.addCustomer(c1);
        course1.addCustomer(c2);
        course2.addCustomer(c3);
        course1.displayDetails();
        course2.displayDetails();
        c1.addCourse(course1);
        c2.addCourse(course1);
        c3.addCourse(course2);
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
