
/*
(3) Write a JAVA program that reads a number in meters, converts it to feet, and displays the result.
*/

import java.util.Scanner;

public class P1c_gtu {
    public static void main(String[] args) {
    
        double meter,feet;

        Scanner in=new Scanner(System.in);
        System.out.print("\nEnter the value in meter : ");
        meter=in.nextDouble();

        feet=(meter*3.28084);

        System.out.println("Value of lenght in feet is "+feet);
    }
    
}
