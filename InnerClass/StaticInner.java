package InnerClass;

class OuterClass {
    static int size = 100;
    String name = "Modi Ji";
    
    static class InnerClass{
        public void execute(){
            System.out.println("Inner class is executed");
        }
        public void getSize(){
            System.out.println("Size is : " + size);
        }
        public void getName(){
            OuterClass obj = new OuterClass();
            System.out.println("Name is : " + obj.name);
        }
    }
    void execute(){
        System.out.println("Outer Class executed");
    }
}


public class StaticInner {
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.execute();
        obj.getName();
        OuterClass OuterObj = new OuterClass();
        OuterObj.execute();
    }
}
