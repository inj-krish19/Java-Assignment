/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 1: Data Types, Variables, and Arithmetic Operations

Program - 1 : Declare variables of different data types 
(int, double, boolean, char) and perform various 
arithmetic operations on them

------------------------------------------------------------------

*/

class Program1{
	public static void main( String[] args){
		
		int a = 19;
		int b = 78;

		char x = 'K';
		char y = 'S';

		double j = 19.5D;
		boolean bool = true;

		System.out.println( "Value Of a and b Is " + a + " " + b );
		System.out.println( "Value Of x and y Is " + x + " " + y );
		System.out.println( "Value Of j Is " + j );
		System.out.println( "Value Of bool Is " + bool );

		System.out.println( "\n\nOperations On Integer \n\n");


		System.out.println( "Addition : a + b = " + ( a + b ) );
		System.out.println( "Subtraction: a - b = " + ( a - b ) );
		System.out.println( "Multiplication : a * b = " + a * b );
		System.out.println( "Divison : a / b = " + a / b );
		System.out.println( "Modulos : a % b = " + a % b );


		System.out.println( "\n\nOperations On Float\n\n");


		System.out.println( "Addition : j + b = " + ( j + b ) );
		System.out.println( "Subtraction: j - b = " + ( j - b ) );
		System.out.println( "Multiplication : j * b = " + j * b );
		System.out.println( "Divison : j / b = " + j / b );
		System.out.println( "Modulos : j % b = " + j % b );


		System.out.println( "\n\nOperations On Character\n\n");


		System.out.println( "Addition : x + y = " + ( x + y ) );
		System.out.println( "Suytraction: x - y = " + ( x - y ) );
		System.out.println( "Multiplication : x * y = " + x * y );
		System.out.println( "Divison : x / y = " + x / y );
		System.out.println( "Modulos : x % y = " + x % y );
		System.out.println( "Equality : x == y = " + ( x == y ) );


		System.out.println( "\n\nOperations On Boolean\n\n");


//		System.out.println( "Addition : false + true  = " + ( false + true ) );
//		System.out.println( "Suytraction: false - true = " + ( false - true ) );
//		System.out.println( "Multiplication : false * true = " + ( false * true ) );
//		System.out.println( "Divison : true / false = " + ( true / false ) );
//		System.out.println( "Modulos : true % false = " + ( true % false ) );
		System.out.println( "Equality : true != false = " + ( true != false ) );

	}
}

/*

-----------------------------------------

Output :

-----------------------------------------


Value Of a and b Is 19 78
Value Of x and y Is K S
Value Of j Is 19.5
Value Of bool Is true


Operations On Integer


Addition : a + b = 97
Subtraction: a - b = -59
Multiplication : a * b = 1482
Divison : a / b = 0
Modulos : a % b = 19


Operations On Float


Addition : j + b = 97.5
Subtraction: j - b = -58.5
Multiplication : j * b = 1521.0
Divison : j / b = 0.25
Modulos : j % b = 19.5


Operations On Character


Addition : x + y = 158
Suytraction: x - y = -8
Multiplication : x * y = 6225
Divison : x / y = 0
Modulos : x % y = 75
Equality : x == y = false


Operations On Boolean


Equality : true != false = true


--------------------------------------------

*/