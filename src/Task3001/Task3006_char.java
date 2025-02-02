package Task3001;

import java.util.Scanner;

public class Task3006_char {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter one character");
        String n=a.nextLine();
        if(n.length()==1){

            char ch=n.charAt(0);
            ch=Character.toLowerCase(ch);
            if(ch>='a' && ch<='z'){
                System.out.println("it is character");
            }else{
                System.out.println("not character");
            }
        }else{
                System.out.println("enter one character");
            }

    }
}
