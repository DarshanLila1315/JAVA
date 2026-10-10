/*
Write a program to create basic calculator by getting 2 numbers and an operation(+,
,/,*,%) from the user and apply the operation given in a string on the given numbers.[A] 
 */

import java.util.Scanner;

public class Lab3A2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String operation = " ";
        do {
            System.out.println("Enter A : ");
            double a = sc.nextDouble();

            System.out.println("Enter B : ");
            double b = sc.nextDouble();

            System.out.println("Enter '/','*','+','-','%' : ");
            operation = sc1.nextLine();

            switch (operation) {
                case "/":
                    System.out.println("A / B : " + (a / b));
                    break;

                case "*":
                    System.out.println("A * B : " + (a * b));
                    break;
                case "+":
                    System.out.println("A + B : " + (a + b));
                    break;
                case "-":
                    System.out.println("A - B : " + (a - b));
                    break;
                case "%":
                    System.out.println("A % B : " + (a % b));
                    break;

                case "0":
                    return;
                    
                default:
                    System.out.println("Invalid Operator");
            }
        } while (operation != "0");

    }

}


/*
Enter A : 
10
Enter B : 
20
Enter '/','*','+','-','%' : 
+
A + B : 30.0
 */


/*
Enter A : 
10
Enter B : 
20
Enter '/','*','+','-','%' : 
0
*/
