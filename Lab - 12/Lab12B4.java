/* 
Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, 
the program would throw a Number Format Exception. If Num2 were Zero, the program 
would throw an Arithmetic Exception. Display appropriate message for each exception.

*/

public class Lab12B4 {
    public static void main(String[] args) {
        try {
            String num1Str = "10acls"; 
            String num2Str = "0";  

            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception:");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception:");
        }
    }
    
}
