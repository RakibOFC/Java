package ifelsejava;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main17 {

    public static void main(String[] args) {

        int a, b, c;
        double x1, x2, root;

        /**
         * A quadratic equation is same as middle term, but quadratic equation
         * can find exact value of x1 and x2.
         * => x^2 - 5x + 6 = 0
         * 
         * Here, a = 1, b = -5 and c = 6
         * 
         * => x^2 - 3x - 2x + 6 = 0
         * => x(x - 3) - 2(x - 3) = 0
         * => x = 3, 2
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Find all roots of a quadratic equation.\n");

        System.out.print("Value of a: ");
        a = input.nextInt();
        
        System.out.print("Value of b: ");
        b = input.nextInt();
        
        System.out.print("Value of c: ");
        c = input.nextInt();
        
        root = sqrt(pow(b, 2) - (4 * a * c));
        x1 = (- b + root) / (2 * a);
        x2 = (- b - root) / (2 * a);
        
        System.out.println("x1: " + x1 + "\nx2: " + x2);
    }
}