package Task19;

public class Task1906_cli02 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int result= a>=b ? a:b;
        System.out.println(result);
    }
}
