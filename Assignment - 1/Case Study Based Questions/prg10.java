/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 10 : Grocery List Manager

Develop a program that helps users manage their grocery list. 
The program should have the following features:

 Allow the user to add items to the grocery list.

 Provide the ability to mark items as purchased or remove them from the list.

 Display the current grocery list, including the purchased and remaining items.

 Implement a search functionality to find specific items on the list.
 
 Optionally, allow the user to save and load the grocery list to/from a file.


------------------------------------------------------------------

*/

import java.util.Scanner;

class GroceryListManager{
    
    int current;
    String item[];
    String status[];

    GroceryListManager(){   current = 0;    item = new String[100];   status = new String[100];  }

    void addItem( String i,String s ){
        if( current + 1 < 100 ){
            item[current] = i;
            status[current] = s;
            current ++;
        }
    }   

    void displayItem(){

        boolean notFound = true;
        int x = 1;

        System.out.println("\nPurchased : \n");
        for (int i = 0; i < current ; i++) {
            if( status[i].toLowerCase().equals("purchase") ){
                System.out.println("Item " + x + ": " + item[i] );
                x++;
                notFound = false;
            }
        }

        if( notFound == true ){
            System.out.println("\nAny Item Is Not Exist In Purchased\n");
        }

        notFound = true;x = 1;

        System.out.println("\n\nRemoved : \n");
        for (int i = 0; i < current ; i++) {
            if( status[i].toLowerCase().equals("remove") ){
                System.out.println("Item " + x + ": " + item[i] );
                x++;
                notFound = false;
            }
        }

        if( notFound == true ){
            System.out.println("\nAny Item Is Not Exist In Removed\n");
        }

        notFound = true;x = 1;

        System.out.println("\n\nRemaining : \n");
        for (int i = 0; i < current ; i++) {
            if( (!status[i].toLowerCase().equals("purchase")) && (!status[i].toLowerCase().equals("remove")) ){
                System.out.println("Item " + x + ": " + item[i] );
                x++;
                notFound = false;
            }
        }

        if( notFound == true ){
            System.out.println("\nAny Item Is Not Exist In Remainings\n");
        }

    }

    void findItem( String target ){

        int x = -1;

        for (int i = 0; i < current; i++) {
            if( target.toLowerCase().equals(item[i].toLowerCase()) ){
                if( x == -1 ){  x = 1;  }
                System.out.println("Item " + x + ": " + item[i] );
                x++;
            }
            
        }

        if( x == -1 ){
            System.out.println("Item Not Found" );
        }

    }

    void markItems( String target,String targetStatus ){

        int x = -1;
        for (int i = 0; i < current; i++) {
            if( target.toLowerCase().equals(item[i].toLowerCase()) ){
                x = i;
                System.out.println("Item : " + item[i] );
                break;
            }
        }

        if( x == -1 ){
            System.out.println("\nItem Does Not Exist\n");
        }else{
            status[x] = targetStatus;
        }

    }

}


class Program10{

    public static void main( String[] args){
        
        char choice;

        String name,status;
        
        Scanner input = new Scanner( System.in );

        GroceryListManager g = new GroceryListManager();

        do{

            System.out.println("\n\n");

            System.out.println("\n****** MAXIMUM : 100 ITEMS ****** \n");

            System.out.print("A For Adding Item\nD For Displaying Items\nF For Searching an Item\nM for Marking Items in Purchased or Remove\nEnter Choice : ");
            
            choice = input.next().charAt(0);

            System.out.println();

            switch( choice ){

                case 'a':
                case 'A':
                
                    System.out.println();
                    System.out.print("Enter Item Name : ");
                    name = input.next();
                    System.out.print("\nEnter Status (Purchase/Removed/Remaining) : ");
                    status = input.next();

                    if( (!status.toLowerCase().equals("purchase")) && (!status.toLowerCase().equals("remove")) ){
                        status = "remaining";
                    }

                    g.addItem( name,status );
                    break;

                case 'd':
                case 'D':
                
                    System.out.println();
                    g.displayItem();
                    break;

                case 'f':
                case 'F':

                    System.out.println();
                    System.out.print("Enter Item Name for Finding : ");
                    name = input.next();
                    g.findItem( name );
                    break;

                case 'm':
                case 'M':

                    System.out.println();
                    System.out.print("Enter Item Name For Marking: ");
                    name = input.next();
                    System.out.print("\nEnter Status (Purchase/Removed/Remaining) : ");
                    status = input.next();

                    if( (!status.toLowerCase().equals("purchase")) && (!status.toLowerCase().equals("remove")) ){
                        status = "remaining";
                    }
                    g.markItems( name,status );
                    break;

                case 'e':
                case 'E':
                    System.out.println("\nExiting ...");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

            System.out.println("\n");


        }while( choice != 'E' && choice != 'e' );
    
    }

}


/*

-----------------------------------------

Output :

-----------------------------------------





****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : a


Enter Item Name : Chair

Enter Status (Purchase/Removed/Remaining) : purchase






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : d



Purchased :

Item 1: Chair


Removed :


Any Item Is Not Exist In Removed



Remaining :


Any Item Is Not Exist In Remainings







****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : f


Enter Item Name for Finding : Chair
Item 1: Chair






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : e


Exiting ...





********************************





****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : f


Enter Item Name for Finding : Chair
Item 1: Chair






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : e


Exiting ...
Invalid Choice


PS C:\Users\KRISH\KRISH\SEM - V\Java\Assignment - 1\Case Study Based Questions> java Program10




****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : a


Enter Item Name : Chair

Enter Status (Purchase/Removed/Remaining) : purchase






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : a


Enter Item Name : Table

Enter Status (Purchase/Removed/Remaining) : remove






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : a


Enter Item Name : Sofa

Enter Status (Purchase/Removed/Remaining) : remaining






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : d



Purchased :

Item 1: Chair


Removed :

Item 1: Table


Remaining :

Item 1: Sofa






****** MAXIMUM : 100 ITEMS ******

A For Adding Item
D For Displaying Items
F For Searching an Item
M for Marking Items in Purchased or Remove
Enter Choice : e


Exiting ...



--------------------------------------------

*/