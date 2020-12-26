package loopinjava;

import java.util.Scanner;

public class Main22 {

    public static void main(String[] args) {

        int i, number = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("Find all factors of a number.\n");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Factors are: ");
        for (i = 1; i <= number; i++) {
            
            if ((number % i) == 0) {
                
                System.out.print(i + " ");
            }
        }
    }
}