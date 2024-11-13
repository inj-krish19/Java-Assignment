/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 1 : Write a program to read the content 
of a file and count the number of words in the file.

------------------------------------------------------------------

*/

import java.io.FileReader;
import java.io.IOException;

class Program1{

    public static void main( String[] args ){
    
        try{

            StringBuilder content = new StringBuilder();
            FileReader fr = new FileReader("words.txt");
            int words_count = 0, data;

            while( ( data = fr.read() ) != -1 ){
                content.append( (char)data );
            }

            char[] characters = content.toString().toCharArray();

            if( characters.length != 0 ){   words_count ++; }

            for ( int i=0; i<characters.length-1; i++ ) {
                if( characters[i] == ' ' && characters[i+1] != ' ' ){   words_count ++; }
            }

            System.out.println("\nwords.txt have " + words_count + " words.\n");

        }catch( IOException ie ){
            System.out.println("\nFailed To Running Program.\n");
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

words.txt have 45 words.

--------------------------------------------

*/