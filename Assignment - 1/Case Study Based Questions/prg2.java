/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 2 : Temperature Analyzer

Create a program that analyzes temperature data. 
The program should have the following features:
  
  Allow the user to input a series of temperature readings (in Celsius).
  
  Calculate and display the average temperature.
  
  Determine and display the highest and lowest temperatures.
  
  Categorize the temperatures into "cold," "mild," and "hot"
  based on predefined temperature ranges.


------------------------------------------------------------------

*/

import java.util.Scanner;

class TemperatureAnalyzer{
    
    private int count;
    private double[] temperature;

    TemperatureAnalyzer(){}

    void getTemperature( ){


        System.out.print("\n\nEnter Total Temperature Count : ");

        Scanner input = new Scanner(System.in);
        
        count = input.nextInt();

        temperature = new double[count];

        for(int i=0;i<count;i++){

            System.out.print("\nEnter Temepature " + (i+1) + " (In Celsius) : ");
            temperature[i] = input.nextDouble();

        }

    }

    void averageTemperature(){

        double average = 0;

        for(int i=0;i<count;i++){
            average += temperature[i];
        }

        average /= count;

        System.out.println( "\n\nAverage Of Temperatures Is " + average + "\n\n");

    }

    void minTemperature(){

        double min = temperature[0];

        for(int i=0;i<count;i++){
            if( min > temperature[i] ){
                min = temperature[i];
            }
        }

        System.out.println( "Minimum Of Temperatures Is " + min + "\n\n");

    }

    void maxTemperature(){

        double max = temperature[0];

        for(int i=0;i<count;i++){
            if( max < temperature[i] ){
                max = temperature[i];
            }
        }

        System.out.println( "Maximum Of Temperatures Is " + max + "\n\n");

    }

    void categorizeTemperature(){

        double average;

        for(int i=0;i<count;i++){
            System.out.print( "Temperature " + (i+1) + " : ");

            if( temperature[i] < 20 ){
                System.out.println( "Cold");
            }else if( temperature[i] < 40 ){
                System.out.println( "Mid");
            }else{
                System.out.println( "Hot");
            }

        }

        System.out.println( "\n\n");

    }

}


class Program2{

    public static void main( String[] args ){

        TemperatureAnalyzer t = new TemperatureAnalyzer();

        t.getTemperature();
        t.averageTemperature();
        t.minTemperature();
        t.maxTemperature();
        t.categorizeTemperature();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------


Enter Total Temperature Count : 5

Enter Temepature 1 (In Celsius) : 32

Enter Temepature 2 (In Celsius) : 45

Enter Temepature 3 (In Celsius) : 12

Enter Temepature 4 (In Celsius) : 56

Enter Temepature 5 (In Celsius) : -2


Average Of Temperatures Is 28.6


Minimum Of Temperatures Is -2.0


Maximum Of Temperatures Is 56.0


Temperature 1 : Mid
Temperature 2 : Hot
Temperature 3 : Cold
Temperature 4 : Hot
Temperature 5 : Cold



********************************



Enter Total Temperature Count : 9

Enter Temepature 1 (In Celsius) : 12

Enter Temepature 2 (In Celsius) : 23

Enter Temepature 3 (In Celsius) : 45

Enter Temepature 4 (In Celsius) : 67

Enter Temepature 5 (In Celsius) : 76

Enter Temepature 6 (In Celsius) : 34

Enter Temepature 7 (In Celsius) : -9 

Enter Temepature 8 (In Celsius) : 0

Enter Temepature 9 (In Celsius) : 23


Average Of Temperatures Is 30.11111111111111


Minimum Of Temperatures Is -9.0


Maximum Of Temperatures Is 76.0


Temperature 1 : Cold
Temperature 2 : Mid
Temperature 3 : Hot
Temperature 4 : Hot
Temperature 5 : Hot
Temperature 6 : Mid
Temperature 7 : Cold
Temperature 8 : Cold
Temperature 9 : Mid



--------------------------------------------

*/