// 3.Write a program to calculate the area of Rectangle.[A] 

import java.util.Scanner;

public class Lab3A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter Lenght : ");
        double Lenght = sc.nextDouble();

        System.out.println("Enter Width : ");
        double Width = sc.nextDouble();
        double area = Lenght * Width;
        System.out.println("Area of Circle is :" + area);
    }

}

/*
Enter Lenght : 
10
Enter Width : 
10
Area of Circle is :100.0
*/
