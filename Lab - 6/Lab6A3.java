/*
6.3 - Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
Implement getter() and setter() method to assign and display data for 3 students.[A] 
*/
import java.util.*;

class Account{

    int accNum;
    String accType;
    double balance;

    Scanner sc = new Scanner(System.in);

    void setter() {
        System.out.print("Enter Account No : ");
        accNum = sc.nextInt();
        System.out.print("Enter Account Type : ");
        accType = sc.next();
        System.out.print("Enter balance : ");
        balance = sc.nextDouble();
    }

    void getter() {
        // System.out.print("Account No : " + accNum);
        // System.out.print("Account Type  : " + accType);
        // System.out.print("Enter balance : " + balance);
    }

}
public class Lab6A3 {

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.setter();
        a1.getClass();
        System.err.println("-----------------------");
        a2.setter();
        a2.getClass();
        System.err.println("-----------------------");
        a3.setter();
        a3.getClass();
        System.err.println("-----------------------");
    }
}

/*
Enter Account No : 101
Enter Account Type : Saving
Enter balance : 10000
-----------------------
Enter Account No : 102
Enter Account Type : Saving
Enter balance : 20000
-----------------------
Enter Account No : 103
Enter Account Type : Fixed
Enter balance : 30000
-----------------------
*/