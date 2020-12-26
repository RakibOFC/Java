package ifelsejava;

import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {

        int side1, side2, side3;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether the triangle is equilateral, isosceles or scalene triangle.\n");

        System.out.println("Enter three sides...");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
                
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles.");
                
            } else {
                System.out.println("The triangle is scalene.");
                
            }
        } else {
            System.out.println("The triangle is not valid.");
            
        }
    }
}