/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 6:  Create a StringBuffer and illustrate how to 
append character. Display capacity, length of the StringBuffer.

------------------------------------------------------------------

*/

import java.util.Scanner;

class buildString{

    private Scanner input = new Scanner( System.in );
    private StringBuilder string;

    public void setString(){
        System.out.print("\n\nEnter a Line : ");
        this.string = new StringBuilder( input.nextLine() );
    }

    public void appendCharacter(){
        System.out.print("\n\nEnter a Character to Append : ");
        this.string.append( input.next().charAt(0) );
    }

    public void displaySize(){
        System.out.println("\nSize Of " + this.string + " Is " + this.string.length() );
    }

    public void displayCapacity(){
        System.out.println("\nCapacity Of String Is " + this.string.capacity() );
    }


}

class Program6{

    public static void main( String args[] ){

        buildString bs = new buildString();

        bs.setString();
        bs.appendCharacter();
        bs.displaySize();
        bs.displayCapacity();
        System.out.println("\n\n");
      
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter a Line : Hell


Enter a Character to Append : o

Size Of Hello Is 5

Capacity Of String Is 20


--------------------------------------------

*/