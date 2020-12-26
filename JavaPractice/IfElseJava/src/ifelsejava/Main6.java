package ifelsejava;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a year is leap year or not.\n");

        System.out.print("Enter year: ");
        year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year.");

        } else {
            System.out.println(year + " is not leap year.");
            
        }
    }
}