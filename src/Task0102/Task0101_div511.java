package Task0102;

import java.util.Scanner;

public class Task0101_div511 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number");
        int n=a.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println(n+" is divisible by 5 and 11");
        }else {
            System.out.println(n+" is not divisible by 5 and 11");
        }
    }
}
