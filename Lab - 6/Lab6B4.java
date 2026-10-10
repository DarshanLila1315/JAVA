// Implement an array  with 5  elements in class A.  Create four methods for array 
// operation(sortArray(),  searchArray(),  SumArray(),  and  avgArray())  and  call  all  the  four 
// methods using object

import java.util.*;

public class Lab6B4 {
    public static void main(String[] args) {
        Arr a1 = new Arr();
        
        a1.sortArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");4
        int n = sc.nextInt();
        a1.searchArray(n);
        a1.sumArray();
        a1.avgArray();
    }
}

class Arr {
    int ar[] = new int[5];
    int sum = 0;
    double avg = 0.0;

    Arr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in array");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
    }

    void sortArray() {
        for (int step = 0; step < ar.length - 1; ++step) {
            int swapped = 0;
            for (int i = 0; i < ar.length - step - 1; ++i) {
                if (ar[i] > ar[i + 1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0)
                break; // Array is sorted
        }
        System.out.println("Sorted array is: " + Arrays.toString(ar));
    }

    

    void searchArray(int x) {
        boolean found = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(x + " is found");
        } else {
            System.out.println(x + " is not found");
        }
    }

    void sumArray() {
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        System.out.println("Sum  is: " + sum);
    }

    void avgArray() {
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        avg = (double) sum / ar.length;
        System.out.println("Average  is: " + avg);
    }

}
