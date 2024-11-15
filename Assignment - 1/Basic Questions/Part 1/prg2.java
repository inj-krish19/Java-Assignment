/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 1: Data Types, Variables, and Arithmetic Operations

Program - 2 : Write a program that calculates the 
area and perimeter of a rectangle, given the length 
and width as input

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program2{
	public static void main( String[] args){
		
		System.out.println( "\n\nEnter Details For Rectangle\n\n");

		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter Length and Width : ");
		float length = input.nextFloat();
		float width = input.nextFloat();

		System.out.println( "Length Is " + length );
		System.out.println( "Width Is " + width );

		System.out.println( "Perimeter Of Rectangle Is " + perimeter(length,width) );
		System.out.println( "Perimeter Of Rectangle Is " + area(length,width) );

	}

	public static float perimeter( float length,float width ){
		return 2 * ( length + width );
	}

	public static float area( float length,float width ){
		return length * width ;
	}

}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter Details For Rectangle


Enter Length and Width : 67 87
Length Is 67.0
Width Is 87.0
Perimeter Of Rectangle Is 308.0
Perimeter Of Rectangle Is 5829.0

***********************************



Enter Details For Rectangle


Enter Length and Width : 5 7
Length Is 5.0
Width Is 7.0
Perimeter Of Rectangle Is 24.0
Perimeter Of Rectangle Is 35.0


--------------------------------------------

*/
