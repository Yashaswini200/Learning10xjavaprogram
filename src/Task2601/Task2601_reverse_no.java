package Task2601;

import java.util.Scanner;

public class Task2601_reverse_no {
    public static  void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int rev=0;
        while(n>0){
            int c=n%10;
            rev=rev*10+c;
            n=n/10;
        }
        System.out.println(rev);

    }
}
