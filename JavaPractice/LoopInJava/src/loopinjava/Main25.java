package loopinjava;

import java.util.Scanner;

public class Main25 {

    public static void main(String[] args) {

        int dividend, divisor, remainder = 1, lcm, dividendClone, divisorClone;

        Scanner input = new Scanner(System.in);

        System.out.println("Find HCF (GCD) of two numbers.\n");

        System.out.print("Enter first number: ");
        dividend = input.nextInt();

        System.out.print("Enter second number: ");
        divisor = input.nextInt();
        
        dividendClone = dividend;
        divisorClone = divisor;
        
        while (remainder != 0) {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.print("GCD: " + dividend + "\n");
        
        lcm = (dividendClone * divisorClone) / dividend;
 
        System.out.println("LCM: " + lcm + "\n");
    }
}