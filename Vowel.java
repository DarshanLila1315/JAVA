// Write a program that prompts the user to enter a letter and check whether a letter is a  vowel or a constant
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letter = sc.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
