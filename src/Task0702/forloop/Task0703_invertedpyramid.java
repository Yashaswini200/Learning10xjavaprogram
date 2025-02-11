package Task0702.forloop;

public class Task0703_invertedpyramid {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");

                }
                System.out.println(" ");
            }
        }
    }
}




