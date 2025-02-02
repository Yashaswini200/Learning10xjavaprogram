package Task3001;

import java.util.Scanner;

public class Task3009_triangle {
   public static void main(String[] args){
       Scanner a=new Scanner(System.in);
       System.out.println("enter n1");
       int n1=a.nextInt();
       System.out.println("enter n2");
       int n2=a.nextInt();
       System.out.println("enter n3");
       int n3=a.nextInt();
       if(n1==n2 && n1==n3){
           System.out.println("equalitral triangle");
       } else if (n1!=n2 && n1!=n3 && n2!=n3) {
           System.out.println("three side are equl");

       }else {
           System.out.println("two sides are different");
       }

   }
}
