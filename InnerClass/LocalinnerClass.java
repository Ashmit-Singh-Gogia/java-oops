package InnerClass;

import java.rmi.StubNotFoundException;

class Boy{
    void execute(){
        int num = 12;
        class Student{
            String name = "Ashmit";
            void work(){
                System.out.println("Student " + name + " is working");
            }
        }
        new Student().work();
    }
}

public class LocalinnerClass {
    public static void main(String[] args) {
        Boy b = new Boy();
        b.execute();
    }
}
