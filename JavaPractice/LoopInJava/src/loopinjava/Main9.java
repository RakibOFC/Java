package loopinjava;
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        
        int n, number, limit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Print multiplication table of any number.\n");
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter limit: ");
        limit = input.nextInt();

        n = number;
        for(n = 1; n <= limit; n++){
            
            System.out.println(number + " * " + n + " = " + (number * n));
        }
    }
}