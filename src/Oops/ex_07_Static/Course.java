package Oops.ex_07_Static;

public class Course {

    String name;
    int phone_no;
    static String course_name="atb";
    Course(String c_name,int c_phone){
       this.name=c_name;
       this.phone_no=c_phone;

    }
    Course(){
        System.out.println("one const");
    }
    void c1_course(){
        System.out.println(this.name+ " "+this.phone_no+" "+course_name);
    }
    static void m1(){
        System.out.println("i am m1");
    }
    static{
        System.out.println("i am yashu");
    }
}
