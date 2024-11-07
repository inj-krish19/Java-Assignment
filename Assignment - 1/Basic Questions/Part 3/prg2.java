/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 3: Conditional Statements and Loops

Program - 2 Implement a program that uses a switch-
 statement to determine the day of the week 
based on a numeric input (1 for Monday, 2 for Tuesday, etc.)

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program2{
    
    public static void main( String[] args ){
        
        Scanner input = new Scanner( System.in );

        System.out.print("\nEnter a Number For Knowing Day : ");

        int number = input.nextInt();

        if( number < 0 ){
            System.out.println("\n\nToday Is Holiday\n\n");
        }

        switch( number % 7 ){

            case 1 :
                System.out.println("\n\nDay Is Monday\n\n");
                break;

            case 2:
                System.out.println("\n\nDay Is Tuesday\n\n");
                break;

            case 3 :
                System.out.println("\n\nDay Is Wednesday\n\n");
                break;

            case 4:
                System.out.println("\n\nDay Is Thursday\n\n");
                break;

            case 5 :
                System.out.println("\n\nDay Is Friday\n\n");
                break;

            case 6:
                System.out.println("\n\nDay Is Saturday\n\n");
                break;

            case 7 :
            case 0 :
                System.out.println("\n\nDay Is Sunday\n\n");
                break;

            default :
                System.out.println("\n\nToday Is Holiday\n\n");

        }


    }


}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Number For Knowing Day : 0


Day Is Sunday


************************************


Enter a Number For Knowing Day : 4


Day Is Thursday

************************************


Enter a Number For Knowing Day : 7


Day Is Sunday

************************************


Enter a Number For Knowing Day : 5


Day Is Friday


--------------------------------------------

*/