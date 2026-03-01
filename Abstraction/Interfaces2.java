package Abstraction;

interface Vehicle{
    public void start();
    default void honk(){
        System.out.println("Vehicle is honking");
    }
}
interface Car extends Vehicle {
    public void drive();
    @Override
    default void honk(){
        Vehicle.super.honk();
        System.out.println("Car is honking");
    }
}

class Manual implements Car{
    public void start(){
        System.out.println("Manual car starts");
    }
    public void drive(){
        System.out.println("Manual car drives");
    }
    @Override
    public void honk() {
        Car.super.honk();
        System.out.println("Manual car is honking");
    }
}


public class Interfaces2 {
    public static void main(String[] args) {
        Car car = new Manual();
        car.start();
        car.drive();
        car.honk();

    }
}
