/* 
Write a program in java if number is less than 10 and greater than 50, it generate the 
exception out of range. Else it displays the square of number
*/
public class Lab12C5 {
    public static void main(String[] args) {
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(System.console().readLine());
            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Number is out of range (10-50).");
            }
            System.out.println("Square of " + number + " is " + (number * number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (OutOfRangeException e) {
            System.out.println("OutOfRangeException: " + e.getMessage());
        }
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}