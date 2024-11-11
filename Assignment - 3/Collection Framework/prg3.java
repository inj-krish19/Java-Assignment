/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 3 : Create a HashTable/ HashMap of students object and find the following: 

a. Check if a particular key exist in the hashtable or not. If exist then display the value 

b. Remove an entry from hashtable (key is entered by user to remove) 

c. Add a new entry 

d. Display all the entries  

e. Check if a particular value exist in the hashtable or not. If exist then display the value 

------------------------------------------------------------------

*/

import java.util.Scanner;
import java.util.HashMap;

class Program3{

    public static void main( String[] args ){
    
        Scanner input = new Scanner( System.in );
        HashMap<Integer,String> map = new HashMap<>();
    
        map.put( 1, "VISHAL" );
        map.put( 5, "MOHIT" );
        map.put( 12, "MOHIT" );
        map.put( 25, "DEV" );
        map.put( 47, "KRISH" );

        System.out.println( "Hash Table Is : " + map + "\n");

        System.out.print( "Enter Key To Check Wheather It Exists or Not : ");
        int key = input.nextInt();

        if( map.containsKey( key ) ) {
            System.out.println( "\n" + key + " exist in this map. Its value " + map.get(key) + "\n");
        }else{
            System.out.println( "\n" + key + " not exist in this map\n");
        }
        System.out.println( "Hash Table Is : " + map + "\n");

        System.out.print( "Enter Key To Remove : ");
        key = input.nextInt();

        if( map.containsKey( key ) ) {
            map.remove( key );
            System.out.println( "\n" + key + " removed from map\n");
        }else{
            System.out.println( "\n" + key + " not exist in this map\n");
        }
        System.out.println( "Hash Table Is : " + map + "\n");

        System.out.print( "Enter Key To Add In Map : ");
        key = input.nextInt();

        while( map.containsKey(key) ){
            System.out.print( "\nCannot choose existing key.\n\nEnter Key To Add In Map : ");
            key = input.nextInt();
        }
        
        System.out.print( "\nEnter "+ key +" 's value To Add In Map : ");
        String value = input.next();
        
        map.put( key, value );
        System.out.println( "Hash Table Is : " + map + "\n");


        System.out.print( "Enter Key To Search In Map For Exist Or Not : ");
        key = input.nextInt();
        if( map.containsKey( key ) ) {
            System.out.println( "\n" + key + " exist in this map. Its value " + map.get(key) + "\n");
        }else{
            System.out.println( "\n" + key + " not exist in this map\n");
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Hash Table Is : {1=VISHAL, 5=MOHIT, 25=DEV, 12=MOHIT, 47=KRISH}

Enter Key To Check Wheather It Exists or Not : 47

47 exist in this map. Its value KRISH

Hash Table Is : {1=VISHAL, 5=MOHIT, 25=DEV, 12=MOHIT, 47=KRISH}

Enter Key To Remove : 25

25 removed from map

Hash Table Is : {1=VISHAL, 5=MOHIT, 12=MOHIT, 47=KRISH}

Enter Key To Add In Map : 25

Enter 25 's value To Add In Map : DEV        
Hash Table Is : {1=VISHAL, 5=MOHIT, 25=DEV, 12=MOHIT, 47=KRISH}

Enter Key To Search In Map For Exist Or Not : 47

47 exist in this map. Its value KRISH

--------------------------------------------

*/