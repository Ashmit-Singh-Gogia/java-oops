package Abstraction;
interface CarInterface{
    static final int value = 0;  // even by default the variables are not instance in interfaces
    // They are static final 
    public void start();
    public void numberOfGears();
    default void airBags(){
        System.out.println("Car has 5 air bags");
    }
    // static here means that there is no need to create an object of it
    static void printVehicleType(){
        System.out.println("This is a Car");
    }
}

class ManualCar implements CarInterface{
    public void start(){
        CarInterface.printVehicleType();
        System.out.println("Manual car starts");
    }
    public void numberOfGears(){
        System.out.println("Manual car has 6 gears");
    }
    public void airBags(){
        System.out.println("Manual car has 6 airbags");
    }
}


public class Interfaces{
    public static void main(String[] args) {
        CarInterface car = new ManualCar();
        car.start();
        car.numberOfGears();
        car.airBags();
        System.out.println(CarInterface.value);
    }
}