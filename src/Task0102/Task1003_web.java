package Task0102;

import java.util.Scanner;

public class Task1003_web {




        public  static void main(String[] args){
            Scanner a=new Scanner(System.in);
            System.out.println("enter the website");
            String url=a.nextLine();
            if(url.endsWith(".com")){
                System.out.println("commercial website");
            } else if (url.endsWith(".org")){
                System.out.println(" non profit organization");
            } else if (url.endsWith(".edu")) {
                System.out.println(" educational institution");
            } else if (url.endsWith(".gov")) {
                System.out.println(" government website");
            } else if (url.endsWith(".net")) {
                System.out.println(" network related website");
            } else if (url.endsWith(".info")) {
                System.out.println(" informational website");
            }else{
                System.out.println(" unkonw or other types of websites");
            }
        }
    }


