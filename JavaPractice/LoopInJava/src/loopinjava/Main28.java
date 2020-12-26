package loopinjava;

import java.util.Scanner;

public class Main28 {

    public static void main(String[] args) {

        int i, j, number, sum = 0, isPrime;

        Scanner input = new Scanner(System.in);

        System.out.println("Find sum of all prime numbers between 1 to n.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (i = 1; i <= number; i++) {
            
            isPrime = 1;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = 0;
                }
            }
            if (isPrime == 1) {
                if (i == 1) {
                    /**
                     * 1 is not a prime number
                     */
                } else {
                    System.out.println(i);
                    sum += i; // sum = sum + i;
                }
            }
        }
        System.out.println("Sum of all prime numbers between 1 to " + number + " = " + sum);
    }
}