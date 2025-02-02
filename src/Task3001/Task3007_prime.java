package Task3001;

import java.util.Scanner;

public class Task3007_prime {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter number");
        int n=a.nextInt();
        if(n==2 || n%2!=0){
            System.out.println("it is prime");
        }else{
            System.out.println("not prime");

        }
    }
}
