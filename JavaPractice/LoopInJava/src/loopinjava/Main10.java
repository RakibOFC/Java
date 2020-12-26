package loopinjava;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        
        int number, n, count = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Count number of digits in a number.\n");
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        while (number != 0) {
            
            number /= 10; //Or, number = number / 10;
            count++;
        }
        System.out.println("Total " + count +" digit(s).");
    }
}