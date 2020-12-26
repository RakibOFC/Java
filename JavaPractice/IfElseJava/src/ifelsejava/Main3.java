package ifelsejava;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a number is negative, positive or zero.\n");
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive number.");
            
        } else if(number < 0){
            System.out.println(number + " is negative number.");
            
        } else if(number == 0){
            System.out.println("Zero Detected!");
            
        } else{
            System.out.println("Invalid input!");
        }
    }
}