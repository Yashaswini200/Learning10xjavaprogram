package Task0702.forloop;

import java.util.Scanner;

public class Task0704_fact {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);

        System.out.println("enter the number");
        int n=a.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;

        }
        System.out.println(fact);
    }
}
