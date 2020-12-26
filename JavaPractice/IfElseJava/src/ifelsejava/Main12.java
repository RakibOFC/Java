package ifelsejava;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Input month number and print number of days in that month.\n");

        System.out.print("Enter month number(1 - 12): ");
        number = input.nextInt();

        if (number == 1) {
            System.out.println("Month number "+ number + " for January.");

        } else if(number == 2){
            System.out.println("Month number "+ number + " for February.");
            
        } else if(number == 3){
            System.out.println("Month number "+ number + " for March.");
            
        } else if(number == 4){
            System.out.println("Month number "+ number + " for April.");
            
        } else if(number == 5){
            System.out.println("Month number "+ number + " for May.");
            
        } else if(number == 6){
            System.out.println("Month number "+ number + " for June.");
            
        } else if(number == 7){
            System.out.println("Month number "+ number + " for July.");
            
        } else if(number == 8){
            System.out.println("Month number "+ number + " for August.");
            
        } else if(number == 9){
            System.out.println("Month number "+ number + " for September.");
            
        } else if(number == 10){
            System.out.println("Month number "+ number + " for October.");
            
        } else if(number == 11){
            System.out.println("Month number "+ number + " for November.");
            
        } else if(number == 12){
            System.out.println("Month number "+ number + " for December.");
            
        } else{
            System.out.println("Invalid Month number!");
            
        }
    }
}