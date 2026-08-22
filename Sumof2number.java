// Write  a  program  to  get  2  numbers  from  the  user  and  print  the  sum  of  two  numbers 
// using command line and Scanner class
import java.util.*;
public class Sumof2number {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        int total = num1 + num2;
        System.out.println("Sum of two numbers is: " + total);        
        
    }
}
