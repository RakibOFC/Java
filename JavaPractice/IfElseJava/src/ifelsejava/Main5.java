package ifelsejava;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is even or odd.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even number.");

        }else {
            System.out.println(number + " is odd number.\n");
            
        }
    }
}