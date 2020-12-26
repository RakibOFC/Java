package loopinjava;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        
        int number, n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Print all even numbers from 1 to 100. - Using while loop.");
        
        n = 1;
        while (n <= 100) {
            if(n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}
