package Task3001;

import java.util.Scanner;

public class Task3008_bank {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        int withdraw=a.nextInt();
        int balance=10000;
        if(withdraw>0){
            if(withdraw%100==0 && withdraw<=balance){
                balance-=withdraw;
                System.out.println(balance+" is balance amount");
            }else{
                System.out.println("enter the correct amount for withdraw");
            }
        }

    }


}
