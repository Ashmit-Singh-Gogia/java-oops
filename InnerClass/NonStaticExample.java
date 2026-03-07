package InnerClass;

class Out{
    private int num;
    static int count;
    Out(int num){
        this.num = num;
    }
    Out(){}
    void execute1(){
        System.out.println("Outer class executed");
    }
    class In{
        int number;
        static int c;
        In(int number){
            System.out.println(num);
            this.number = number;
        }
        void execute(){
            execute1();
            System.out.println("inner class executed");
        }
    }
}


public class NonStaticExample {
    public static void main(String[] args) {
        Out outer = new Out();
        Out.In obj = outer.new In(12);
        obj.execute();
    }
}
