package loopinjava;

import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {

        int i, j, number;

        Scanner input = new Scanner(System.in);

        System.out.println("Print all Prime numbers between 1 to n.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Prime numbers are:");
        for (i = 1; i <= number; i++) {
            
            int isPrime = 1;
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
                }
            }
        }
    }
}
