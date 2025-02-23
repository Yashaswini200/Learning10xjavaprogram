package Oops.ex_06_Abstraction.Interface;

public interface Engine {
    void start();
    void stop();
    default  void run(){
        System.out.println("i am going");
    }
}
