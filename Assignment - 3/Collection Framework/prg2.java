/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 : Create a HashSet of 5 names. Write a menu driven 
program to do the following: 

a. Add a new name 

b. Remove a name 

c. Search a name 

d. Display all the names 
(display in reverser order also – use ListIterator ) 

e. Display number of elements in hashset 


------------------------------------------------------------------

*/

import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

class Program2{

    public static void main( String[] args ){
    
        HashSet<String> names = new HashSet<>( Arrays.asList( "Krish", "Vishal", "Mohit", "Dev", "Dhruv" ) );
        System.out.println( "HashSet With Five Names : " + names + "\n" );

        names.add("Rahil");
        System.out.println( "After Adding Rahil In Names : " + names + "\n" );

        names.remove( "Dev" );
        System.out.println( "After Removing Dev From Names : " + names + "\n" );

        System.out.println( "Result Of Searching Rahil : " + ( ( names.contains( "Rahil" ) ) ? "Rahil Present In Names" : "Rahil Not Found" ) + "\n" ) ;

        ArrayList<String> nameList = new ArrayList<>(names);
        ListIterator<String> itr = nameList.listIterator( nameList.size() );
        
        System.out.print( "Iterating Names Using Iterator : [");
        while( itr.hasPrevious() ){
            System.out.print( itr.previous());
            if( itr.hasPrevious() ){    System.out.print(", "); }
        }
        System.out.println( "]\n");

        System.out.println( "HashSet Has " + names.size() + " Elements. \n" ) ;
    
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

HashSet With Five Names : [Mohit, Dhruv, Krish, Dev, Vishal]

After Adding Rahil In Names : [Mohit, Dhruv, Krish, Dev, Vishal, Rahil]

After Removing Dev From Names : [Mohit, Dhruv, Krish, Vishal, Rahil]

Result Of Searching Rahil : Rahil Present In Names

Iterating Names Using Iterator : [Rahil, Vishal, Krish, Dhruv, Mohit]

HashSet Has 5 Elements.

--------------------------------------------

*/