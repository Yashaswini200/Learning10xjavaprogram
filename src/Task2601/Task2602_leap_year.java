package Task2601;

import java.util.Scanner;

public class Task2602_leap_year {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the year");
        int n=a.nextInt();
        if(n%4==0 && n % 100 != 0|| n % 400 == 0) {

                    System.out.println(n + "  is leap year");
                } else {
                    System.out.println(n + " is not leap year");
                }

    }
}
