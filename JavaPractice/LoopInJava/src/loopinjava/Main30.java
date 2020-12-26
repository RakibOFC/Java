package loopinjava;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main30 {

    public static void main(String[] args) {

        int i, j, digit, number, numberClone, count = 0, newNumber = 0, temp;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is Armstrong number or not.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        numberClone = number;
        
        while (number != 0) {
            digit = (number % 10);
            number /= 10; /// Or, number = number / 10;
            count++;
        }

        number = numberClone;
        while (number != 0) {
            digit = (number % 10);
            temp = (int) pow(digit, count);
            newNumber += temp;
            number /= 10; /// Or, number = number / 10;
        }

        number = numberClone;
        
        if (newNumber == number) {
            
            System.out.println(number + " is a Armstrong a number!\n\n");
        } else {
            
            System.out.println(number + " is a Armstrong not a number!\n\n");
        }
    }
}