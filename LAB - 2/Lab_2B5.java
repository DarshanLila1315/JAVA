/* 5 Write a program that reads a number in meters, converts it to feet, and displays the 
result.[B]  */

import java.util.*;

public class Lab_2B5 {

    public static void main(String[] args) {
        //   System.out.println("Scanner class");
        double meter , feet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meter : " );
        meter =sc.nextDouble();
        feet=meter*3.28;
        System.out.println("Feet is  : " +feet);
    }
}

/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab_2B5.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab_2B5      
Enter Meter : 
100
Feet is  : 328.0 */