package ifelsejava;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Find maximum between two numbers.\n");
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number.");
        } else {
            System.out.println(num2 + " is maximum number.\n");
        }
    }
}
