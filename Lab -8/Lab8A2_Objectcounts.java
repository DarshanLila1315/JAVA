/*
8A2 - WAP that counts the number of objects created using static. [A] 
 */
import java.util.*;

public class Lab8A2_Objectcounts {

    static int count = 0;

    public Lab8A2_Objectcounts() {
        count++;
    }

    public static void main(String[] args) {
        Lab8A2_Objectcounts object1 = new Lab8A2_Objectcounts();
        Lab8A2_Objectcounts object2 = new Lab8A2_Objectcounts();
        Lab8A2_Objectcounts object3 = new Lab8A2_Objectcounts();
        Lab8A2_Objectcounts object4 = new Lab8A2_Objectcounts();
        Lab8A2_Objectcounts object5 = new Lab8A2_Objectcounts();
        System.out.println("Total Object is : " + Lab8A2_Objectcounts.count);
    }
}
/*
Total Object is : 5
*/
