/*
Write a program that reads an integer and displays all its smallest factors in increasing order. 
For example if input number is 120, the output should be as follows:2,2,2,3,5.
*/

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class P8_GTU {
    public static void main(String[] args) {
        int[] a;
        int fact=0,n=0,x,y,r=0,rem=0,i=0;
        
        Scanner in=new Scanner(System.in);
        System.out.println("\nWe have find the smallest factors in increasing order.");

        System.out.print("Please enter a number : ");
        x=in.nextInt();

        y=x;
        
        while(y!=1)
        {
            
            if(y%2==0)
            {
                r=2;
                y=y/2;
            }
            else if(y%3==0)
            {
                r=3;
                y=y/3;
            }
            else if(y%5==0)
            {
                r=5;
                y=y/5;
            }
            else if(y%7==0)
            {
                r=7;
                y=y/7;
            }
            else 
            {
                fact=1;
                break;
            }
            n++;
        }

        a=new int[n];

            System.out.print("The increasing order of factors are : 1");
            while(x!=1)
            {
                if(x%2==0)
                {
                    rem=2;
                    x=x/2;
                }
                else if(x%3==0)
                {
                    rem=3;
                    x=x/3;
                }
                else if(x%5==0)
                {
                    rem=5;
                    x=x/5;
                }
                else if(x%7==0)
                {
                    rem=7;
                    x=x/5;
                }
                else if(x!=1)
                {
                    rem=x;
                    x=1;
                }
                a[i]=rem;
                System.out.print(","+rem);
            }
            System.out.print(".");
    }
        
}
