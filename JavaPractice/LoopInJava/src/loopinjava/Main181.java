package loopinjava;

import java.util.Scanner;

public class Main181 {

    public static void main(String[] args) {

        int i, count, digit, freqCount[] = new int[10], number;

        Scanner input = new Scanner(System.in);

        System.out.println("Find frequency of each digit in a given integer.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != 0) {
            digit = (number % 10);
            number = (number / 10);
            freqCount[digit]++;
        }
        for (i = 0; i <= 9; i++) {
            /// if(freqCount[i] > 0) /** This line will be print, if frequency is greater than 0.*/
            {
                System.out.println("Frequency of " + i + " = " + freqCount[i]);
            }
        }

    }
}
