/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 3 : Add the necessary methods in the class PointCreate3 
(Eg, we have done in class is Demo_38) to calculate the area and
perimeter of a rectangle given the two corner coordinates.

------------------------------------------------------------------

*/

class PointCreate3{

    private double x;
    private double y;

    PointCreate3(){ x = y = 0;  }
    PointCreate3(double a, double b){
        x = a;
        y = b;
    }

    public double getX(){  return x;   }
    public double getY(){  return y;   }

    public void setX( int a ){   x = a;  }
    public void setY( int b ){   y = b;  }

    public static void area( PointCreate3 a, PointCreate3 b){
        double length = Math.abs(b.getX() - a.getX());
        double width = Math.abs(b.getY() - a.getY());
        System.out.println("\nArea Of Rectangle Using Two Coordinate Is " + (length*width) + "\n" );
    }

    public static void perimeter( PointCreate3 a, PointCreate3 b){
        double length = Math.abs(b.getX() - a.getX());
        double width = Math.abs(b.getY() - a.getY());
        System.out.println("\nPerimeter Of Rectangle Using Two Coordinate Is " + 2 * (length+width) + "\n" );
    }    

}

class Program3{

    public static void main( String[] args ){
    
        PointCreate3 a = new PointCreate3(1,2);
        PointCreate3 b = new PointCreate3(3,4);

        System.out.println("\nX of A Is " + a.getX() );
        System.out.println("Y of A Is " + a.getY() );

        System.out.println("\nX of B Is " + b.getX() );
        System.out.println("Y of B Is " + b.getY() );

        PointCreate3.area( a,b );
        PointCreate3.perimeter( a,b );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

X of A Is 1.0
Y of A Is 2.0

X of B Is 3.0
Y of B Is 4.0

Area Of Rectangle Using Two Coordinate Is 4.0


Perimeter Of Rectangle Using Two Coordinate Is 8.0

--------------------------------------------

*/