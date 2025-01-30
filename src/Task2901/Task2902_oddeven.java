package Task2901;

import java.util.Scanner;

public class Task2902_oddeven {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int n=a.nextInt();
        if(n%2==0){
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+ " is a odd number");
        }
    }

}
