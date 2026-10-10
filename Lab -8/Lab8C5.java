/**
Write  a  Java  program  to  create  a  class  called  House  with  private  instance  variables 
address, numberOfRooms, and area. Provide public getter and setter methods to access 
and modify these variables. Add a method called calculatePrice() that returns the price 
of the house based on its area and a price per square meter.
*/
import java.util.*;


public class Lab8C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.print("Address of  house: ");
        house.setAddress(scanner.nextLine());

        System.out.print("Number of rooms: ");
        house.setNumberOfRooms(scanner.nextInt());

        System.out.print("Area of  house in square meters: ");
        house.setArea(scanner.nextDouble());

        System.out.print("Enter the price per square meter: ");
        double pricePerSquareMeter = scanner.nextDouble();

        double totalPrice = house.calculatePrice(pricePerSquareMeter);
        System.out.printf("The total price of the house  %.2f%n",totalPrice);

        scanner.close();
    }
}

class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}