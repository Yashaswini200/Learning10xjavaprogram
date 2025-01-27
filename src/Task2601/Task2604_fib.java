package Task2601;

import java.util.Scanner;

public class Task2604_fib {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int n=a.nextInt();
        fib(n);
    }
    static void fib(int n){
        int sum=0;

        if(n==0){
            System.out.println(n);
        } else if (n==1) {
            System.out.println(n);

        }
        int b=1;
        int a=0;
        System.out.println(a);
        System.out.println(b);

        for(int i=1;i<n-1;i++){
           int  c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }


    }
}
