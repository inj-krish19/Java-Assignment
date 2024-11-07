/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 3: Conditional Statements and Loops

Program - 4 Write a program that uses a while loop 
to calculate the factorial of a given number.

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program4{
    
    public static void main( String[] args ){
        
        Scanner input = new Scanner( System.in );

        System.out.print("\nEnter a Number For Ending Factorial : ");

        int number = input.nextInt();

        int i = 0;

        int a = 0, b = 1, temp = -1;

        while( i < number ){
            
            temp = b;
            b = a;
            System.out.print( a + " ");
            a = a + temp;
            i++;

        }

        System.out.println("\n\n");

    }


}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Number For Printing Table : 5


Table Of 5


5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

*****************************************



Table Of 19


19 * 1 = 19
19 * 2 = 38
19 * 3 = 57
19 * 4 = 76
19 * 5 = 95
19 * 6 = 114
19 * 7 = 133
19 * 8 = 152
19 * 9 = 171
19 * 10 = 190


--------------------------------------------

*/