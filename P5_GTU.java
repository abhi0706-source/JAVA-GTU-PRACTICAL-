/*
Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.
*/
import java.util.Scanner;


public class P5_GTU {
    public static void main(String[] args) {
        
        //variable
        char a;
        Boolean f;
        Scanner in= new Scanner(System.in);

        //Input.
        System.out.print("\nPlease enter character : ");
        a=in.next().charAt(0);
        
        f=Character.isLetter(a);

        //conditions
        if(f==true)
        {
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
            {
                System.out.println("Your entered character is Vowel.");
            }
            else if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
            {
                System.out.println("Your entered character is Vowel.");
            }
            else
            {
                System.out.println("Your entered character is Constant.");
            }
        }
        else
        {
            System.out.println("\nPlease enter a character only.");
        }

        
    }
    
}
