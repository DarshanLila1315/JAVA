
import java.util.Scanner;

/*Create class Student with attributes (name: String, roll_no:int, SPI:double, 
course: String). Implement getter() and setter() method to assign data for 3 
students and display it.[A] 
 */
class Student {

    String name;
    int roll_no;
    double spi;
    String course;

    Scanner sc = new Scanner(System.in);

    void setter() {
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Roll No : " );
        roll_no = sc.nextInt();
        System.out.print("Enter SPI : ");
        spi = sc.nextDouble();
        System.out.print("Enter Course : ");
        course = sc.next();
    }

    void getter(String name, int roll_no, double spi, String course) {
        System.out.print("Name : " + name);
        System.out.print("Roll No : " + roll_no);
        System.out.print("SPI : " + spi);
        System.out.print("Course : " + course);
    }

}

public class LAb6A1 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        

        s1.setter();
        s2.setter();
        s3.setter();
        s1.getClass();
        s2.getClass();
        s3.getClass();

    }
}

/*
Enter Name : RAJ
Enter Roll No : 101
Enter SPI : 8.1
Enter Course : CSE

Enter Name : TOM
Enter Roll No : 102
Enter SPI : 8
Enter Course : CSE

Enter Name : KOHLI
Enter Roll No : 103
Enter SPI : 7
Enter Course : CSE
*/