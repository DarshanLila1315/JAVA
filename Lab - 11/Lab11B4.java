/*Write a program in Java to create an interface Car with moveForward, moveBackward, 
moveLeft, moveRight, applyBreak methods, create a class named Swift and Thar which 
implement the Car interface
    */
interface Car {
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}

class Swift implements Car {
    public void moveForward() {
        System.out.println("Swift moves forward");
    }

    public void moveBackward() {
        System.out.println("Swift moves backward");
    }

    public void moveLeft() {
        System.out.println("Swift moves left");
    }

    public void moveRight() {
        System.out.println("Swift moves right");
    }

    public void applyBreak() {
        System.out.println("Swift applies break");
    }
}

class Thar implements Car {
    public void moveForward() {
        System.out.println("Thar moves forward");
    }

    public void moveBackward() {
        System.out.println("Thar moves backward");
    }

    public void moveLeft() {
        System.out.println("Thar moves left");
    }

    public void moveRight() {
        System.out.println("Thar moves right");
    }

    public void applyBreak() {
        System.out.println("Thar applies break");
    }
}

public class Lab11B4 {
    public static void main(String[] args) {
        Car swift = new Swift();
        Car thar = new Thar();

        swift.moveForward();
        swift.moveBackward();
        swift.moveLeft();
        swift.moveRight();
        swift.applyBreak();

        System.out.println();

        thar.moveForward();
        thar.moveBackward();
        thar.moveLeft();
        thar.moveRight();
        thar.applyBreak();
    }
    
}
