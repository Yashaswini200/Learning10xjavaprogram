package Task19;

public class Task1902_ternaryoperator {
    public static void main(String[] args) {
        int n1=9;
        int n2=4;
        int n3=15;
        int result=(n1>=n2 && n1>=n3) ? n1: (n2>n3) ? n2:n3;
        System.out.println(result);
    }
}
