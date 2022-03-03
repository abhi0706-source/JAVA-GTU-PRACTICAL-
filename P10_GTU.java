
/*
Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the
numbers, display the numbers.
*/

import java.util.Scanner;

public class P10_GTU {
    public static void main(String[] args) {
    
        int[] a;
        a=new int[10];
        
        Scanner in=new Scanner(System.in);

        for(int i=0;i<a.length;i++)
        {
            System.out.print("\nPlease enter number "+(i+1)+" : ");
            a[i]=in.nextInt();
        }

        System.out.println("Brefore reversing...");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println("\n");
        Reverse(a);

    }

    public static void Reverse(int[] x)
    {
        int temp=0,j=0;
        int n=x.length;


        for(int i=0;i<n/2;i++)
        {
            j=n-1;
            temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            n--;

        }

        System.out.println("After reversing...");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }

        System.out.println("\n");
    }


    
}
