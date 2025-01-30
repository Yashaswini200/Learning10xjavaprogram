package Task2901;

import java.util.Scanner;

public class Task2904_char_vowel_not {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter a character");
        String n=a.next();
        if(n.length()==1){
            char ch=n.charAt(0);
           ch=Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("is vowel");
            }else {
                System.out.println("is consoant");
            }

        }else {
            System.out.println("enter one character");
        }
    }
}
