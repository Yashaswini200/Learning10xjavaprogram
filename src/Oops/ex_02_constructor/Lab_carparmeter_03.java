package Oops.ex_02_constructor;

import java.util.Scanner;

public class Lab_carparmeter_03 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter name");
        String modelname= a.nextLine();
        Car_parmeter tesko=new Car_parmeter(modelname,209,"9h8k");
tesko.name="hi";
tesko.model="6y87";
tesko.year=2001;
    }
}
