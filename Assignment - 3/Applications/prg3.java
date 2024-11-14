/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 3 : 

I) Write a program for Inventory. Create a class Item having attributes 
itemId, description, price.  Define the necessary constructors and display methods.  
Create a sub class Bill_Item having attributes quantity and amount (amount = quantity* price) ,  
Define the necessary constructors and display and other required methods. 
Create a Main class which create atleast 5 items . 
Display Details of all the items along with total  bill. 

II) Create a java program to read the address from command line arguments, separate
the  address by ‘,’ and store the values in variables. (using String tokenizer)

------------------------------------------------------------------

*/

import java.util.Scanner;
import java.util.StringTokenizer;

abstract class Item{

    private int itemId;
    private String description;
    private double price;

    Item( int id, String title, double cost ){
        itemId = id;
        description = title;
        price = cost;
    }

    protected double getPrice(){    return price;   }

    public void display(){
        System.out.println("\nItem Id Is " + itemId );
        System.out.println("Item Description Is " + description );
        System.out.println("Item Price Is " + price );
    }
    
    public abstract double getAmount();

}

class Bill_Item extends Item{

    private int quantity;
    private double amount;

    Bill_Item( int id, String title, double cost, int q ){
        super( id, title, cost );
        quantity = q;
        amount = getAmount();
    }
    
    public double getAmount(){
        return getPrice() * quantity;
    }
     
    public void display(){
        super.display();
        System.out.println("Item Quantity Is " + quantity );
        System.out.println("Item Amount Is " + amount + "\n" );
    }



    public static void bill( Item[] items ){

        double total_bill = 0;
        for( Item item : items ){
            total_bill += item.getAmount();
        }

        System.out.println("\nTotal Billl Of All Items Is " + total_bill + "\n");

    }

}

class Program3{

    public static void main( String[] args ){
    
        Item items[] = new Item[5];

        items[0] = new Bill_Item( 1001, "Laptop", 75000.00, 1 );
        items[1] = new Bill_Item( 1002, "Headphone", 2000.00, 1 );
        items[2] = new Bill_Item( 1003, "Sunglass", 250.00, 1 );
        items[3] = new Bill_Item( 1004, "Cup", 350.00, 2 );
        items[4] = new Bill_Item( 1005, "Pen", 10, 5 );

        for( Item item : items ){
            item.display();
        }

        Bill_Item.bill( items );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Item Id Is 1001
Item Description Is Laptop
Item Price Is 75000.0
Item Quantity Is 1
Item Amount Is 75000.0


Item Id Is 1002
Item Description Is Headphone
Item Price Is 2000.0
Item Quantity Is 1
Item Amount Is 2000.0


Item Id Is 1003
Item Description Is Sunglass
Item Price Is 250.0
Item Quantity Is 1
Item Amount Is 250.0


Item Id Is 1004
Item Description Is Cup
Item Price Is 350.0
Item Quantity Is 2
Item Amount Is 700.0


Item Id Is 1005
Item Description Is Pen
Item Price Is 10.0
Item Quantity Is 5
Item Amount Is 50.0


Total Billl Of All Items Is 78000.0

--------------------------------------------

*/