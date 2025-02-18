package Oops.ex_01_classandobj;

public class Lab_01 {
    public static void main(String[] args) {
        Student yashu=new Student();
        yashu.name="yashaswini";
        yashu.salary=1000000;
        yashu.details();
        yashu.desalary();

        Student liki=new Student();
        liki.name="likitha";
        liki.salary=700000;
        liki.details();
        liki.desalary();
    }
}
