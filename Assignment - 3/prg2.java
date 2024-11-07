/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Develop the following application in given steps. 

a. Step-1 : 
    
    i. Define a class called Cartesian Point, which has two instance 
    variables, x and y.  Provide the following methods  
        1. get X() and get Y() to return the values of 
        the x and y values respectively.  

        2. move() which would take two integers as parameters 
        and change the values of x and y respectively,  

        3. a method called display() which would display the 
        current values of x and y.  

    ii. Now overload the method move() to work with single parameter, 
    which would  set both x and y to the same values, . 

    iii. Provide constructors with two parameters and 
    overload to work with one parameter as well.  
    
    iv. Now define a class called Test Cartesian Point, with the main method to test the  various methods in the Cartesian Point class. 

b. Step-2 : 

    i. Define a class called Triangle, which has constructor with 
    three parameters,  which are of type Cartesian Point.  

    ii. Provide methods  

        1. to find the area and the perimeter of the Triangle,  

        2. a method display() to display the three 
        Cartesian Points separated by ':' character,  

        3. a method move() to move the first Cartesian Point 
        to the specified x, y  location, the move should 
        take care of relatively moving the other points as well, 

        4. a method called rotate, which takes two arguments, 
        one is the Cartesian Point and other is the 
        angle in clockwise direction.  

        5. Overload the move method to work with 
        Cartesian Point as a parameter.  

    iii. Now define a class called Test Triangle to test the 
    various methods defined in  the Triangle class.  

c. Step-3 : 

    i. Similarly also define a class called 
    Rectangle which has four Cartesian Point.



------------------------------------------------------------------

*/

import java.util.Scanner;

class Triangle{

    private int x;
    private int y;
    private int z;
    private char point;
    private double angle;

    Triangle( int a,int b, int c ){
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void display(){
        System.out.println( "Triangle Is " + this.x + " : " + this.y + " : " + this.z );
    }

    public int perimeter(){
        return this.x + this.y + this.z;
    }

    public double area(){
        double s = ( this.x + this.y + this.z ) / 2;
        return Math.sqrt( s * ( s - this.x ) * ( s - this.y ) * ( s - this.z ) ); 
    }

    public void move( boolean status ){
        int temp;
        if( status ){
            temp = x;
            x = z;
        }else{
            temp = y;
            y = z;
        }
        z = temp;
    }

    public void move( char a,char b ){
        int temp1;
        int temp2;
        if( a == 'x' ){ temp1 = x;  }
        if( a == 'y' ){ temp1 = y;  }
        if( a == 'z' ){ temp1 = z;  }
        if( b == 'x' ){ temp2 = x;  }
        if( b == 'y' ){ temp2 = y;  }
        if( b == 'z' ){ temp2 = z;  }
        
    }

    public void rotate( char point, double degree ){
        this.point = point;
        this.angle = degree;
        System.out.println( "Triangle Is rotated at point " + this.point + " on degree " + this.angle );
    }

}

class Rectangle{

}

class Test{

    public static void main( String args[] ){

        Triangle triangle = new Triangle( 3,3,3 );
        Scanner input = new Scanner( System.in );

        System.out.println("\n\n");

        System.out.println( "Perimeter Of Triangle Is " + triangle.perimeter() );
        System.out.println( "Area Of Triangle Is " + triangle.area() );
        triangle.display();
        
        System.out.print("Enter true For Shifting to X Else For Y : ");
        String choice = input.next();

        if( choice == "true" || choice == "TRUE" ){
            triangle.move( true );
        }else{
            triangle.move( false );
        }

        System.out.print("Enter Cartesian Point at Where Angle is : ");
        choice = input.next();

        System.out.print("\n\nEnter Angle where Point is lying : ");
        double angle = input.nextDouble();

        triangle.rotate( choice.toLowerCase().charAt(0), angle );
        
        
        System.out.print("Enter Two Catrtesian Points with a space : ");
        choice = input.next();
        triangle.move( choice.toLowerCase().charAt(0), choice.toLowerCase().charAt(2) );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------



--------------------------------------------

*/