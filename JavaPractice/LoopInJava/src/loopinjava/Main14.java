package loopinjava;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        int n, digit, number, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate sum of digits of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            
            digit = (number % 10);
            sum = sum + digit;
            number = (number / 10);
        }
        System.out.println("Sum: " + sum);
    }
}
