/*
5.6 - Write an interactive program to print a hollow square shape. For example, if user 
enters the number 5, the shape will be as follows:[C] 
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
*/

public class Lab5C6 {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 ||i == 4 ||j == 0 ||j == 4 ) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
             System.out.println();
        }    
    }
}

/*
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
*/