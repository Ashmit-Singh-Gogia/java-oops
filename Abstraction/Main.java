package Abstraction;

interface CarInterface {
    public void start();
}
interface Person{
    public void start();
    public void speak();
}
class Dealer implements CarInterface , Person{
    public void start(){
        System.out.println("Dealer start");
    }
    public void speak(){
        System.out.println("Dealer speaks");       
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}
