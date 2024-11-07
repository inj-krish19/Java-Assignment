/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 4:  Write and run a JAVA program that reads a string 
from the user and perform the following.
 counts number of occurance of a given character
 (for example, " a") in a string.
 
 searches the last occurance of a character in a string.
 
 removes the unneccessary spaces from a string : 
 leading and trailing spaces. 
 
 displays the substring formed by the last ten characters of a string

------------------------------------------------------------------

*/

import java.util.Scanner;

class utilString{

    private Scanner input = new Scanner( System.in );
    private String string;
    private char character;

    utilString(){
        string = "";
    }

    public void setString(){

        System.out.print("\nEnter a String : ");
        this.string = input.nextLine();

        System.out.println("String : " + string );

    }

    public void findOcccurance(){

        System.out.print("\n\nEnter a Character : ");
        this.character  = this.input.next().charAt(0);
        int count = 0;

        for( char chara : this.string.toCharArray() ){
            if(  chara == this.character ){
                count ++;
            }
        }
        
        System.out.println("\n" + this.character + " found in String " + count + " times. \n");

    }

    public void removeWhiteSpace(){

        StringBuilder built = new StringBuilder();

        for( int i=0;i<this.string.length(); i++ ){
            if( ! ( this.string.charAt(i) == ' ' && this.string.charAt(i+1) == ' ' ) ){
                built.append( this.string.charAt(i) );
            }
        }

        this.string = new String(built);
        
        System.out.println("\nAfter Removing All The Whitespaces String Is " +  this.string + "\n");

    }

    public void last10Chars(){
        if( this.string.length() < 10 ){
            System.out.println("\nString Formed With Last 10 Characters Is " +  this.string + "\n");
        }else{
            System.out.println("\nString Formed With Last 10 Characters Is " +  this.string.substring( this.string.length() - 10 , this.string.length() ) + "\n");
        }
    }


}

class Program4{

    public static void main( String args[] ){

        Scanner input = new Scanner( System.in );

        utilString us = new utilString();

        us.setString();
        us.findOcccurance();
        us.removeWhiteSpace();
        us.last10Chars();
      
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter a String : Hello World                  Vishal
String : Hello World                  Vishal


Enter a Character : H

H found in String 1 times.


After Removing All The Whitespaces String Is Hello World Vishal


String Formed With Last 10 Characters Is rld Vishal



--------------------------------------------

*/