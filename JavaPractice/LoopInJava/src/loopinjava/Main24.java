package loopinjava;

import java.util.Scanner;

public class Main24 {

    public static void main(String[] args) {

        int dividend, divisor, remainder = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Find HCF (GCD) of two numbers.\n");

        System.out.print("Enter first number: ");
        dividend = input.nextInt();

        System.out.print("Enter second number: ");
        divisor = input.nextInt();

        while (remainder != 0) {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.print("GCD: " + dividend + "\n");
    }
}
