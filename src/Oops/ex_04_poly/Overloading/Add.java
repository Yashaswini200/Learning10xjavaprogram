package Oops.ex_04_poly.Overloading;

public class Add {
    Add(int a){
        System.out.println(a +" is one");
    }
    Add(int a,int b){
        System.out.println((a+b)+" is two");
    }
    Add(int a,int b,int c){
        System.out.println((a+b+c)+" is three");
    }
}
