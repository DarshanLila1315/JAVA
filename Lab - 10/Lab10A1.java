/*The  abstract  vegetable  class  has three  subclasses  named  Potato,  Brinjal and  Tomato. 
Write a java program that demonstrates how to establish this class hierarchy. Declare 
one instance variable of type String that indicates the color of a vegetable. Create and 
display instances of these objects. Override the toString() method of object to return a 
string with the name of vegetable and its color.*/

import java.util.*;

public class Lab10A1 {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        potato.display();
        brinjal.display();
        tomato.display();
    }
    
}

abstract class Vegetable{
    abstract void display();
}

class Potato extends Vegetable{
    String colorsString;
    Potato(String color){
        this.colorsString=color;
    }
    void display(){
        System.out.println("Potato colors: "+this.colorsString);
    }
}

class Brinjal extends Vegetable{
    String colorsString;
    Brinjal(String color){
        this.colorsString=color;
    }
    void display(){
        System.out.println("Brinjal colors: "+this.colorsString);
    }
}

class Tomato extends Vegetable{
    String colorsString;
    Tomato(String color){
        this.colorsString=color;
    }
    void display(){
        System.out.println("Tomato colors: "+this.colorsString);
    }
}