/**
Write a method with following method header.
public static int gcd(int num1, int num2)
Write a program that prompts the user to enter two integers and compute the gcd of two integers.
*/
import java.util.Scanner;

public class P9_gtu {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);

        //Input.
        System.out.print("\nPlease enter the first number : ");
        a=in.nextInt();
        System.out.print("\nPlease enter the second number : ");
        b=in.nextInt();

        if(a<1 || b<1)
        {
            System.out.print("\nPlease enter positve interger number only.");
            System.exit(0);
        }
        else
        {
            //calling GDC Method.
            c=gcd(a,b);
            System.out.println("\nThe value of GDC : "+c);
        }
            
    }

    public static int gcd(int num1, int num2)
    {
        int a=1,fact=1,x,y,r,rem;
        
        //Find common factors and multiple it.
        while(num1!=1 && num2!=1)
        {
            if(num1%2==0 && num2%2==0)
            {
                a=2;
                num1=num1/2;
                num2=num2/2;
            }
            else if(num1%3==0 && num2%3==0)
            {
                a=3;
                num1=num1/3;
                num2=num2/3;
            }
            else if(num1%5==0 && num2%5==0)
            {
                a=5;
                num1=num1/5;
                num2=num2/5;
            }
            else if(num1%7==0 && num2%7==0)
            {
                a=7;
                num1=num1/7;
                num2=num2/7;
            }
            else
            {
                if(num1!=1 && num2!=1)
                {
                    x=num1;
                    y=num2;
                    //Find SameFact Method.
                    a=SameFact(x,y);
                    num1=1;
                    num2=1;
                }
            }
            fact=fact*a;
            
        }
        return fact;
    }

    public static int SameFact(int x,int y) {
        int a,rem=0,r=0;
        
        //Find indvidual factor of both numbers.
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
                x=x/7;
            }
            else if(x!=1)
            {
                rem=x;
                x=1;
            }
            
           
        }
        
        

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
        else if(y!=1)
        {
            r=y;
            y=1;
        }
    }

    //Compare both number last reminder.
    if(rem==r)
    {
        a=r;
        return a;
    }
    else
    {
        return 1;
    }
    
    
}    
}

