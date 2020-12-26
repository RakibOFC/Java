package loopinjava;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {

        int number, digit, product = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate product of digits of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            digit = (number % 10);
            product = product * digit;
            number = (number / 10);
        }
        System.out.println("Product: " + product);

    }
}