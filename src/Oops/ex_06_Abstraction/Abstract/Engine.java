package Oops.ex_06_Abstraction.Abstract;

public class Engine extends Wragon {
     @Override
     void startengine() {
         System.out.println("start engine");
     }
     void drive(){
         startengine();
         System.out.println("i am driving");
         stopengine();
     }
 }
