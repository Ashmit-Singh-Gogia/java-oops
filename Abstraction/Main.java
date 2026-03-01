package Abstraction;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son(21);
        son.career("SDE");
        son.partner("Modiji", 102);
        System.out.println(son.age);
    }
}
