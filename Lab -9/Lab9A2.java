/*Write a Java program to create a class called Employee with methods called work() and 
getSalary(). Create a subclass called HRManager that overrides the work() method and 
adds a new method called addEmployee(). */

import java.util.*;

public class Lab9A2 {

    public static void main(String[] args) {
        Employee employee = new Employee(50000.0);
        HRManager manager = new HRManager(75000.0);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());
        manager.work();
        System.out.println("HR Manager salary: " + manager.getSalary());
        manager.addEmployee();
    }
}

class Employee {
    private final double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Employee added");
    }
}
