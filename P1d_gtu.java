
/*
(4) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
weight in kilograms and dividing by the square of your height in meters. Write a JAVA program that
prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
*/


import java.util.Scanner;

public class P1d_gtu {
    public static void main(String[] args) {
        double inch,pound,BMI;

        System.out.println("\nWe have to find Body Mass Index (BMI) of your given data.");

        Scanner in= new Scanner(System.in);

        System.out.print("Please enter a height in inch : ");
        inch=in.nextDouble();
        
        System.out.print("Please enter a weight in pound : ");
        pound=in.nextDouble();
        

        BMI=(pound*703)/(inch*inch);

        System.out.println("The value of BMI is : "+BMI);
    }
    
}
