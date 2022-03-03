/*
Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
program to generate a plate number.
*/
import java.lang.Math;
import java.util.Random;

public class P7_gtu {
     public static void main(String[] args) {
        int a,x;

        System.out.println("\nThe vehicle plate number is ...");
        //Generate Letter of Numberplate.
        for(int i=0;i<3;i++)
        {
            a='A'+(int)(Math.random() * ('Z'-'A'));
            System.out.print((char)a);
        }
        
        //Generate Number of Numberplate.
        x=(int)(Math.random() * 10000);
        System.out.println("-"+x);

    }
    
}
