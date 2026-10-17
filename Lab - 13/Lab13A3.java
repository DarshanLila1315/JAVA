/*
Write a program to create two threads, one thread will print odd numbers and second 
thread will print even numbers between 1 to 20 numbers
 */
public class Lab13A3 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddNumberThread());
        Thread evenThread = new Thread(new EvenNumberThread());

        oddThread.start();
        evenThread.start();
    }

    
}
class OddNumberThread implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

class EvenNumberThread implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
 