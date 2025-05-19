package Oops.AccessSpecfier.Police;

public class Police_01 {
    public String gun;
    private int salary=1000;
   public Police_01(String gun){
        this.gun=gun;
    }
    protected void canishot(){
        System.out.println("yes u can");
    }
//
}
