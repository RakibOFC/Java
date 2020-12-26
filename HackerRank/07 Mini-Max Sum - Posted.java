import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        int i, j;
        long sum[] = new long[5];

        for (i = 0; i < arr.length; i++) {

            for (j = 0; j < arr.length; j++) {

                sum[i] = sum[i] + arr[j];
            }
            sum[i] = sum[i] - arr[i];
        }
        long min = sum[0], max = sum[0];

        for (i = 0; i < arr.length; i++) {

            if (sum[i] > max) {

                max = sum[i];
            }
            if (sum[i] < min) {

                min = sum[i];
            }
        }
        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}