package ifelsejava;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {

        int side1, side2, side3;

        Scanner input = new Scanner(System.in);

        System.out.println("Input all sides of a triangle and check whether triangle is valid or not.\n");

        System.out.println("Enter three sides...");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("Triangle is valid.");
        
        } else {
            System.out.println("Triangle is not valid.");
            
        }
    }
}