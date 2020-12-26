package loopinjava;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {

        int n, number, firstDigit, lastDigit, sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Find first and last digit of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        lastDigit = number % 10;
        firstDigit = number;
        
        while(firstDigit >= 10) {
            
            firstDigit = firstDigit / 10;
        }
        sum = firstDigit + lastDigit;
        
        System.out.println("First Digit: " + firstDigit + ", Last Digit: " + lastDigit);
        System.out.println("Sum: " + sum);
    }
}