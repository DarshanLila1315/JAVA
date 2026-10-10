// 5.1 - Write a Java program to sum values of an array.[A] 

// import java.util.Scanner;

// public class Lab5A1 {
//     public static void main(String[] args) {
//         int sum = 0;
//         int[] a = new int[3];
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < a.length; i++) 
//         {
//            System.out.println("Enter A["+i+"]");
//             a[i] = sc.nextInt();
//         }

//         for (int i = 0; i < a.length; i++) 
//         {
//            sum = sum + a[i];
//         }  
//          System.out.println("sum is : "+sum);       
//     }
// }

//----------------------------------------------------------------
import java.util.Scanner;
public class Lab5A1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) 
        {
           System.out.println("Enter A["+i+"]");
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            sum = sum + i;
        }
         System.out.println("sum is : "+sum);       
    }
}
//---------------------------------------------------------------------------------
/*
Enter A[0]
10
Enter A[1]
20
Enter A[2]
30
sum is : 60
*/