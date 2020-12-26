package loopinjava;

import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {

        int number, digit, revNumber = 0, lastZero = 0;

        Scanner input = new Scanner(System.in);

        /**
         * Variable declaration
         * -----------------------
         * 'number' is input number.
         * 'digit' is every single digit. i.e number = 123, digit = 1, 2 and 3.
         * 'revNumber' is numbers reverse form.
         * 'lastZero' means if the numbers last digit is 0 (ZERO).
         */
        System.out.println("Enter a number and print it in words.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 10 == 0) {
            lastZero = 1;
        }
        while (number >= 10) {
            
            digit = number % 10;
            revNumber = (revNumber * 10) + digit;
            number = (number / 10);
        }
        revNumber = (revNumber * 10) + number;
        number = revNumber;

        System.out.print("Words: ");
        while (number != 0) {
            
            digit = number % 10;
            number = number / 10;
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        if(lastZero == 1)
        {
            System.out.print("Zero");
        }
        System.out.println();
    }
}
