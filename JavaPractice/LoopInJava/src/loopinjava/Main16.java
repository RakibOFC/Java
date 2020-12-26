package loopinjava;

import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        int digit, number, revNumber = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and print its reverse.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Reverse Number
        while (number != 0) {
        
            digit = (number % 10);
            number = (number / 10);
            revNumber = (10 * revNumber) + digit;
        }
        // Reverse number end
        
        System.out.println("Reverse Number: " + revNumber);
    }
}
