/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Write a class called Statistics, which has a 
static method called average, which takes a one dimensional 
array for double type, as parameter, and prints the average 
for the values in the  array. 

a. Now write a class with the main method, which creates a 
two-dimensional array for the  four weeks of a month, 
containing minimum temperatures for the days of the week
(an  array of 4 by 7), and uses the average method of the 
Statistics class to compute and  print the average temperatures 
for the four weeks. 


------------------------------------------------------------------

*/

import java.util.Scanner;

class Statistics{

    Statistics(  ){}

    double average( double ary[] ){
        double average = 0;
        for (double number : ary) {
            average += number;
        }
        return average / ary.length;
    }

}

class Program1{

    public static void main( String args[] ){

        Statistics array = new Statistics();

        double ary[][] = new double[4][7];

        System.out.println("\n\nTemperature Of Weeks : \n");

        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                ary[i][j] = Math.ceil( Math.random() * 50 );
            }
        }

        for(int i=0;i<4;i++){
            System.out.print("Week " + (i+1) + " : " );
            for(int j=0;j<7;j++){
                System.out.print( ary[i][j] + " " );
            }
            System.out.println("\nAverage Of Week " + (i+1) + " Is " + array.average( ary[i] ) + "\n" );
        }


    }

}

/*

-----------------------------------------

Output :

-----------------------------------------



Temperature Of Weeks :

Week 1 : 33.0 17.0 37.0 13.0 39.0 50.0 10.0
Average Of Week 1 Is 28.428571428571427

Week 2 : 29.0 33.0 50.0 34.0 24.0 32.0 26.0
Average Of Week 2 Is 32.57142857142857

Week 3 : 25.0 44.0 26.0 24.0 20.0 16.0 49.0
Average Of Week 3 Is 29.142857142857142

Week 4 : 50.0 41.0 2.0 9.0 3.0 50.0 29.0
Average Of Week 4 Is 26.285714285714285

--------------------------------------------

*/