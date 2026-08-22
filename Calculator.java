import java.util.Scanner;

class Calc {
    int ans = 0;

    public void SUM(int a, int b) {
        // int ans=0;
        ans = a + b;
        System.out.println("Ans" + ans);
    }

    public void DIFF(int a, int b) {
        ans = a - b;
        System.out.println("Ans" + ans);
    }

    public void MUL(int a, int b) {
        ans = a * b;
        System.out.println("Ans" + ans);
    }

    public void DIV(int a, int b) {
        ans = a / b;
        System.out.println("Ans" + ans);
    }

}

public class Calculator {
    public static void main(String[] args) {
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        String operation = " ";
        do {
            System.out.println("Enter '/','*','+','-','%' or '0' to exit: ");
            operation = sc.nextLine();
            
            if(operation.equals("0")){
                System.out.println("Exiting calculator");
                sc.close();
                return;
            }

            System.out.println("Enter A : ");
            int a = sc.nextInt();

            System.out.println("Enter B : ");
            int b = sc.nextInt();
            sc.nextLine();

            switch (operation) {
                case "/":
                    c.DIV(a, b);
                    break;

                case "*":
                    c.MUL(a, b);
                    break;
                case "+":
                    c.SUM(a, b);
                    break;
                case "-":
                    c.DIFF(a, b);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        } while (!operation.equals("0"));
        sc.close();
    }
}
