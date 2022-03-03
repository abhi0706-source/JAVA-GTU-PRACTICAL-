/*
2) Write a JAVA program that solves the following equation and displays the value x and y:
                      (1). 3.4x+50.2y=44.5 
                      (2). 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation
ax+by=e x=ed-bf/ad-bc
cx+dy=f y=af-ec/ad-bc )
*/

import java.util.Scanner;

public class P1b_gtu {
    public static void main(String[] args) {
        float a,b,c,d,e,f,x,y;

        System.out.println("\n Equation 1 Be like : ax+by=e");
        System.out.println("\n Equation 2 be like : ca+dy=f");


        Scanner in= new Scanner(System.in);

        System.out.print("\nEnter the value of a : ");
        a=in.nextFloat();

        System.out.print("\nEnter the value of b : ");
        b=in.nextFloat();

        System.out.print("\nEnter the value of e : ");
        e=in.nextFloat();

        System.out.print("\nEnter the value of c : ");
        c=in.nextFloat();

        System.out.print("\nEnter the value of d : ");
        d=in.nextFloat();

        System.out.print("\nEnter the value of f : ");
        f=in.nextFloat();

        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("The value of x is :"+x);
        System.out.println("The value of y is :"+y);
    }

}