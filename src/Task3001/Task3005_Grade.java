package Task3001;

import java.util.Scanner;

public class Task3005_Grade {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the marks");
            int m=a.nextInt();
                if(m>0 &&m<=100){
                if(m>=90 && m<=100 ){
                    System.out.println("A grade");
                }
                else if(m>=80 && m<=89){
                    System.out.println("B grade");
                }        else if(m>=70 && m<=79){
                    System.out.println("C grade");
                }        else if(m>=60 && m<=69){
                    System.out.println("D grade");
                }
                else if(m>=50 && m<=59){
                    System.out.println("E grade");
                }else{
                    System.out.println("fail");
                }
            }
        }

    }

