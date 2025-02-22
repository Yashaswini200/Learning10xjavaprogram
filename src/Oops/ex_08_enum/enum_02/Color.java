package Oops.ex_08_enum.enum_02;

public enum Color {
    Red("#577"),
    blue("#578"),
    pink("8543");


private  String hexcode1;
    Color(String hexcode) {
        this.hexcode1=hexcode;
    }
    String gethexcod(){
    return hexcode1;
    }
}
