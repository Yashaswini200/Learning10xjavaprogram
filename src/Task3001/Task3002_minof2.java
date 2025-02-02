package Task3001;

import java.util.Scanner;

public class Task3002_minof2 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter n1");
        int n1=a.nextInt();
        System.out.println("enter n2");
        int n2=a.nextInt();
        if(n1<n2){
            System.out.println(n1+ " n1 is smallest");
        }else{
            System.out.println(n2+ " n2 is smallest");
        }
    }
}
