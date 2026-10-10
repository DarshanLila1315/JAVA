// Write a program to create circle class with area function to find area of circle

import java.util.Scanner;

public class Lab7A1 {
    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println(c1.area());
    }
}

class circle {

    Scanner sc = new Scanner(System.in);
    final double pi = 3.14;
    double radius;

    circle() {
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    double area() {
        return pi * radius * radius;
    }

}