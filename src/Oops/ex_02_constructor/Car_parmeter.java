package Oops.ex_02_constructor;

public class Car_parmeter {
    String name;
    int year;
    String model;
    Car_parmeter(String name_car,int year_car,String model_car){
          this.year=year_car;
          this.name=name_car;
          this.model=model_car;
        System.out.println(this.year);
        System.out.println(this.model);
        System.out.println(this.name);
    }
    Car_parmeter(){
        System.out.println("dc");
    }
}
