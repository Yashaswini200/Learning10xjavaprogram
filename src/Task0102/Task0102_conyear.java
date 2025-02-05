package Task0102;

import java.util.Scanner;

public class Task0102_conyear {
    public  static  void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the days");
        int days=a.nextInt();
        if(days>=0){
            int year =days/365;
            int months=(days-(year*365))/30;
            int day=(days-(year*365))-(months*30);
            System.out.println(year+" year "+ months+" months " + day+" day");
        }else {
            System.out.println("enter proper days");
        }
    }
}
