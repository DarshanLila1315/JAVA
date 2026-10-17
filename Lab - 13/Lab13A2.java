/*
Write an application that executes two threads. One thread displays "Good Morning" 
every  1000  milliseconds  &  another  thread  displays  "Good  Afternoon"  every  3000 
milliseconds. Create the threads by implementing the Runnable interface

 */

public class Lab13A2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new GoodMorningThread());
        Thread thread2 = new Thread(new GoodAfternoonThread());

        thread1.start();
        thread2.start();
    }
}

class GoodMorningThread implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GoodAfternoonThread implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}