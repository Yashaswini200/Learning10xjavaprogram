package Task2501;

public class Task2501_if_else {
    public static  void main(String[] args){
        for(int i=0;i<100;i++){

            if(i%3==0 && i%5==0){
                    System.out.println(i+"Fizzbuzz");
            } else if (i%5==0) {
                System.out.println(i+"Buzz");
            } if(i%3==0){
                System.out.println(i+"Fizz");
            }
        }
    }
}
