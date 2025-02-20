package Oops.AccessSpecfier.Police;

public class Police_02 {
    public static void main(String[] args) {
        Police_01 cop=new Police_01("one");
        System.out.println(cop.gun);
        cop.canishot();
//        System.out.println(cop.salary); i can't because it is private can only access in that function
    }
}
