

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        //example:01
//        int a=10;
//        if(a==4){
//            System.out.println("four");
//        }else{
//            System.out.println("not four");
//        }

        //example:02
//        Scanner a=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=a.nextInt();
//        if(n%2==0){
//            System.out.println("even");
//
//        }else{
//            System.out.println("odd");
//        }

        //example:03
        Scanner a=new Scanner(System.in);
        System.out.println("enter the side1");
        double side1=a.nextDouble();
        System.out.println("enter the side2");
        double side2=a.nextDouble();
        System.out.println("enter the side3");
        double side3=a.nextDouble();
        if(side1>=0 || side2>0 || side3>0){
            System.out.println("sides should not be negative");
        }else {
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("equal triangle");

            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("isoscles triangle");

            } else {
                System.out.println("scalene triangle");
            }
        }
    }
}
