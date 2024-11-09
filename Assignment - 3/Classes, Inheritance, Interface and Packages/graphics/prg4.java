/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 4 : Develop a basic graphics package.  

    a. Within the package create a abstract 
    class Shape having function print().  

    b. Create two subclasses Two Dimensional 
    and three Dimensional from Shape class .  

    c. These two subclasses also should be abstract.  

    d. Implement the print method in the subclasses 
    Square, Circle, Cylinder, Cube, to output  the type and 
    dimension of the shape Also include area and volume methods 
    to calculate  the area and volume of the concrete shapes  
   
    e. Write a driver program that creates various shapes and 
    put them in an array of Shape  Use polymorphism to print 
    and calculate the area and volume of objects stored in array. 


------------------------------------------------------------------

*/

package graphics;

abstract class Shape{
    public abstract void print();
    public abstract void area();
    public abstract void volume();
}

abstract class TwoDShape extends Shape{}

abstract class ThreeDShape extends Shape{}


class Square extends TwoDShape{

    private double side;

    Square( double s){
        side = s;
        print();
        area();
    }

    public void print(){
        System.out.println("\nShape : Square ( 2D )\n");
    }

    public void area(){
        System.out.println("Area Of Square Is " + 4 * side );
    }
  
    public void volume(){}

}

class Circle extends TwoDShape{

    private double radius;

    Circle( double r){
        radius = r;
        print();
        area();
    }

    public void print(){
        System.out.println("\nShape : Circle ( 2D ) \n");
    }

    public void area(){
        System.out.println("Area Of Circle Is " + 3.14 * radius * radius );
    }

    public void volume(){}

}

class Cylinder extends ThreeDShape{

    private double radius, height;

    Cylinder( double r, double h ){
        radius = r;
        height = h;
        print();
        area();
        volume();
    }

    public void print(){
        System.out.println("\nShape : Cylinder ( 3D ) \n");
    }

    public void area(){
        System.out.println("Area Of Cylinder Is " + 2 * 3.14 * radius * (radius + height) );
    }

    public void volume(){
        System.out.println("Volume Of Cylinder Is " + 3.14 * radius * radius * height );
    }

}

class Cube extends ThreeDShape{

    private double side;

    Cube( double s){
        side = s;
        print();
        area();
        volume();
    }

    public void print(){
        System.out.println("\nShape : Cube ( 3D )\n");
    }

    public void area(){
        System.out.println("Area Of Cube Is " + 6 * side * side );
    }

    public void volume(){
        System.out.println("Volume Of Cube Is " + side * side * side );
    }

}

class Program4{

    public static void main( String[] args ){
       
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square(4);
        shapes[1] = new Circle(3);
        shapes[2] = new Cylinder(3, 5);
        shapes[3] = new Cube(3);

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Shape : Square ( 2D )

Area Of Square Is 16.0

Shape : Circle ( 2D )

Area Of Circle Is 28.259999999999998

Shape : Cylinder ( 3D )

Area Of Cylinder Is 150.72
Volume Of Cylinder Is 141.29999999999998

Shape : Cube ( 3D )

Area Of Cube Is 54.0
Volume Of Cube Is 27.0

--------------------------------------------

*/