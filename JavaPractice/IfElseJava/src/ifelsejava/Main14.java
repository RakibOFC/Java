package ifelsejava;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        int angle1, angle2, angle3;

        Scanner input = new Scanner(System.in);

        System.out.println("Input angles of a triangle and check whether triangle is valid or not.\n");

        System.out.println("Enter three angles...");
        angle1 = input.nextInt();
        angle2 = input.nextInt();
        angle3 = input.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Triangle is valid.");
        
        } else {
            System.out.println("Triangle is not valid.");
            
        }
    }
}
