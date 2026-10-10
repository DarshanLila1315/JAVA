//5.3 - Write a program to print given array in reverse order.[A] 

import java.util.Scanner;

public class Lab5A3 {

    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter A[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("Reverse Array is : ");
        for (int i = a.length - 1; i >= 0; i--) {

            System.out.println(a[i]);
        }
    }
}

/*
Enter A[0]
10
Enter A[1]
20
Enter A[2]
30
Reverse Array is : 
30
20
10
*/