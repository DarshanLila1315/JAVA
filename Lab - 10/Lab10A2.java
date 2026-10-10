/*Write a Java program to create an abstract class BankAccount with abstract methods 
deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
extend  the  BankAccount  class  and  implement  the  respective      methods  to  handle 
deposits and withdrawals for each account type.*/

import java.util.*;

public class Lab10A2 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();

        savings.deposit(1000);
        savings.withdraw(500);

        System.out.println();

        current.deposit(2000);
        current.withdraw(1500);
    }
}

abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }
}
