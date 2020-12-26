import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        int i, j, length = A.length();

        for(i = length - 1, j = 0; i >= 0; i--, j++){

            B = B + A.charAt(i);
        }
        if(B.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



