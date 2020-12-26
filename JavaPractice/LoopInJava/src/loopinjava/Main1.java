package loopinjava;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        int number, n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Print all natural numbers in reverse (from n to 1). - using while loop.\n");
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        n = number;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
