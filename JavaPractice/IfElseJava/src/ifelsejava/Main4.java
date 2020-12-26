package ifelsejava;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is divisible by 5 and 11 or not.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");

        } else if (number % 11 == 0) {
            System.out.println(number + " is divisible by 11.\n");
            
        } else {
            System.out.println(number + " is not divisible by 5 and 11.\n");
            
        }
    }
}