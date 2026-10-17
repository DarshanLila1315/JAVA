/* 
Write a program to create Account class, which is representing a bank account where 
we  can  deposit  and  withdraw  money.  If  user  need  to  withdraw  money which exceed 
our minimum bank balance then it will not be allowed, and will throw  
InSufficientFundException(Custom  Exception).  Handle  above  exception  and  display 
proper error message */

import java.util.*;

public class Lab12A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        Account account = new Account(initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        try {
            account.withdraw(withdrawAmount);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
        sc.close();
    }
    
}

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account {
    private double balance;
    private static final double MIN_BALANCE = 1000.0;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InSufficientFundException {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                throw new InSufficientFundException("Insufficient funds. Minimum balance of " + MIN_BALANCE + " must be maintained.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }
}