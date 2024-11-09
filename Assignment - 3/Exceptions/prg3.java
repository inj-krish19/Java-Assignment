/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 3 : Write a program which creates an Array of character. 
Make one function with one  argument as a character and that function 
throw a user defined exception if the character  that u have passed is digit. 

------------------------------------------------------------------

*/

class DigitError extends Exception{

    DigitError( ){
        System.out.println("\nCharacter Is Digit. Unacceptable Array. \n");
    }

    DigitError( String error ){
        System.out.println(error);
    }

}

class Program3{

    public static void check( char[] chars ){

        try{

            for( char character : chars ){
                if( character >= 48 && character <= 57 ){
                    throw new DigitError();
                }
            }
            
            System.out.println("\nAll The Elements Are Characters. Acceptable Array. \n");

        }catch( DigitError de ){}

    }

    public static void main( String[] args ){

        char[] characters = {'i','n','j','-','k','r','i','s','h'};
        Program3.check( characters );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Character Is Digit. Unacceptable Array.

********************************************

All The Elements Are Characters. Acceptable Array.

--------------------------------------------

*/