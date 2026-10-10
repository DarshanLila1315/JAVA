// 5.2 - Write a program that creates and initializes a four integer element array. Calculate and  display the average of its values.[A] 

import java.util.*;
public class Lab5A2 {
    public static void main(String[] args) {
        int sum=0 ;
        int avg = 0;
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) 
        {
           System.out.println("Enter A["+i+"]");
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            sum = sum + i;
            avg = sum / a.length;
        }
        System.out.println("Sum : "+sum); 
         System.out.println("Avg : "+avg);       
    }
}

/*
PS C:\Users\student\Desktop\BHAVIN\Java> 
PS C:\Users\student\Desktop\BHAVIN\Java>  c:; cd 'c:\Users\student\Desktop\BHAVIN\Java'; & 'C:\Program Files\Java\jdk-25.0.2\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\student\AppData\Roaming\Code\User\workspaceStorage\cb228aa5997725858bb360753b120f6e\redhat.java\jdt_ws\Java_57251acb\bin' 'Lab5A2' 
Enter A[0]
50
Enter A[1]
60
Enter A[2]
70
Sum : 180
Avg : 60
*/