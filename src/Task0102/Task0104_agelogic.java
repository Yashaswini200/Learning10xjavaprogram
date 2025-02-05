package Task0102;

import java.util.Scanner;

public class Task0104_agelogic {


        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("Enter the age:");
            int age = a.nextInt();

            if (age <= 0) {
                System.out.println("Enter a correct age");
            } else if (age <= 12) {
                System.out.println("Child");
            } else if (age <= 19) {
                System.out.println("Teenager");
            } else if (age <= 64) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior Citizen");
            }

            a.close();
        }
    }


