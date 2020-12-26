package scanarray;

import java.util.Scanner;

public class ScanArray {

    public static void main(String[] args) {

        int i;
        int a[] = new int[5];
        
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 2; i++) {
            a[i] = input.nextInt();
        }

        for (i = 0; i < 2; i++) {
            System.out.println(a[i]);
        }
    }
}
