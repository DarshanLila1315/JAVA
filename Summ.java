// WAP to find a sum of numbers entered by user. (E.g: 582=5+8+2=15)
import java.util.*;
public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
