package Oops.AccessSpecfier.Theif;


import Oops.AccessSpecfier.Police.Police_01;

public class Theif_02 {
    public static void main(String[] args) {
        Police_01 cop=new Police_01("two");
        System.out.println(cop.gun);
//        cop.canishot(); it can't because this function is proceted can accessed within that folder

    }
}
