/**
 Write a java program that implements a multi-thread application that has
three threads. First thread generates random integer every 1 second and if
the value is even, second thread computes the square of the number and
prints. If the value is odd, the third thread will print the value of cube of
the number.
 */
public class Lab13B5 {

    public static void main(String[] args) {
        Number number = new Number();
        Thread1 t1 = new Thread1(number);
        Thread2 t2 = new Thread2(number);
        Thread3 t3 = new Thread3(number);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Number {
    int value;
    boolean isEven;

    synchronized public void generate() {
        while (isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        value = (int) (Math.random() * 100);
        isEven = (value % 2 == 0);
        System.out.println("Generated: " + value);
        notifyAll();
    }

    synchronized public void computeSquare() {
        while (!isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Square: " + (value * value));
        isEven = false;
        notifyAll();
    }

    synchronized public void computeCube() {
        while (isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Cube: " + (value * value * value));
        isEven = true;
        notifyAll();
    }
}

class Thread1 extends Thread {
    Number number;

    public Thread1(Number number) {
        this.number = number;
    }

    public void run() {
        while (true) {
            number.generate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread {
    Number number;

    public Thread2(Number number) {
        this.number = number;
    }

    public void run() {
        while (true) {
            number.computeSquare();
        }
    }
}

class Thread3 extends Thread {
    Number number;

    public Thread3(Number number) {
        this.number = number;
    }

    public void run() {
        while (true) {
            number.computeCube();
        }
    }
}


