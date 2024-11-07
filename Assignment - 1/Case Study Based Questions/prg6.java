/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 6 : BMI Calculator

Create a program that calculates a person's Body Mass Index (BMI) 
and provides an interpretation of the result. 
The program should have the following features :

 Prompt the user to enter their height (in meters) and weight (in kilograms).

 Calculate the BMI using the formula: 
 BMI = weight / (height * height).

 Determine the BMI category (underweight, normal, overweight, or obese) 
 based on the calculated BMI.

 Display the user's BMI value and the corresponding BMI category.


------------------------------------------------------------------

*/

import java.util.Scanner;

class BMICalculator{

    private double height;
    private double weight;
    private double BMI;
    private String category;

    BMICalculator(){}

    BMICalculator( double h ,double w){
        height = h;
        weight = w;
    }

    void calculateBMI(){

        BMI = weight / ( height * height) ;

        System.out.println("\nBMI Of Height " + height + " and Weight "  + weight + " Is " + BMI + "\n");

    }

    void giveCategory(){

        if( BMI < 18.5 ){
            category = "UnderWeight";
        }else if( BMI < 25 ){
            category = "Normal";
        }else if( BMI < 30 ){
            category = "OverWeight";
        }else{
            category = "Obese";
        }

        System.out.println("\nFor BMI Score " + BMI + " Category Is " + category + "\n");

    }

}


class Program6{

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        double height,weight;

        System.out.print("\n\nEnter a Height : ");

        height = input.nextDouble();

        System.out.print("\n\nEnter a Width : ");

        weight = input.nextDouble();

        BMICalculator b = new BMICalculator( height,weight );

        b.calculateBMI();
        b.giveCategory();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Height : 1.8


Enter a Width : 70

BMI Of Height 1.8 and Weight 70.0 Is 21.604938271604937


For BMI Score 21.604938271604937 Category Is Normal

********************************


Enter a Height : 1.5


Enter a Width : 100

BMI Of Height 1.5 and Weight 100.0 Is 44.44444444444444


For BMI Score 44.44444444444444 Category Is Obese

********************************

--------------------------------------------

*/