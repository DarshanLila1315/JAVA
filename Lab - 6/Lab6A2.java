
/*
 2 - Create class Cube with attributes (height, width and depth with double datatype). 
Implement getter() and setter() method to assign data for 2 cubes. Create method 
volume() to calculate volume for 2 cubes. [A] 
 */
import java.util.*;

class Cube1 {

    double height;
    double width;
    double depth;

    Scanner sc = new Scanner(System.in);

    void setter() {
        System.out.print("Enter Height : ");
        height = sc.nextDouble();
        System.out.print("Enter Width : ");
        width = sc.nextDouble();
        System.out.print("Enter Depth : ");
        depth = sc.nextDouble();
    }

    void getter() {

    }

    void Volume() {
        System.err.println("Volume is : "+height * width * depth);
    }

}

public class Lab6A2 {

    public static void main(String[] args) {

        Cube1 c1 = new Cube1();
        Cube1 c2 = new Cube1();

        c1.setter();
        c1.getter();
        c1.Volume();
        System.err.println("-----------------------");
        c2.setter();
        c2.getter();
        c2.Volume();
        System.err.println("-----------------------");
    }
}

/*
Enter Height : 10
Enter Width : 10
Enter Depth : 10
Volume is : 1000.0
-----------------------
Enter Height : 10
Enter Width : 15
Enter Depth : 20
Volume is : 3000.0
-----------------------
 */
