package Task2901;

import java.util.Scanner;

public class Task2903_maxof2 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter n1");
        int n1=a.nextInt();
        System.out.println("enter n2");
        int n2=a.nextInt();
        if(n1>n2){
            System.out.println(n1+" is greater");
        }else{
            System.out.println(n2+" is greater");
        }
    }
}
