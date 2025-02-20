package Oops.ex04_encapsulation;

public class Lab_08 {
    public static void main(String[] args) {
        Icicbank liki=new Icicbank("sbi",100);

        System.out.println(liki.getBal());
boolean isCashier=true;
        liki.setBal(200,isCashier);
        System.out.println(liki.getBal());
    }
}
