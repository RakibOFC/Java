package loopinjava;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        int n, number, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Find sum of all odd numbers between 1 to n.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (n = 1; n <= number; n++) {
            
            if (n % 2 != 0) {
                
                sum += n; // Or, sum = sum + n;
                System.out.println(n);
            }

        }
        System.out.println("Sum: " + sum);
    }
}