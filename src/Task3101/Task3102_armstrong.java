package Task3101;

import java.util.Scanner;
import  java.lang.Math;

public class Task3102_armstrong {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
int b=count(n);
int m=arm(n,b);
        if(n==m){
            System.out.println(n+" is armstrong");
        }
        else {
            System.out.println(n+"is not armstrong");
        }
    }
    static int  c=0;
    public static int count(int n){
        while(n!=0){
            n=n/10;
            c++;
        }
       return  c;
    }
    public static int arm(int n,int b){
        int o=0;
        while(n!=0) {
            int digit = n % 10;
           int arm_power = (int) Math.pow(digit, b);
           n=n/10;
           o+=arm_power;
        } return o;
    }
}
