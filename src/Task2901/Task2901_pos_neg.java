package Task2901;

import java.util.Scanner;

public class Task2901_pos_neg {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter number");
        int n=a.nextInt();
        if(n<0){
            System.out.println(n+" is negative");
        }
        else{
            System.out.println(n+" is postive");
        }
    }
}
