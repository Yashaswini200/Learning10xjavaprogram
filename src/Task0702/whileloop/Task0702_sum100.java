package Task0702.whileloop;

public class Task0702_sum100 {
    public static void main(String[] args){
        int sum=0;
        int i=0;
        while (i <= 100) {
            sum+=i;
            i++;
        }
        System.out.println(" sum of 100 is "+sum);
    }
}
