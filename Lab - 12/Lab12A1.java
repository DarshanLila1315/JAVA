// Write  a  program  to  demonstrate  Arithmetic  Exception  and  ArrayIndexOutOfBounds  Exception using try-catch block.

import java.util.*;


public class Lab12A1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter Element :-");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("enter index");
        int index = sc.nextInt();
        try {
            
            System.out.println("Element at index " + index + " is: " + arr[index]);
            System.out.println("Enter a number to divide by: ");
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();
            int result = arr[index] / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + index);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:");
        } finally {
            sc.close();
        }
    }    
}
