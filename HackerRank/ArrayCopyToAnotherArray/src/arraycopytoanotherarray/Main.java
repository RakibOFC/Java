package arraycopytoanotherarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size, i;
        System.out.print("Enter Size: ");
        size = input.nextInt();
        
        int arr1[] = new int[size], arr2[] = new int[size];
        
        for(i = 0; i < size; i++){
            
            arr1[i] = input.nextInt();
            arr2[i] = arr1[i];
        }
        System.out.println("After Copy:");
        for(i = 0; i < size; i++){
            System.out.println(arr2[i]);
        }
    }

}
