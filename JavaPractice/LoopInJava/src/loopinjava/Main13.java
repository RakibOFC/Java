package loopinjava;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {

        int digit, number, revNumber = 0;
        int swappedNumber, temp, firstDigit, lastDigit;

        Scanner input = new Scanner(System.in);

        System.out.println("Swap first and last digits of a number.\n");

        System.out.print("Enter number: ");
        number = input.nextInt();

        /** Reverse Number */
        lastDigit = number % 10;
        while (number >= 10) {
            digit = (number % 10);
            number = (number / 10);
            revNumber = (10 * revNumber) + digit;
        }
        firstDigit = number;
        digit = (number % 10);
        revNumber = ((10 * revNumber) + digit);
        number = revNumber; // Reverse number end

        /**
         * Again reverse the number but ignore first and last digits
         */
        swappedNumber = lastDigit; /// Ignore first digits, it swapped!

        number = number / 10;
        while (number >= 10) {
            
            digit = (number % 10);
            number = number / 10;
            swappedNumber = ((10 * swappedNumber) + digit);
        }
        swappedNumber = ((10 * swappedNumber) + firstDigit); /// Ignore last digits, it swapped!.
        System.out.println("Swapped Number: " + swappedNumber);
    }
}