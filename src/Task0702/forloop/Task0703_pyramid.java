package Task0702.forloop;

public class Task0703_pyramid {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            if(i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
