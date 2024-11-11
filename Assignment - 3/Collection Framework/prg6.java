/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 6 : Create two hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} 
and {"George", "Katie",  "Kevin", "Michelle", "Ryan"}, and find their union, difference, and intersection.  

------------------------------------------------------------------

*/

import java.util.Set;
import java.util.HashSet;

class Program6{

    public static void main( String[] args ){
    
        HashSet<String> names = new HashSet<>( Set.of("George", "Jim", "John", "Blake", "Kevin", "Michael") );
        HashSet<String> other = new HashSet<>( Set.of("George", "Katie",  "Kevin", "Michelle", "Ryan") );

        HashSet<String> result = new HashSet<>(names);
        result.addAll(other);
        System.out.println("\nUnion Of Both HashSet Is " + result + "\n" ) ;
        
        result = new HashSet<>(names);
        result.retainAll(other);
        System.out.println("Intersection Of Both HashSet Is " + result + "\n" ) ;
        
        result = new HashSet<>(names);
        result.removeAll(other);
        System.out.println("Difference Of Both HashSet Is " + result + "\n" ) ;

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Union Of Both HashSet Is [Michelle, Kevin, Ryan, George, Katie, Blake, Michael, John, Jim]

Intersection Of Both HashSet Is [Kevin, George]

Difference Of Both HashSet Is [Blake, Michael, John, Jim]


--------------------------------------------

*/