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

class Flat{

    private String apartmentName;
    private int flatNo;
    private int noOfBedrooms;

    Flat(){}

    Flat( int flat, String apartment, int bedrooms ){
        apartmentName = apartment;
        flatNo = flat;
        noOfBedrooms = bedrooms;
    }

    public void displayFlatlnfo( ){
        System.out.println("\nFlat Information : \n");
        System.out.println("Flat Number Is " + flatNo);
        System.out.println("Apartment Name Is " + apartmentName);
        System.out.println("Flat Has " + noOfBedrooms + " Bedrooms");
        System.out.println("");
    }

}

class Person{

    private int PIDNumber;
    private String name;
    private Flat flat;

    Person( int pid, String n, Flat fid ){
        PIDNumber = pid;
        name = n;
        flat = fid;
    }

    public void displayOwnershiplnfo( int pid){
        System.out.println("\nOwner Information :\n");
        System.out.println("Person ID Number Is " + PIDNumber);
        System.out.println("Person Name Is " + name);
        System.out.println("Person 's Flat Information : ");
        flat.displayFlatlnfo();
    }

}

class Program5{

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


--------------------------------------------

*/