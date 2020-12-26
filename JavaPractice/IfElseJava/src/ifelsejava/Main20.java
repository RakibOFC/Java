package ifelsejava;

import java.util.Scanner;

public class Main20 {
    
    public static void main(String[] args) {
        /*
        Calculate salary according to following:
        Basic Salary <= 10000 : HRA = 20%, DA = 80%
        Basic Salary <= 20000 : HRA = 25%, DA = 90%
        Basic Salary > 20000 : HRA = 30%, DA = 95%
         */
        double basicSalary, grossSalary = 0, hra, da;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input basic salary of an employee and calculate its Gross salary.\n");

        System.out.print("Enter employee basic salary: ");
        basicSalary = input.nextDouble();

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.2;
            da = basicSalary * 0.8;
            grossSalary = basicSalary + hra + da;
            
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.9;
            grossSalary = basicSalary + hra + da;
            
        } else if (basicSalary > 20000) {
            hra = basicSalary * 0.3;
            da = basicSalary * 0.95;
            grossSalary = basicSalary + hra + da;
            
        }
        System.out.println("Gross Salary: " + grossSalary);
    }
}