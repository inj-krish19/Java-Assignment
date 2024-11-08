package FlatPack;

public class Flat{

    private String apartmentName;
    private int flatNo;
    private int noOfBedrooms;

    Flat(){}

    public Flat( int flat, String apartment, int bedrooms ){
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