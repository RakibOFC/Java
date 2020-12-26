package loopinjava;

import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {

        int i, number, power, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Find power of a number using for loop.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter a number: ");
        power = input.nextInt();

        for (i = 0; i < power; i++) {
            result = result * number; // result *= number;
        }
        System.out.println(number + " Power " + i + " = " + result);
    }
}