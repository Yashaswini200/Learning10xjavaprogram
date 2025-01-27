package Task2501;

import java.util.Scanner;
import java.util.SortedMap;

public class Task2403_palidrome {
    public static  void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the n");
        String c=a.nextLine();
        String n=c.toLowerCase();
        boolean b=false;
        for(int i=0;i<n.length()/2;i++){

            if(n.charAt(i)==n.charAt(n.length()-i-1)) {
                b=true;

            }
        }
        if(!b){
            System.out.println("no it is not palidrome");
        }else{
            System.out.println("yes it is palidrome");
        }
    }
}
