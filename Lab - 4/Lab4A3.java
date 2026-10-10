// 4A3 Write a program to find maximum no from given 3 no.(without if-else).[A] 

import java.util.Scanner;

public class Lab4A3 {

    public static void evenodd(int a, int b, int c) {
        System.out.print("Maximum Number is : " + ((a > b && a > c) ? a : ((b > a && b > c) ? b : c)));
    }

    public static void main(String[] args) {
        // int max = Math.max(a,Math.max(b, c));
        // System.out.println("Maximum Number is : " + max);
        // ((a>b && a>c) ? (System.out.print("Maximum Number is : " + a)) : ((b>a && b>c) ? (System.out.print("Maximum Number is : " + b)) : (System.out.print("Maximum Number is : " + c))));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Enter C : ");
        int c = sc.nextInt();
        evenodd(a, b, c);
        sc.close();
    }
}


/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab4A3.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab4A3      
Enter A : 
10
Enter B : 
20
Enter C : 
30
Maximum Number is : 30
*/
