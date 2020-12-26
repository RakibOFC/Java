package loopinjava;

import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {

        int number, n;

        Scanner input = new Scanner(System.in);

        System.out.println("Print all ASCII character with their values.\n");

        for (n = 0; n <= 255; n++) {
            
            System.out.println("ASCII value of character " + (char)n + " = " + n + "\n");
        }
    }
}