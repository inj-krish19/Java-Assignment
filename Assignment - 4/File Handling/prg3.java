/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 3 : Write a program to merge two file contents into another file.

------------------------------------------------------------------

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Program3{

    public static void main( String[] args ){
    
        try{

            int data;
            StringBuilder content = new StringBuilder();
            FileReader fr = new FileReader("words.txt");
            FileWriter fw = new FileWriter("merge.txt");

            while( ( data = fr.read() ) != -1 ){
                content.append( (char)data );
            }

            content.append( '\n' );
            fr = new FileReader("example.txt");

            while( ( data = fr.read() ) != -1 ){
                content.append( (char)data );
            }

            fw.write( content.toString() );
            fr.close();     fw.close();
            System.out.println("\nSuccessfully Merged Content of words.txt and example.txt into merge.txt.\n");

        }catch( IOException ie ){
            System.out.println("\nFailed To Running Program.\n");
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

--------------------------------------------

*/