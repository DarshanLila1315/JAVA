// 7 Write a program in Java to print all 3-digit prime numbers.[C]

public class Lab4C7 {

    public static void result(){

        for (int i = 100; i <= 999; i++) {
            int flag = 1;
            for(int j=2; j<Math.sqrt(i); j++){   // for(int j=2; j<i/2; j++) 
                if (i%j==0) {
                   flag = 0;
                   break;
                }
            }
            if(flag==1){
                System.out.println(" " + i);
            }
        }
    }
    public static void main(String[] args) {
        result();
    }
}
