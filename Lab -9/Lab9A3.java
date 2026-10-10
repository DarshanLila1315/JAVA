
import  java.util.*;

class a{
    int a1=11;
    a(){
        System.out.println("Constructor of class a");
    }

    public void display(){
        
        System.out.println(a1);
    }
}

class b extends a{
    int b1=111;
    b(){
        System.out.println("Constructor of class b");
        super();
    }
    void display1(){
        
        System.out.println(b1);
        super.display();
    }
}

public class Lab9A3 {
    public static void main(String[] args) {
    
        b objB = new b();
        objB.display();
    }
}
