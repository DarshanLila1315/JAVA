// Write a program to implement the solution to producer consumer problem in Java

public class Lab13B4 {
    public static void main(String[] args) {
        Product p = new Product();
        Producer producer = new Producer(p);
        Consumer consumer = new Consumer(p);
        producer.start();
        consumer.start();
    }

}

class Product {
    int item;
    boolean on = false;

    synchronized public void put(int item) {
        while (on) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
        on = true;
        this.item = item;
        System.out.println("Produced: " + item);
        notify();

    }

    synchronized public int get() {
        while (!on) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
        on = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
        
    }
}

class Producer extends Thread {
    Product p;

    public Producer(Product p) {
        this.p = p;
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                p.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread {
    Product p;

    public Consumer(Product p) {
        this.p = p;
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                p.get();
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}