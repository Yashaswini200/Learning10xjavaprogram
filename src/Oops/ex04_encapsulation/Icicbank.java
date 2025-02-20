package Oops.ex04_encapsulation;

public class Icicbank {
    private String name;
    private int bal;

    Icicbank(String bankname,int bankbal){
        this.name=bankname;
        this.bal=bankbal;
    }
    void setName(String bankname){
        this.name=bankname;
    }
    String getName(){
        return name;
    }
    int getBal(){
        return bal;
    }
    void setBal(int bal,boolean isCashier){
        if(isCashier){
           this.bal=bal;
        }else{
            System.out.println("enter proper");
        }

    }

}
