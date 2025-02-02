package Task3101;

import java.util.Scanner;

public class Task3103_bill {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the units");
        int unit=a.nextInt();
        double bill=0;
        if(unit==100){
           bill=unit*0.5;
        } else if (unit>100 && unit<=200) {
           bill=unit*0.75;
        } else if (unit>200 && unit <=300) {
             bill =unit*1.20;
        } else if (unit>300) {
           bill=unit*1.5;
        }else {
            System.out.println("enter the correct unit");
        }
        System.out.println(bill+" after calculation");
    }
}
