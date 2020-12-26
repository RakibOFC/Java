package ifelsejava;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Find maximum between three numbers.\n");

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is maximum number.");
            
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is maximum number.");
            
        } else {
            System.out.println(num3 + " is maximum number.");
        }
    }
}