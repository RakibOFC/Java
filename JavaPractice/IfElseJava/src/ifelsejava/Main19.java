package ifelsejava;

import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {

        /*
        Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
        Percentage >= 80% : Grade A+
        Percentage >= 75% : Grade A
        Percentage >= 70% : Grade A-
        Percentage >= 65% : Grade B+
        Percentage >= 60% : Grade B
        Percentage >= 55% : Grade B-
        Percentage >= 50% : Grade C+
        Percentage >= 45% : Grade C
        Percentage >= 40% : Grade D
        Percentage < 40% : Grade F
        */
        Scanner input = new Scanner(System.in);
        
        int phy, che, bio, math, com, avg_mark;

        System.out.println("Input marks of five subjects and calculate the grade.\n");

        System.out.print("Physics: ");
        phy = input.nextInt();
        
        System.out.print("Chemistry: ");
        che = input.nextInt();
        
        System.out.print("Biology: ");
        bio = input.nextInt();
        
        System.out.print("Mathematics: ");
        math = input.nextInt();
        
        System.out.print("Computer: ");
        com = input.nextInt();

        avg_mark = (phy + che + bio + math + com) / 5;

        if (avg_mark >= 80 && avg_mark <= 100) {
            System.out.println("Grade A+");
            
        } else if (avg_mark >= 75 && avg_mark <= 79) {
            System.out.println("Grade A");
            
        } else if (avg_mark >= 70 && avg_mark <= 74) {
            System.out.println("Grade A-");
            
        } else if (avg_mark >= 65 && avg_mark <= 69) {
            System.out.println("Grade B+");
            
        } else if (avg_mark >= 60 && avg_mark <= 64) {
            System.out.println("Grade B");
            
        } else if (avg_mark >= 55 && avg_mark <= 59) {
            System.out.println("Grade B-");
            
        } else if (avg_mark >= 50 && avg_mark <= 54) {
            System.out.println("Grade C+");
            
        } else if (avg_mark >= 45 && avg_mark <= 49) {
            System.out.println("Grade C");
            
        } else if (avg_mark >= 40 && avg_mark <= 44) {
            System.out.println("Grade D");
            
        } else if (avg_mark < 40) {
            System.out.println("Fail");
            
        }
    }
}
