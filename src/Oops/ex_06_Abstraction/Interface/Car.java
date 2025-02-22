package Oops.ex_06_Abstraction.Interface;

public class Car implements  Engine,Break{
    @Override
    public void tyre() {
        System.out.println("i am tyre");
    }

    @Override
    public void start() {
        System.out.println("i am start");
    }

    @Override
    public void stop() {
        System.out.println("i am stop");
    }
}
