/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 5 : Palindrome Checker

Develop a program that checks whether a given string is a palindrome. 
The program should have the following features:

 Prompt the user to enter a string.
 
 Implement a method to determine if the string is a palindrome 
 (a word, phrase, number, or other sequence of characters 
 that reads the same backward as forward).
 
 Display the result (whether the input is a palindrome or not) to the user.


------------------------------------------------------------------

*/

import java.util.Scanner;

class  PalindromeChecker{
  
    String line;

    PalindromeChecker(){}

    PalindromeChecker( String l){
        line = l;
    }

    boolean checkPalindrome(){

        int start = 0;
        int end = line.length() - 1;

        for ( start = 0; start < line.length( ) / 2 ; start ++ ) {
            
            if( line.charAt( start ) != line.charAt( end )){
                System.out.println("\n\nThe Line Is Not Palindrome\n\n");
                return false;
            }
            end --;

        }

        System.out.println("\n\nThe Line Is Palindrome\n\n");

        return true;

    }

}


class Program5{

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        System.out.print("\n\nEnter a Line : ");

        String line = input.nextLine();

        PalindromeChecker p = new PalindromeChecker(line);

        p.checkPalindrome();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------



Enter a Line : HiiH


The Line Is Palindrome


********************************


Enter a Line : KRISH HSIRK


The Line Is Palindrome

********************************

Enter a Line : Not Palindrome


The Line Is Not Palindrome

--------------------------------------------

*/