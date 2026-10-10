//Practical -4: Programs using if-else ladders, conditional and branching statement 

/* 1 The marks obtained by a student in 5 different subjects are input through the 
keyboard.  
The student gets a division as per the following rules: 
I. Percentage above or equals to 60-first division 
II. Percentage between 50 to 59-second division 
III. Percentage between 40 and 49-Third division 
IV. Percentage less than 40-fail 
Write a program to calculate the division obtained by the student.[A] 
 */
import java.util.Scanner;

public class Lab4A1 {
    // Function
    public static void marks(double percentage) {
        //I. percentage above or equals to 60-first division
        if (percentage >= 60) {
            System.out.print("first division");
        } //II. percentage between 50 to 59-second division
        else if (percentage <= 50 && percentage > 60) {
            System.out.print("second division.");
        } //III. percentage between 40 and 49-Third division 
        else if (percentage <= 40 && percentage > 50) {
            System.out.print("Third division");
        } //IV. percentage less than 40-fail 
        else if (percentage < 40) {
            System.out.print("fail");
        }
    }
// Main Method 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student 1 Mark is : ");
        int a = sc.nextInt();

        System.out.println("Student 2 Mark is : ");
        int b = sc.nextInt();

        System.out.println("Student 3 Mark is : ");
        int c = sc.nextInt();

        System.out.println("Student 4 Mark is : ");
        int d = sc.nextInt();

        System.out.println("Student 5 Mark is : ");
        int e = sc.nextInt();

        double totalmarks = a + b + c + d + e;
        System.out.println("All Student Mark sum is : " + totalmarks);
        double percentage = (totalmarks / 500) * 100;

        System.out.println("All Student Marks in percentage is : " + percentage);
        Lab4A1.marks(percentage);
        sc.close();
    }
    
}

/*
   PS C:\Users\student\Desktop\BHAVIN\Java> javac Lab4A1.java
PS C:\Users\student\Desktop\BHAVIN\Java> java Lab4A1      
Student 1 Mark is : 
50
Student 2 Mark is : 
60
Student 3 Mark is : 
70
Student 4 Mark is : 
80
Student 5 Mark is : 
90
All Student Mark sum is : 350.0
All Student Marks in Percentage is : 70.0
first division
 */
