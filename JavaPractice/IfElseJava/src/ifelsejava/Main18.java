package ifelsejava;

import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {

        int buy, sell;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate profit or loss.\n");

        System.out.print("Purchase Price: ");
        buy = input.nextInt();

        System.out.print("Selling Price: ");
        sell = input.nextInt();

        if (buy < sell) {
            System.out.println("Profit!");
            
        } else if (sell == buy) {
            System.out.println("No Loss No Profit.");
        
        } else {
            System.out.println("Loss!");
        
        }
    }
}
