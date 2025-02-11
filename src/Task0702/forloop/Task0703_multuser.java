package Task0702.forloop;

import java.util.Scanner;

public class Task0703_multuser {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int n=a.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
}
