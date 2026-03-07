package InnerClass;

class OuterClass2{
    static int val = 10;
    String name = "Amit Shah";

    class InnerClass{
        public void getName(){
            System.out.println("Name : " + name);
        }
        public void getVal(){
            System.out.println("Value : " + val);
        }
        public void execute(){
            System.out.println("Inner class is executed");
        }
    }
    // public void execute(){
    //     InnerClass obj = new InnerClass();
    //     obj.execute();
    //     System.out.println("Outer Class executed");
    // }
}


public class NonStaticInner {
    public static void main(String[] args) {
        // here the inner class is non static so we need an instance of the outer class to make an 
        // object of the inner class
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass obj = outer.new InnerClass(); 
        obj.execute();
        // outer.execute();
        obj.getName();
        obj.getVal();
    }
}
