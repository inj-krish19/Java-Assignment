/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 : Develop the following application in given steps. 

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

class CartesianPoint{

    private int x;
    private int y;

    CartesianPoint( int value ){
        move(value);
    }

    CartesianPoint( int a, int b ){
        move( a, b);
    }

    public int getX(){    return x;   }
    public int getY(){    return y;   }

    public void move( int same ){
        x = y = same;
    }

    public void move( int a, int b ){
        x = a;
        y = b;
    }

    public void display(){
        System.out.println("\n\n");
        System.out.println("X is " + getX() );
        System.out.println("Y is " + getY() );
    }

}

class Triangle{

    private CartesianPoint x;
    private CartesianPoint y;
    private CartesianPoint z;
    private double angle;
    
    Triangle( CartesianPoint a, CartesianPoint b, CartesianPoint c ){
        x = a;
        y = b;
        z = c;
    }

    public double area() {
        return Math.abs(( x.getX() * (y.getY() - z.getY()) + y.getX() * (z.getY() - x.getY()) + z.getX() * (x.getY() - y.getY()) ) / 2 );
    }

    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(y.getX() - x.getX(), 2) + Math.pow(y.getY() - x.getY(), 2));
        double side2 = Math.sqrt(Math.pow(z.getX() - y.getX(), 2) + Math.pow(z.getY() - y.getY(), 2));
        double side3 = Math.sqrt(Math.pow(x.getX() - z.getX(), 2) + Math.pow(x.getY() - z.getY(), 2));
        return side1 + side2 + side3;
    }

    public void display(){
        System.out.print("\n\nPoint : ");
        System.out.print("(" + x.getX() + "," + x.getY() + "):");
        System.out.print("(" + y.getX() + "," + y.getY() + "):");
        System.out.print("(" + z.getX() + "," + z.getY() + ")\n\n");
    }

    public void move( boolean point ) {
        CartesianPoint old = x;
        if( point ){
            x = y;
            y = old;
        }else{
            x = z;
            z = old;
        }
    }

    public void move(int a, int b) {
        int tempX = a - x.getX();
        int tempY = b - x.getY();
        x.move(a, b);
        y.move(y.getX() + tempX, y.getY() + tempY);
        z.move(z.getX() + tempX, z.getY() + tempY);
    }

    public void rotate(CartesianPoint point, double degree) {
        this.angle = degree;
        System.out.println("Triangle is rotated at point (" + point.getX() + "," + point.getY() + ") by " + angle + " degrees.");
    }
    
}

class Rectangle {
    
    private CartesianPoint a;
    private CartesianPoint b;
    private CartesianPoint c;
    private CartesianPoint d;
    
    Rectangle(CartesianPoint m, CartesianPoint n, CartesianPoint o, CartesianPoint p) {
        a = m;
        b = n;
        c = o;
        d = p;
    }

    public double area() {
        double side1 = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double side2 = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));
        return side1 * side2;
    }

    public double perimeter() {
        double side1 = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        double side2 = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));
        return 2 * (side1 + side2);
    }

    public void display() {
        System.out.print("\nRectangle :");
        System.out.print("(" + a.getX() + "," + a.getY() + ") : ");
        System.out.print("(" + b.getX() + "," + b.getY() + ") : ");
        System.out.print("(" + c.getX() + "," + c.getY() + ") : ");
        System.out.print("(" + d.getX() + "," + d.getY() + ")\n");
    }

    public void move(boolean swap) {
        CartesianPoint temp = a;
        if (swap) {
            a = b;
            b = temp;
        } else {
            a = c;
            c = temp;
        }
    }

    public void move(int tempX, int tempY) {
        a.move(a.getX() + tempX, a.getY() + tempY);
        b.move(b.getX() + tempX, b.getY() + tempY);
        c.move(c.getX() + tempX, c.getY() + tempY);
        d.move(d.getX() + tempX, d.getY() + tempY);
    }

    public void rotate(CartesianPoint point, double degree) {
        System.out.println("Rotating rectangle around point (" + point.getX() + ", " + point.getY() + ") by " + degree + " degrees.");
    }
}


class TestCartesianPoint{

    public static void main( ){

        CartesianPoint point = new CartesianPoint(3,2);
        point.display();
        point = new CartesianPoint(4);
        point.display();

        point.move(2,5);
        point.display();
        point.move(1);
        point.display();

    }

}

class TestTriangle{
     
    public static void main(  ){

        Triangle triangle = new Triangle( new CartesianPoint(1,1), new CartesianPoint(1,4), new CartesianPoint(4,1) );
        triangle.display();

        System.out.println("\nPerimeter Of Triangle Is " + triangle.perimeter() );
        System.out.println("\nArea Of Triangle Is " + triangle.area() );
        triangle.display();
        
        triangle.move( true );
        triangle.move( false );
        triangle.display();

        triangle.rotate( new CartesianPoint(0,0), 75 );
        triangle.move( 5, 5 );
        triangle.display();

    }

}

class TestRectangle {
    
    public static void main() {

        Rectangle rectangle = new Rectangle( new CartesianPoint(1, 1), new CartesianPoint(5, 1), new CartesianPoint(5,3), new CartesianPoint(1, 3) );
        
        rectangle.display();
        
        System.out.println("\nRectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        
        rectangle.move(true);
        System.out.println("\nRectangle Points after swapping p1 and p2:");
        rectangle.display();
        
        rectangle.move(3, 3);
        System.out.println("\nRectangle Points after moving by (3,3):");
        rectangle.display();
        
        CartesianPoint rotationPoint = new CartesianPoint(0, 0);
        System.out.println();
        rectangle.rotate(rotationPoint, 45);
    }
}

class Program2{

    public static void main( String[] args ){
        TestCartesianPoint.main();
        TestTriangle.main();
        TestRectangle.main();
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


X is 3
Y is 2



X is 4
Y is 4



X is 2
Y is 5



X is 1
Y is 1


Point : (1,1):(1,4):(4,1)


Perimeter Of Triangle Is 10.242640687119284

Area Of Triangle Is 4.0


Point : (1,1):(1,4):(4,1)



Point : (4,1):(1,1):(1,4)

Triangle is rotated at point (0,0) by 75.0 degrees.


Point : (5,5):(2,5):(2,8)


Rectangle :(1,1) : (5,1) : (5,3) : (1,3)

Rectangle Area: 8.0
Rectangle Perimeter: 12.0

Rectangle Points after swapping p1 and p2:

Rectangle :(5,1) : (1,1) : (5,3) : (1,3)

Rectangle Points after moving by (3,3):

Rectangle :(8,4) : (4,4) : (8,6) : (4,6)

Rotating rectangle around point (0, 0) by 45.0 degrees.

--------------------------------------------

*/