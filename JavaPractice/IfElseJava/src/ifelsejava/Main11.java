package ifelsejava;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Input week number and print week day.\n");

        System.out.print("Enter week number(1 - 7): ");
        number = input.nextInt();

        if (number == 1) {
            System.out.println("Week number "+ number + " for Saturday.");

        } else if(number == 2){
            System.out.println("Week number "+ number + " for Sunday.");
            
        } else if(number == 3){
            System.out.println("Week number "+ number + " for Monday.");
            
        } else if(number == 4){
            System.out.println("Week number "+ number + " for Tuesday.");
            
        } else if(number == 5){
            System.out.println("Week number "+ number + " for Wednesday.");
            
        } else if(number == 6){
            System.out.println("Week number "+ number + " for Thursday.");
            
        } else if(number == 7){
            System.out.println("Week number "+ number + " for Friday.");
            
        } else{
            System.out.println("Invalid week number!");
            
        }
    }
}