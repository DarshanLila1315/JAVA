//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f -32*5/9 ) [B] 

import java.util.Scanner;

public class Lab3B4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fahrenheit : ");
        double Fahrenheit = sc.nextDouble();

        double FahrenheittoCelsius = (Fahrenheit-32)*(5.0/9.0) ;
        System.out.println(" Fahrenheit to Celsius is :" + FahrenheittoCelsius);

        System.out.println("Enter Celsius : ");
        double Celsius = sc.nextDouble();

        double CelsiustoFahrenheit = (Celsius*(9/5))+32 ;
        System.out.println("  Celsius to Fahrenheit  is :" + CelsiustoFahrenheit);
    }
}
/*
Enter Fahrenheit : 
100
 Fahrenheit to Celsius is :37.77777777777778
*/