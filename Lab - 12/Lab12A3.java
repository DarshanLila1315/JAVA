/* 
Write a program to create a custom exception named AgeException, get the age of 
the user from command prompt (terminal) and if age is less than 18 it should throw 
AgeException, also handle this exception in main method.
*/

public class Lab12A3 {
   
    public static void main(String[] args) {
        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(System.console().readLine());
            if (age < 18) {
                throw new AgeException("Age must be at least 18.");
            }
            System.out.println("Age is valid: " + age);
        } catch (AgeException e) {
            System.out.println("AgeException: " + e.getMessage());
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}