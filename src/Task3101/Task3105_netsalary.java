package Task3101;

import java.util.Scanner;

public class Task3105_netsalary {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the basic pay");
        double basic_pay=a.nextInt();
        System.out.println("enter percentage of hra");
        double hra_per=a.nextDouble();
        System.out.println("enter percentage of da");
      double da_per=a.nextInt();
        System.out.println("enter the deduction");
        double deduc=a.nextInt();
        System.out.println("enter the tax rate");
        double tax=a.nextInt();
        double hra=  (basic_pay*(hra_per/100));
        double da=  (basic_pay*(da_per/100));
        double gross_salary=basic_pay+hra+da;
        double annual_income=gross_salary*12;
        double taxableIncome=(annual_income-deduc);
        double tax_deduc = (tax/ 100) * taxableIncome;
        System.out.println(basic_pay+" is basic pay");
        System.out.println(hra+" is hra");
        System.out.println(da+" is da");
        System.out.println(tax_deduc+" is tax deductions");
    }
}
