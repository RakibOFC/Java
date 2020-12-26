import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        int i, j, length;

        String temp = "";
        String smallest = s.substring(0, k);
        String largest = "";
        
        for(i = 0; i <= s.length()-k; i++){

            temp = s.substring(i, (i+k));

            if(temp.compareTo(smallest) <= 0){

                smallest = temp;
            }
            if(temp.compareTo(largest) >= 0){

                largest = temp;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}