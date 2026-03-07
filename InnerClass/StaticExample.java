package InnerClass;
class OuterExample{
    String name;
    static int count;
    OuterExample(String name){
        this.name = name;
    }
    static class InnerExample{
        int salary;
        static int c;
        InnerExample(int salary){
            this.salary = salary;
            OuterExample.InnerExample.c++;
        }
        static int sum(int a , int b){
            return a+b;
        }
        void execute(){
            System.out.println(new OuterExample("Shankar").name);
            new OuterExample("Ashmit").ex();
            System.out.println("Inner class executed");
        }
    }
    void ex(){
        System.out.println("Outer class executed");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // OuterExample.InnerExample innerObj = new OuterExample.InnerExample(10000);
        // System.out.println(OuterExample.InnerExample.c);
        System.out.println(OuterExample.InnerExample.sum(2,3));
        new OuterExample.InnerExample(0).execute();
    }
}
