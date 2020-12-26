package loopinjava;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {

        int n, number, firstDigit, lastDigit;

        Scanner input = new Scanner(System.in);

        System.out.println("Find first and last digit of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        lastDigit = number % 10;
        firstDigit = number;
        
        while(firstDigit >= 10) {
            
            firstDigit = firstDigit / 10;
        }
        System.out.println("First Digit: " + firstDigit + "\nLast Digit: " + lastDigit);
    }
}
