// 6 Write a program to find that given Number is palindrome or not. [B] 

import java.util.Scanner;
public class Lab4B6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter A : ");
         int num = sc.nextInt();
         int temp ;
         int revers;
        int ans = 0;        
        temp = num;
        while (num != 0) 
        { 
            revers =  num % 10;
            ans = ans * 10 + revers;
            num /= 10;
        }
        if (temp == ans)
        {
            System.out.println("palindrome");
        }
        else
        {
             System.out.println("Not palindrome");
        }
    }
}

/*
Enter A : 
131
palindrome

Enter A : 
132
Not palindrome

*/