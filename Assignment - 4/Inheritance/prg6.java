/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 6 : Define an one dimensional array "vivid" of type float. 
Read the values from the keyboard to load the array. 
Calcualte and then print the average of all the values in "vivid"..

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program6{

    public static void main( String[] args ){

        int size;
        float vivid[];
        Scanner input = new Scanner( System.in );

        System.out.print("\nEnter The Size Of Vivid Array : ");
        size = input.nextInt();
        vivid = new float[size];

        double average = 0;

        for ( int i=0; i<size; i++ ) {
            System.out.print("\nEnter The Element " + (i+1) + " : ");
            vivid[i] = input.nextFloat();
            average += vivid[i];
        }

        average /= size;

        System.out.print("\nAverage Of Vivid Array : " + average + "\n\n" );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter The Size Of Vivid Array : 5

Enter The Element 1 : 10

Enter The Element 2 : 20

Enter The Element 3 : 30

Enter The Element 4 : 40

Enter The Element 5 : 50

Average Of Vivid Array : 30.0

--------------------------------------------

*/