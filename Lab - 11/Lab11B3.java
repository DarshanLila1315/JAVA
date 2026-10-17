/*  The Transport interface  declares a deliver () method. The abstract  class Animal is the 
super  class  of  the  Tiger,  Camel,  Deer  and  Donkey  classes.  The  Transport  interface  is 
implemented by the Camel and Donkey classes. Write a test program that initialize an 
array  of  four  Animal  objects.  If  the  object  implements  the  Transport  interface,  the 
deliver () method is invoked */

public class Lab11B3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        for (Animal animal : animals) {
            animal.sound();
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
    }
}
interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger roars");
    }
}

class Camel extends Animal implements Transport {
    void sound() {
        System.out.println("Camel brays");
    }

    public void deliver() {
        System.out.println("Camel delivers goods");
    }
}

class Deer extends Animal {
    void sound() {
        System.out.println("Deer bleats");
    }
}

class Donkey extends Animal implements Transport {
    void sound() {
        System.out.println("Donkey brays");
    }

    public void deliver() {
        System.out.println("Donkey delivers goods");
    }
}
