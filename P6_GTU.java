/*
Write a program that prompts the user to enter three integers and display the integers in decreasing order.
*/

import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;
public class P6_GTU {
    public static void main(String[] args) {
        
        //variable
        int[] a;
        int temp=0;

        a=new int[3];

        Scanner in=new Scanner(System.in);

        //input
        System.out.print("\nPlease enter the first number : ");
        a[0]=in.nextInt();
        System.out.print("\nPlease enter the Second number : ");
        a[1]=in.nextInt();
        System.out.print("\nPlease enter the Third number : ");
        a[2]=in.nextInt();


        System.out.println("\nThe Decending order of your given numbers are.....");

        //loop For ordering a number in decreasing.
        for(int i=0;i<2;i++)
        {
            for(int j=1;j<3;j++)
            {
                if(a[i]<a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
            }
        }

        //print the number.
        for(int i=0;i<3;i++)
        {
            System.out.println(a[i]);
        }
    }

}
