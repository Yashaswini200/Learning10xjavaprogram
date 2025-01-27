package Task2601;

import java.util.Scanner;

public class Task2603_fact {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int n=a.nextInt();
        fact(n);
    }
    static void fact(int n){
int c=1;
        for(int i=1;i<=n;i++) {
     c*=i;
        }
        System.out.println(c);
    }
}
