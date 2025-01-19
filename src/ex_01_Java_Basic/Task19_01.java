package ex_01_Java_Basic;

public class Task19_01 {
    public static void main(String[] args) {
        int n=82;
        String result= (n>=90 && n<=100) ? "A grade": (n>=80 && n<=89)? "B grade" :
                       (n>=70 && n<=79)  ? "C grade": (n>=60 && n<=69)? "D grade" :
                                 (n>=0 && n<=59) ? "F grade":"invalid";
        System.out.println(result);
    }
}
