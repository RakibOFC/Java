package loopinjava;

import java.util.Scanner;

public class Main33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j, number, newNumber = 0;
        System.out.println("Check whether a number is Perfect number or not.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (i = 1; i < number; i++) {
            newNumber = 0;

            for (j = 1; j < i; j++) {
                
                if (i % j == 0) {
                    newNumber = newNumber + j; //Or, newNumber += j;
                }
            }
            if (i == newNumber) {
                System.out.println(i);
            }
        }
    }
}
