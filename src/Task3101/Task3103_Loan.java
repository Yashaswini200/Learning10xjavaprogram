package Task3101;

import java.util.Scanner;

public class Task3103_Loan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        double salary = a.nextDouble();
        int credit_score = a.nextInt();
        if (age <= 0 || salary <= 0 || credit_score <= 0) {
            System.out.println("enter a positive age,salary and credit score");
        }
        else if (age >= 18 && age <= 80) {
                if (salary >= 30000) {
                    if (credit_score >= 650 && credit_score <= 850) {
                        System.out.println("you are eligible for a loan");
                    }
                    else {
                        System.out.println("enter correct credit score");
                    }
                }else {
                    System.out.println("enter correct salary");
                }
            } else {
                System.out.println("enter correct age");
            }
        }
    }
