package loopinjava;

import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {

        int n, number, fact = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate factorial of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (n = 1; n <= number; n++) {
            
            fact = fact * n;
        }
        System.out.print("\nFactorial of " + number + " = " + fact + "\n");
    }
}