package loopinjava;

import java.util.Scanner;

public class Main26 {

    public static void main(String[] args) {

        int n, number, isPrime = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is Prime number or not.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (n = 2; n < number; n++) {
            
            if (number % n == 0) {
                isPrime = 0;
            }
        }
        if (isPrime == 1) {
            
            System.out.println(number + " is prime a number.\n");
            
        } else {
            
            System.out.println(number + " is prime not a number.\n");
        }
    }
}