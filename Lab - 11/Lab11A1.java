// Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
// A2.  Interface  A12  inherits  from  both  A1  and  A2.Each  interface  declares  one  constant 
// and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants

import java.util.*;

public class Lab11A1 {
    public static void main(String[] args) {
        B object = new B();
        object.displayA();
        object.displayA1();
        object.displayA2();
        object.displayA12();
    }
}

interface A {
    String A_CONSTANT = "Constant from A";

    void displayA();
}

interface A1 extends A {
    String A1_CONSTANT = "Constant from A1";

    void displayA1();
}

interface A2 extends A {
    String A2_CONSTANT = "Constant from A2";

    void displayA2();
}

interface A12 extends A1, A2 {
    String A12_CONSTANT = "Constant from A12";

    void displayA12();
}

class B implements A12 {
    public void displayA() {
        System.out.println(A_CONSTANT);
    }

    public void displayA1() {
        System.out.println(A1_CONSTANT);
    }

    public void displayA2() {
        System.out.println(A2_CONSTANT);
    }

    public void displayA12() {
        System.out.println(A12_CONSTANT);
    }
}

