/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 7:  Write an application that reads and processes 
strings from the console. Perform the following functions 
based on the menu choice selected by the user.

 Reverse the sequence of strings and then display it.
 Reverse the sequence of characters in each string and then display it.
 rearrange the strings according to the length of the string.
 Sorting
 Concatenation
 Change them to uppercase, lowercase depending on user’s choice

------------------------------------------------------------------

*/

import java.util.Scanner;
import java.util.StringTokenizer;

class buildString{

    private Scanner input = new Scanner( System.in );
    private StringBuilder string;
    private StringTokenizer tokens;

    public void setString(){
        System.out.print("\n\nEnter a Line : ");
        this.string = new StringBuilder( input.nextLine() );
        this.showString();
        this.tokens = new StringTokenizer( new String(this.string) );
    }

    public void showString(){
        System.out.println("\nString Is " + this.string + " \n");
    }

    public void reverseSequence(){
        while( tokens.hasMoreTokens() ){
            String token = this.tokens.nextToken();
            this.reverseSequence();
            System.out.print( token + " ");
        }
    }

    public void reverseCharacters(){
        this.tokens = new StringTokenizer( new String(this.string) );
        while( tokens.hasMoreTokens() ){
            String token = new StringBuilder( this.tokens.nextToken() ).reverse().toString();
            System.out.print( token + " "  );
        }
    }

    public void sortLength(){
        int length = 0;
        this.tokens = new StringTokenizer( new String(this.string) );
        while( tokens.hasMoreTokens() ){
            String temp = (String)tokens.nextToken();
            if( length < temp.length() ){
                length = temp.length();
            }
        }
        
        for( int i=0;i<=length;i++){
            this.tokens = new StringTokenizer( new String(this.string) );
            while( tokens.hasMoreTokens() ){
                String temp = (String)tokens.nextToken();
                if( i == temp.length() ){
                    System.out.print(temp + " ");
                }
            }
        }

    }

    public void concat(){
        System.out.print("\n\nEnter a Line : ");
        String temp = input.nextLine();
        this.string.append(temp);
        System.out.println("\nConcatination String with String Is " + this.string);
    }

    public void upper(){
        this.string = new StringBuilder(new String(this.string).toUpperCase());
        System.out.println(this.string);
    }

    public void lower(){
        this.string = new StringBuilder(new String(this.string).toLowerCase());
        System.out.println(this.string);
    }

}

class Program7{

    public static void main( String args[] ){

        buildString bs = new buildString();

        bs.setString();
        System.out.print("Reverse Sequence Is ");
        bs.reverseSequence();
        System.out.print("\nReverse Sequence Characters Are ");
        bs.reverseCharacters();
        System.out.print("\nSorting Sequence Based On Lengths Are ");
        bs.sortLength();
        bs.concat();
        System.out.println("\nString In Uppercase Is ");
        bs.upper();
        System.out.println("\nString In Lowercase Is ");
        bs.lower();
        System.out.println("\n\n");

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Line : Hello World Bro

String Is Hello World Bro

Reverse Sequence Is Bro World Hello
Reverse Sequence Characters Are olleH dlroW orB
Sorting Sequence Based On Lengths Are Bro Hello World

Enter a Line :  New Thing      

Concatination String with String Is Hello World Bro New Thing

String In Uppercase Is
HELLO WORLD BRO NEW THING

String In Lowercase Is
hello world bro new thing


--------------------------------------------

*/