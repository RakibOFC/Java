package loopinjava;

import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {

        int i, count, digit, number, numberClone;

        Scanner input = new Scanner(System.in);

        System.out.println("Find frequency of each digit in a given integer.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        numberClone = number;

        for (i = 0; i <= 9; i++) {
            count = 0;
            number = numberClone;

            while (number != 0) {
                
                digit = (number % 10);
                number = (number / 10);
                if (digit == i) {
                    count++;
                }
            }
            /// if(count > 0) /** This line will be print, if frequency is greater than 0.*/
            {
                System.out.println("Frequency of " + i + " = " + count);
            }
        }
    }
}
