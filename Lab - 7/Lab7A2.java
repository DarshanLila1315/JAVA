// Write a Java program to find the angle between the hour and minute hands

import java.util.*;

public class Lab7A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  h , m;
        h= sc.nextInt();
        m= sc.nextInt();
        Angle a1 = new Angle();
        double A=a1.calculateAngle(h, m);
        System.out.println(A);
        
    }
}

class Angle {
    static double calculateAngle(int hour, int minutes) {
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}