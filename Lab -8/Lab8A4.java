// Write a Java program to create a class called Area with a static final variable PI=3.14159. Implement a method to calculate the area of a circle given its radius.

import  java.util.*;
public class Lab8A4 {
    static final double PI = 3.14159;

    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Radius");
        double radius = scanner.nextDouble();
        double area = calculateArea(radius);
        System.out.printf("The area of the circle with radius %.2f is: %.4f%n", radius, area);
        scanner.close();
    }
}
