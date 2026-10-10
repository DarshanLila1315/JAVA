/* 8A1 - Write a program to add two different Time class’s objects. Time class contains 3
fields hours, Minute and Seconds. (Take input from user and assume user will
always enter a valid data, e.g. if Time1 is 02:55:55 and Time2 is 03:07:10 then
result is 06:03:05) [A] */

import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    
    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    Time add(Time t) {
        int s = seconds + t.seconds;
        int m = minutes + t.minutes;
        int h = hours + t.hours;

        if (s >= 60) {
            s = s - 60;
            m++;
        }

        if (m >= 60) {
            m = m - 60;
            h++;
        }

        return new Time(h, m, s);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class Lab8A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time 1 (H:M:S): ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.print("Enter Time 2 (H:M:S): ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        Time result = t1.add(t2);

        System.out.print("Result = ");
        result.display();
    }
}

/*
Enter Time 1 (H:M:S): 10
30
20
Enter Time 2 (H:M:S): 10
20
40
Result = 20:51:00
*/