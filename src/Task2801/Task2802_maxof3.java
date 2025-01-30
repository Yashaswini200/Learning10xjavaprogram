package Task2801;

import java.util.Scanner;

public class Task2802_maxof3 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n1=a.nextInt();
        int n2=a.nextInt();
        int n3=a.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is greater "+ n1);
        } else if (n2>n3) {
            System.out.println("n2 is greater "+n2);

        }else {
            System.out.println("n3 is greater "+n3);
        }
    }
}
