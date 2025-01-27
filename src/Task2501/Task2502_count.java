package Task2501;

import java.util.Locale;
import java.util.Scanner;

public class Task2502_count {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the String");
        String s=a.nextLine();
        String n=s.toLowerCase();

        int count_vowel=0;
        int count_const=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                count_vowel++;
            }else if(c>='a'&& c<='z') {
                count_const++;
            }
        }
        System.out.println("vowel are "+count_vowel);
        System.out.println("consonant are "+count_const);

    }
}
