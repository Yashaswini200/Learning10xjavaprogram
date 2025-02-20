package Oops.ex_03_inhertance.Multilevel;

public class Lab_05 {
    public static void main(String[] args) {
        Son Jhon=new Son();
        System.out.println("son");
        Jhon.bhk3();
        Jhon.bhk2();
        Jhon.bhk1();
        Jhon.plot();
        System.out.println("father");
        Father das=new Father();
        das.bhk2();
        das.bhk1();
        das.plot();
        System.out.println("grandfather");
        GrandFather mohan=new GrandFather();
        mohan.bhk1();
        mohan.plot();


//        Son ramesh=new GrandFather(); can't be done
//        Son ramesh=new Father(); can't be done
//        GrandFather ramesh=new Father(); can be don


    }
}
