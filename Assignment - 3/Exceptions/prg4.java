/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 4 : Write a program which creates an array of Date in form (dd/mm/yy). 
Analyze each  element and check whether the date is correct or not. 
If the date is wrong then throw a  User defined Exception DateException 
and display the appropriate message. If the Date  is correct then display 
the date in this format. For example, if the date is 9/9/06 then  
display the date like 9th September 2006. You are able to display all 
the dates in the  given String and for the date which is not proper, 
display the appropriate message.

------------------------------------------------------------------

*/

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

class DateException extends Exception{

    DateException( ){
        System.out.println("\nDate Is Invalid \n");
    }

    DateException( String error ){
        System.out.println(error);
        System.exit(0);
    }

}

class Program4{

    public static void check( String _date ){

        try{

            StringTokenizer date_array = new StringTokenizer( _date, "/" );

            if( date_array.countTokens() != 3 ){    throw new DateException("\nDate Has Different or Invalid Syntax. It Should Be Like DD/MM/YYYY. \n");  }

            int dateArray[] = new int[3];

            int i = 0;
            while( date_array.hasMoreTokens() ){
                dateArray[i++] = Integer.parseInt( date_array.nextToken() );
            }

            if( dateArray[2] <= 0 ){    throw new DateException("\nYear Is Invalid. \n");  }
            if( dateArray[1] < 1 || dateArray[1] > 12 ){   throw new DateException("\nMonth Is Invalid. \n");  }
            if( dateArray[0] < 1 || dateArray[0] > 31 ){   throw new DateException("\nDate Is Invalid. \n");  }

            if( dateArray[2] % 400 == 0 || ( dateArray[2] % 4 == 0 && dateArray[2] % 100 != 0 ) ){
                if( dateArray[1] == 2 && dateArray[0] > 29 ){   throw new DateException("\nFebruary Cannot Have Date Above 29 \n");  }
            }else{
                if( dateArray[1] == 2 && dateArray[0] > 28 ){   throw new DateException("\nExcept Leap Year February Cannot Have Date Above 28 \n");  }
            }

            if( ( dateArray[1] == 4 || dateArray[1] == 6 || dateArray[1] == 9 || dateArray[1] ==11 ) && dateArray[0] == 31  ){
                throw new DateException("\nThis Month Cannot Have Date 31 \n");
            }

            String postfix="th ",month = "";

            if( dateArray[0] % 10 == 1 && dateArray[0] != 11 ){    postfix = "st ";    }
            if( dateArray[0] % 10 == 2 && dateArray[0] != 12 ){    postfix = "nd ";    }
            if( dateArray[0] % 10 == 3 && dateArray[0] != 13 ){    postfix = "rd ";    }

            String months[] = {"","January","February","March","April","May","June","July","August","September","October","November","December"}; 
            month = months[dateArray[1]];

            String year = ", " + Integer.toString( dateArray[2] ).substring(2);
            System.out.println( "\nDate Is Valid. Date : " + dateArray[0] + postfix + month +  year  +"\n" );

        }catch( DateException de ){}

    }

    public static void main( String[] args ){

        
        Program4.check( "29/02/2005" );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Date Is Valid. Date : 19th February, 05

******************************************


Except Leap Year February Cannot Have Date Above 28

--------------------------------------------

*/