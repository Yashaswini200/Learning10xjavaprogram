package Task3101;

import java.util.Scanner;

public class Task3106_travel {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter age");
        int age=a.nextInt();


            if(age>=18) {
                System.out.println("enter the visa status");
                boolean visa_status = a.nextBoolean();
                if (visa_status) {
                    System.out.println("person can travel");
                } else {
                    System.out.println("can not travel");

                }
            }else{
        System.out.println("ur age is not valid");}
        }
    }

