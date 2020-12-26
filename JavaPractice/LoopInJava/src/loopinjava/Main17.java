package loopinjava;

import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {

        int digit, number, numberClone, revNumber = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is palindrome or not.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        numberClone = number;

        // Reverse Number
        while (number != 0) {
            
            digit = (number % 10);
            number = (number / 10);
            revNumber = (10 * revNumber) + digit;
        } // Reverse number end
        
        if (numberClone == revNumber) {
            
            System.out.println(numberClone + " is palindrome!");
        } else {
            
            System.out.println(numberClone + " is not palindrome.");
        }
    }
}
