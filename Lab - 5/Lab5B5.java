/*5.5 - Write an interactive program to print a string entered in a pyramid form. For instance, 
the string "stream" has to be displayed as follows:[B] 
 
s 
st 
str 
stre 
strea 
stream

*/

public class Lab5B5 {
    public static void main(String[] args) {
        String str = "stream";

        for (int i = 0; i <str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
             System.out.println();
        }
               
    }
}
/*
s
st
str
stre
strea
stream
*/