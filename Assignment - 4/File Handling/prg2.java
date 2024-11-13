/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 2 : Write a program to copy contents from one file to another file.

------------------------------------------------------------------

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Program2{

    public static void main( String[] args ){
    
        try{

            int data;
            StringBuilder content = new StringBuilder();
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");

            while( ( data = fr.read() ) != -1 ){
                content.append( (char)data );
            }

            fw.write( content.toString() );
            fr.close();     fw.close();
            System.out.println("\nSuccessfully Copied Content of source.txt to destination.txt.\n");

        }catch( IOException ie ){
            System.out.println("\nFailed To Running Program.\n");
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Successfully Copied Content of source.txt to destination.txt.

--------------------------------------------

*/