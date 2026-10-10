/* 6 Write a program that prompts the user to enter a letter and check whether a letter is a 
vowel or a constant.[C]  */

import java.util.*;

public class Lab_2C6 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char  lettter = sc.next().charAt( 0);
        if (lettter == 'A' ||lettter == 'E' || lettter == 'I' || lettter == 'O' || lettter == 'U' 
        || lettter == 'a' || lettter == 'e' || lettter == 'i' || lettter == 'o' || lettter == 'u')
        {
            System.out.println(lettter + " Vowel " );
        }
        else
        {
            System.out.println(lettter + " Constant " );
        }
    }
}
/*
PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab_2C6.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab_2C6      
b
b Constant
 */