//  Practical -3: Programs using operators and data types
/*
1.Illustrate the Operator  precedence.[A] 
a. 10 + 20 * 30 
b. 100 / 10 * 100 
c. 5 * 4 / 4 % 3 
d. 100 + 200 / 10 – 3 * 10 
*/
class Lab_3A1 {
    public static void main(String[] args) {
        System.out.println("a."+(10+20*30));
        System.out.println("b."+((100/10)*30));
        System.out.println("c."+(5*4/4%3));
        System.out.println("d."+(100+200/10-3*10));
        
    }
}
/*
a.610                              
b.300
c.2
d.90 */