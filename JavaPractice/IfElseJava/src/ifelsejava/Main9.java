package ifelsejava;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.println("Input any character and check whether it is alphabet, digit or special characters.\n");

        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is alphabet.");

        } else if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is digit.");
            
        } else {
            System.out.println(ch + " is special character.");
            
        }
    }
}