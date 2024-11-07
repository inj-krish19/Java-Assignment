/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 3: Conditional Statements and Loops

Program - 1 Write a program that takes a number as input 
and determines whether it is even or odd 
using an if-else statement.

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program1{
    
    public static void main( String[] args ){
        
        Scanner input = new Scanner( System.in );

        System.out.print("\nEnter a Number : ");

        int number = input.nextInt();

        if( number % 2 == 0 ){
            System.out.println( number + " Is Even \n\n");
        }else{
            System.out.println( number + " Is Even \n\n");
        }


    }


}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter a Number : 5
5 Is Even 


************************************

Enter a Number : 7858
7858 Is Even 

--------------------------------------------

*/