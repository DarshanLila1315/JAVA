// 2 Write a program to check whether a number is even or odd.[A] 

import java.util.Scanner;

public class Lab4A2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

         if (a % 2 == 0) 
        {
            System.out.print("A is Even Number.");
        } 
        else
        {
            System.out.print("A is Odd Number.");
        }
        sc.close();
    }
}

/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab4A2.java                                                                                                       
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab4A2                                                                                                             
Enter A :                                                                                                               
10
A is Even Number.
*/