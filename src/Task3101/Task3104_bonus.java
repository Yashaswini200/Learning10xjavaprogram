package Task3101;

import java.util.Scanner;

public class Task3104_bonus {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the salary");
        double salary=a.nextDouble();
        System.out.println("enter the year of experienc");
        double year=a.nextDouble();
        if(year<1) {
            System.out.println("no bonus");
        } else if (year>=1 && year<=3) {
            salary+=(salary*5)/100;
            System.out.println("bonus is %5 "+salary);
        } else if (year>=4 && year<=6) {
            salary+=(salary*10)/100;
            System.out.println("bonus is %10 "+salary);
        }else {
            salary+=(salary*15)/100;
            System.out.println("bonus is %15 "+salary);
        }

    }
}
