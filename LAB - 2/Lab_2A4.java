/* 4 Write a program to get 2 numbers from the user and print the sum of two numbers 
using command line and Scanner class.[A] */

import java.util.*;

public class Lab_2A4 {
    public static void main(String[] args) {
        double a , b ,sum ;
          System.out.println("Scanner class");
          Scanner sc = new Scanner(System.in);
          a=sc.nextDouble();
          b=sc.nextDouble();
          sum = a+b;
         System.out.println("Your Sum is  : "+sum);

// -------------------------------------------------------------------------
         System.out.println("command line");
         int x = Integer.parseInt(args[0]);
         int y = Integer.parseInt(args[1]);
            sum = x + y;
         System.out.println("Sum is  : "+sum);
    }
}
/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab_2A4.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab_2A4 56 23
Scanner class
10 15
Your Sum is  : 25.0
command line
Sum is  : 79.0 */
