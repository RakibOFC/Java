package ifelsejava;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {

        int amount, note1000, note500, note100, note50, note20, note10, note5, note2, note1;

        Scanner input = new Scanner(System.in);

        System.out.println("Count total number of notes in given amount.\n");

        System.out.print("Enter your amount: ");
        amount = input.nextInt();

        note1000 = amount / 1000;
        amount = amount % 1000;
        System.out.println("Note of 1000: " + note1000);

        note500 = amount / 500;
        amount = amount % 500;
        System.out.println("Note of 500: " + note500);

        note100 = amount / 100;
        amount = amount % 100;
        System.out.println("Note of 100: " + note100);
        
        note50 = amount / 50;
        amount = amount % 50;
        System.out.println("Note of 50: " + note50);

        note20 = amount / 20;
        amount = amount % 20;
        System.out.println("Note of 20: " + note20);

        note10 = amount / 10;
        amount = amount % 10;
        System.out.println("Note of 10: " + note10);

        note5 = amount / 5;
        amount = amount % 5;
        System.out.println("Note of 5: " + note5);

        note2 = amount / 2;
        System.out.println("Note of 2: " + note2);

        note1 = amount % 2;
        System.out.println("Note of 1: " + note1);
    }
}