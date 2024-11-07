/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 5:  WAP that inputs a line of text, 
tokenizes the line with StringTokenizer 
and outputs the tokens in reverse order.

------------------------------------------------------------------

*/

import java.util.Scanner;
import java.util.StringTokenizer;

class tokenString{

    private Scanner input = new Scanner( System.in );
    private String string;
    private StringTokenizer tokens;

    public void setString(){
        System.out.print("\n\nEnter a Line : ");
        this.string = input.nextLine();
    }

    public void cutWithTokens(){
        System.out.print("\n\nEnter a Token : ");
        char token = input.next().charAt(0);
        this.tokens = new StringTokenizer( this.string, Character.toString(token) );
    }

    public void showTokens(){
        while( this.tokens.hasMoreTokens() ){
            String token = this.tokens.nextToken();
            this.showTokens( );
            System.out.print( token + " " );
        }
    }

}

class Program5{

    public static void main( String args[] ){

        tokenString ts = new tokenString();

        ts.setString();
        ts.cutWithTokens();
        ts.showTokens();
        System.out.println("\n\n");
      
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Line : Hello-World-Bro


Enter a Token : -
Bro World Hello 


--------------------------------------------

*/