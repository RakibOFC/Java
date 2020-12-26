package ifelsejava;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.println("Input any alphabet and check whether it is vowel or consonant.\n");

        System.out.print("Enter an alphabets: ");
        ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U') {
            System.out.println(ch + " is vowel.");

        } else {
            System.out.println(ch + " is consonant.");
            
        }
    }
}