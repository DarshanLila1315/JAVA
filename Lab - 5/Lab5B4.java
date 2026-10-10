// 5.4 - Write a Java program to copy all the elements of an array to another array and print  both the array elements. [B] 

import java.util.Scanner;

public class Lab5B4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter Element : ");
        for (int i = 0; i < n; i++) {
           
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        
        System.out.println("Your Copy Array is : ");
        for (Object i : arr2) {
            System.out.println(i);
        }

    }
}

/*
3 // size of array
Enter Element : 
10
20
30
Your Copy Array is : 
10
20
30
*/