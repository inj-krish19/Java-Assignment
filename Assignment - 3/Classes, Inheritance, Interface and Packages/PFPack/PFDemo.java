/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 5 : Create three packages—PersonPack, FlatPack and PFPack.  

    a. Package PersonPack must contain a class called 
    Person with the following attributes: PIDNumber, name, etc.  
    
        i. It must have a reference variable of the type Flat. 
    
        ii. It should have a static method displayOwnershiplnfo() that 
        takes as an input  parameter a variable of PIDNumber and returns void. 
        This method must display  the information about the classes Person and Flat.  
    
    b. Package FlatPack must contain the class Flat with following 
    attributes: apartmentName,  flatNo and noOfBedrooms  
        
        i. It should have method displayFlatlnfo() that displays 
        information of the attributes  of the class Flat.  
        
    c. Package PFPack must contain a class called PFDemo that has a main method . 
        
        i. create objects of the classes Person and Flat and  
        
        ii. invoke the displayOwnershiplnfo() method

------------------------------------------------------------------

*/

package PFPack;

import FlatPack.Flat;
import PersonPack.Person;

public class PFDemo{

    public static void main( String[] args){

        Flat flat = new Flat(1,"Shukun Gold",3);
        Person person = new Person(1,"Krish Shah",flat);
        person.displayOwnershiplnfo(1);
        
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Owner Information :

Person ID Number Is 1
Person Name Is Krish Shah
Person 's Flat Information :

Flat Information :

Flat Number Is 1
Apartment Name Is Shukun Gold
Flat Has 3 Bedrooms

--------------------------------------------

*/

