package loopinjava;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, number, newNumber = 0;
        System.out.println("Check whether a number is Perfect number or not.\n");
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (n = 1; n < number; n++) {
            if (number % n == 0) {
                newNumber = newNumber + n; //Or, newNumber += n;
            }
        }
        if (number == newNumber) {
            System.out.println(number + " is a perfect number.\n");
        } else {
            System.out.println(number + " is not a perfect number.\n");
        }
    }
}
