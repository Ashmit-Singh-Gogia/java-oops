package Abstraction;
interface Camera{
    void takePhoto();
    default void record(){
        System.out.println("Camera Recording");
    }
}

interface microphone{
    default void record(){
        System.out.println("Microphone recording");
    }
    default void listen(){
        System.out.println("Microphone listening");
    }
}

class DigitalCamera implements Camera{
    public void takePhoto(){
        System.out.println("Digital camera Photo");
    }
}

class MobilePhone implements Camera , microphone{
    public void takePhoto(){
        System.out.println("Mobile phone photo");
    }

    // Now since the 2 implementations have a common signature record method we have to define a one for this particularly
    // so that java doesnot get confused oicking one
    public void record(){
        microphone.super.record();
        // or 
        Camera.super.record();
        // or
        System.out.println("Mobile phone recording");
    }
}


public class Interfaces3 {
    public static void main(String[] args) {
        Camera d1 = new DigitalCamera();
        d1.record();
        Camera d2 = new MobilePhone();
        d2.record();
        MobilePhone d3 = new MobilePhone();
        d3.listen();
    }
}
