package ifelsejava;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a character is alphabet or not.\n");

        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an alphabet.");

        } else {
            System.out.println(ch + " is not an alphabet.");
            
        }
    }
}