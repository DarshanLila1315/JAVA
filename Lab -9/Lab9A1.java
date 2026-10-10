/*
Declare a class called Student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
Define constructor and calculate_spi methods. Define main to instantiate an array for 
objects of class student to process data of n students
*/

import java.util.*;

public class Lab9A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        student[] students = new student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new student();
        }

        scanner.close();
    }
    
}

class student {
    private int id_no;
    private int no_of_subjects_registered;
    private String[] subject_code;
    private int[] subject_credits;
    private char[] grade_obtained;
    private double spi;
    
    student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        this.id_no = sc.nextInt();

        System.out.print("Enter number of subjects registered: ");
        this.no_of_subjects_registered = sc.nextInt();

        this.subject_code = new String[no_of_subjects_registered];
        this.subject_credits = new int[no_of_subjects_registered];
        this.grade_obtained = new char[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.print("subject code  " + (i + 1) + ": ");
            subject_code[i] = sc.next();

            System.out.print("subject credits  " + (i + 1) + ": ");
            subject_credits[i] = sc .nextInt();

            System.out.print("grade obtained for subject " + (i + 1) + ": ");
            grade_obtained[i] = sc.next().charAt(0);
        }   

        calculate_spi();
    }

    private void calculate_spi() {
        int total_credits = 0;
        int total_points = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            total_credits += subject_credits[i];
            total_points += subject_credits[i] * getGradePoint(grade_obtained[i]);
        }

        this.spi = (double) total_points / total_credits;
        System.out.printf("SPI for student ID %d: %.2f%n", id_no, spi);
    }

    private int getGradePoint(char grade) {
        switch (grade) {
            case 'A': return 10;
            case 'B': return 8;
            case 'C': return 6;
            case 'D': return 4;
            case 'F': return 0;
            default: return 0;
        }
    }
    

}