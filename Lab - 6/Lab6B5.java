// Write a Java program to create a class called Employee with a name, job title, and salary 
// attributes, and methods to calculate and update salary. 

import java.util.*;

public class Lab6B5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.calculateSalary();
        emp1.updateSalary();
    }
}

class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        name = sc.nextLine();
        System.out.println("Enter job title");
        jobTitle = sc.nextLine();
        System.out.println("Enter salary");
        salary = sc.nextDouble();
    }

    void calculateSalary() {
        salary = salary * 1.1; // 10% increase
    }

    void updateSalary() {
        System.out.println("Updated salary for " + name + " is: " + salary);
    }
}