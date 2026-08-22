// Write  a  program  that  reads  a  number  in  meters,  converts  it  to  feet,  and  displays  the  result.
import java.util.*;

public class Metertofeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in meters:");
        double meterInput = sc.nextDouble();
        double feetResult = meterInput * 3.28084;
        System.out.println(meterInput + " meters is equal to " + feetResult + " feet.");
    }
}
