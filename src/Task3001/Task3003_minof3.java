package Task3001;

import java.util.Scanner;

public class Task3003_minof3 {
    public static void main(String[] agrs) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = a.nextInt();
        System.out.println("enter n2");
        int n2 = a.nextInt();
        System.out.println("enter n3");
        int n3 = a.nextInt();
        if(n1<n2 && n1<n3){
            System.out.println(n1+ " n1 is smallest");
        }else if(n2<n3){
            System.out.println(n2+ " n2 is smallest");
        }else{
            System.out.println(n3+" n3 is smallest");
        }
    }
}
