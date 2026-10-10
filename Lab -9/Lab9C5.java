/* Design a class named MyPoint to represent a point with x- and y-coordinates. The 
class contains: 
The data fields x and y that represent the coordinates with getter methods. 
1. a no-arg constructor that creates a point (0, 0). 
2. a constructor that constructs a point with specified coordinates. 
3. a method named distance that returns the distance from this point to a specified 
point of the MyPoint type. 
4. a method named distance that returns the distance from this point to another point 
with specified x- and y-coordinates.Create a class named ThreeDPoint to model a 
point in a three-dimensional space. Let ThreeDPoint be derived from MyPoint with 
following additional features: 
1. A data fields named z that represents the z-coordinate. 
2.    A no-arg constructor that creates a point (0, 0, 0). 
3.   A constructor that constructs a point with three specified coordinates. 
4.   A get method that returns the z value. 
5.   Override the distance method to return the distance between two points in the 
three-dimensional space. Write a program that creates two points (0, 0, 0) and (10, 
30, 25.5) and display the distance between the two points */

public class Lab9C5 {
	public static void main(String[] args) {
    		ThreeDPoint point1 = new ThreeDPoint();
		ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);

		System.out.println("Distance: " + point1.distance(point2));
	}
}

class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(MyPoint point) {
		return distance(point.getX(), point.getY());
	}

	public double distance(double x, double y) {
		double dx = this.x - x;
		double dy = this.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

class ThreeDPoint extends MyPoint {
	private double z;

	public ThreeDPoint() {
		this(0, 0, 0);
	}

	public ThreeDPoint(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	@Override
	public double distance(MyPoint point) {
		double dz = z - (point instanceof ThreeDPoint
				? ((ThreeDPoint) point).getZ() : 0);
		double dx = getX() - point.getX();
		double dy = getY() - point.getY();
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
}