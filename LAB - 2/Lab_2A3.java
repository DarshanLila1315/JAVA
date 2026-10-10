
import java.util.Scanner;

/*  Write a java program to take user input [A] 
i. Through Command Line Argument. 
ii. Through Scanner class. */

public class Lab_2A3 {
     public static void main(String[] args) {
        System.out.println("i. Through Command Line Argument.");
        System.out.println("i. City : "+args[0]);
        System.out.println("i. Collage : "+args[1]);

         System.out.println("ii. Through Scanner class.");
         int n;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Num : ");
         n=sc.nextInt();
         System.out.println("Your Number is : "+n);

    }
}
