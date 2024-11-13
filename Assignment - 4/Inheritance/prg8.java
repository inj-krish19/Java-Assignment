/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 8 : Write a program to store a lists of name in a List. 
Reverse the order of the names in the list using Stack. 
You should use classArrayList to store the names (String) 
and class Stack for reversing..

------------------------------------------------------------------

*/

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Program8{

    public static void main( String[] args ){
    
        List<String> names = new ArrayList<>();
        Stack<String> backup = new Stack<>();

        names.add("Krish");
        names.add("Vishal");
        names.add("Dhruv");
        names.add("Rahil");
        names.add("Mohit");

        System.out.println("\nNames Are " + names );

        for( String name: names ){  backup.add(name);   }
        names.clear();

        while( !backup.isEmpty() ){
            names.add( backup.pop() );
        }

        System.out.println("\nAfter Reversing Names Are " + names + "\n");

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Names Are [Krish, Vishal, Dhruv, Rahil, Mohit]

After Reversing Names Are [Mohit, Rahil, Dhruv, Vishal, Krish]

--------------------------------------------

*/