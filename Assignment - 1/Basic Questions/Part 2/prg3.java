/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 2: Classes and Methods

Program - 3 Create a Circle class with the 
following properties: radius. Implement methods 
to calculate the area and circumference of the circle

------------------------------------------------------------------

*/

class Circle{
    
    private double radius;

    Circle(){   radius = 0;    }

    Circle( double rad ){
        radius = rad;
        System.out.println( "Radius Of Circle Is " + radius + "\n\n" );
    }

    double area(){
        return 3.14 * radius * radius;
    }

    double circumference(){
        return 3.14 * 2 * radius;
    }


}

class Program3{
    
    public static void main( String[] args ){
        
        System.out.println("\nDetails \n");

        Circle circle = new Circle( 19 );

        System.out.println( "Area Of Circle Is " + circle.area() + "\n" ) ;
        System.out.println( "Circumference Of Circle Is " + circle.circumference() + "\n");

        System.out.println("\n\n");


    }


}

/*

-----------------------------------------

Output :

-----------------------------------------


Details

Radius Of Circle Is 10.0


Area Of Circle Is 314.0

Circumference Of Circle Is 62.800000000000004



************************************


Details

Radius Of Circle Is 19.0


Area Of Circle Is 1133.54

Circumference Of Circle Is 119.32000000000001



--------------------------------------------

*/