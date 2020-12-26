package loopinjava;

import java.util.Scanner;

public class Main29 {

    public static void main(String[] args) {

        int i, j, number, isPrime;

        Scanner input = new Scanner(System.in);

        System.out.println("Find all prime factors of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Prime factors of " + number + ": ");
        for (i = 1; i <= number; i++) {

            if (number % i == 0) {
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
                        System.out.print(i + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}