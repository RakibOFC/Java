package ifelsejava;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.println("Check whether a character is uppercase or lowercase alphabet.\n");

        System.out.print("Enter an alphabets: ");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase alphabet.");

        } else if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is uppercase alphabet.");
            
        } else{
            System.out.println(ch + " is not an alphabet!");
        }
    }
}