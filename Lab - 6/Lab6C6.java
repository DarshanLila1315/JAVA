// Write a program to find length of string and print second half of the string.

import java.util.*;

public class Lab6C6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of the string is: " + length);
        for (int i = length / 2; i < length; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
