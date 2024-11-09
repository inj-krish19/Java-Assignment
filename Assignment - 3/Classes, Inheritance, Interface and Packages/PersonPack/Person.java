package PersonPack;

import FlatPack.Flat;

public class Person{

    private int PIDNumber;
    private String name;
    private Flat flat;

    public Person( int pid, String n, Flat fid ){
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