//5 Write a program that prompts the user to enter three numbers. Find the largest  number.[C] 

import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Enter C : ");
        int c = sc.nextInt();
        //int demo = sc.nextInt();

        if (a > b && a > c) {
            System.out.print("A is Largest Number.");
        } else if (b > a && b > c) {
            System.out.print("b is Largest Number.");
        } else {
            System.out.print("c is Largest Number.");
        }
        // demo = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

    }
}

/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab3C5.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab3C5 

Enter A : 
10
Enter B : 
20
Enter C : 
30
c is Largest Number.
*/
