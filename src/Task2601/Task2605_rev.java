package Task2601;

import java.util.Scanner;

public class Task2605_rev {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=a.nextLine();
        reverse(s);

    }
    static  void reverse(String s){
       for(int i=s.length()-1;i>=0;i--){
           String b= String.valueOf(s.charAt(i));
           System.out.print(b);
       }
    }

}
