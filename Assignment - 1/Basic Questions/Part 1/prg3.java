/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 1: Data Types, Variables, and Arithmetic Operations

Program - 3 : Implement a program that converts temperature 
from Celsius to Fahrenheit and vice versa.

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program3{
	
	public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );

		char choice = 'x';

		do{ 

			System.out.print("\n\nEnter C For Converting Celsius to Fahrenhit\nEnter F For Coverting Fahrenhit to Celsius\nEnter Character : ");
			choice = input.next().charAt(0);
			System.out.println("");

		}while( choice != 'c' && choice != 'C' && choice != 'f' && choice != 'F' );

		double celsius,fahrenhit;

		if( choice == 'c' || choice == 'C' ){
			
			System.out.print( "Enter Celsius : ");
			celsius = input.nextDouble();

			fahrenhit = celTofah(celsius);

			System.out.println( "\n\n" + celsius + " Celsius In Fahrenhit Is " + fahrenhit );

		}else if( choice == 'f' || choice == 'F' ){
			
			System.out.print( "Enter Fahrenhit : ");
			fahrenhit = input.nextDouble();

			celsius = fahTocel(fahrenhit);

			System.out.println( "\n\n" + fahrenhit + " Fahrenhit In Celsius Is " + celsius );

		}else{
			System.out.println( "Enter Valid Character");
		} 

	}

	public static double celTofah( double celsius ){
		return 1.8 * celsius + 32;
	}

	public static double fahTocel( double fahrenhit ){
		return ( fahrenhit - 32 ) / 1.8;
	}

}

/*

-----------------------------------------

Output :

-----------------------------------------



Enter C For Converting Celsius to Fahrenhit
Enter F For Coverting Fahrenhit to Celsius
Enter Character : 45



Enter C For Converting Celsius to Fahrenhit
Enter F For Coverting Fahrenhit to Celsius
Enter Character : f

Enter Fahrenhit : 45


45.0 Fahrenhit In Celsius Is 7.222222222222222


************************************



Enter C For Converting Celsius to Fahrenhit
Enter F For Coverting Fahrenhit to Celsius
Enter Character : c

Enter Celsius : 45


45.0 Celsius In Fahrenhit Is 113.0




--------------------------------------------

*/
