// 4 Write a program to check that the given number is prime or not.[A] 

import java.util.Scanner;

public class Lab4A4 {

    public static void prime(double num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println(" Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int num = sc.nextInt();
        prime(num);
        sc.close();
    }
}

/*
Enter A : 
12
Not Prime Number

Enter A : 
13
Prime Number
*/
