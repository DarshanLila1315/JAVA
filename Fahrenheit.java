import java.util.*;

class Converter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        Converter converter = new Converter();
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        double fahrenheitConvertedBack = converter.celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
        System.out.println(celsius + " Celsius is equal to " + fahrenheitConvertedBack + " Fahrenheit");
        sc.close();
    }
}
