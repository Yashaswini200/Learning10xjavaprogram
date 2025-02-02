package Task3101;

import java.util.Scanner;

public class Task3101_palidrome_no {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
pali(n);
        if(!pali(n)){
            System.out.println("not palidrome");
        }else{
            System.out.println("is palidrome");
        }
    }
    public static boolean pali(int n){
        int rev=0;
        int c=n;
        while(n!=0) {
            int digit = n % 10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev==c;
    }
}
