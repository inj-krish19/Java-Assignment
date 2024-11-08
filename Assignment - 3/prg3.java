/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 3 : Develop the Figure application in given steps. 

a. Design an interface IFig having the following methods:  

    i. public void calcAreaQ;  

    ii. public void calcVolumeO;  
    
    iii. It must also have the variable pi of the
    type double and having a value 3.1428.  
    
b. Design an abstract class called Figure.  

    i. It must have three attributes r. a and v of data type double.  

    ii. It has abstract methods:  

        1. public abstract void dispAreaQ;  
        2. public abstract void dispVolumeO;  

c. Design three classes Cone, Sphere and Cylinder. Each of them,
should extend the Figure class and implement the IFig interface.  

d. Write a test program to demonstrate polymorphism 


===================================================================


    *****************************************************
    *                                                   *
    *   ClassName    Attribute                          *
    *                                                   *
    *****************************************************
    *                                                   *
    *   Cone        : h, s of the type double           *
    *                                                   *
    *   Sphere      :                                   *
    *                                                   *
    *   Cylinder    : h of the type double              *
    *                                                   *
    *****************************************************

===================================================================

    *****************************************************
    *                                                   *
    *   Figure          Formula                         *
    *                                                   *
    *****************************************************
    *                                                   *
    *   Cone        : Area =(pi*r*s)+(pi*r*r)           *
    *                 Volume = (pi * r * r * h)/3       *
    *                                                   *
    *   Sphere      : Area = 4 * pi * r * r             *
    *              Volume = (4 * pi * r * r r) /3        *
    *                                                   *
    Cylinder    : Area =(2*pi*r*r)+(2*pi*r*h)           *
    *              Volume = pi * r * r * h               *
    *                                                   *
    *****************************************************

=====================================================================


------------------------------------------------------------------

*/


interface IFig{

    public void calcAreaQ();
    public void calcVolumeO();
    public final double pi = 3.1428;

} 

abstract class Figure{

    protected double a, r, v;

    public abstract void dispAreaQ();
    public abstract void dispVolumeO(); 

}

class Cone extends Figure implements IFig {

    private double h, s;

    Cone( double a, double b, double c ){
        h = a;
        r = b;
        s = c;
        System.out.println("\nCone : \th : " + h + " r : " + r + " s : " + s + "\n");
        dispAreaQ();
        dispVolumeO();
    }

    public void calcAreaQ(){
        a = pi * r * s + pi * r * r;
    }

    public void calcVolumeO(){
        v = pi * r * r * h / 3 ;
    }

    public void dispAreaQ(){
        calcAreaQ();
        System.out.println("\nArea of Cone Is " + a );
    }
    
    public void dispVolumeO(){
        calcVolumeO();
        System.out.println("\nVolume Of Cone Is " + v );
    }

}

class Sphere extends Figure implements IFig {

    Sphere( double a ){
        r = a;
        System.out.println("\nSphere : \tr : " + r + "\n");
        dispAreaQ();
        dispVolumeO();
    }

    public void calcAreaQ(){
        a = 4 * pi * r * r ;
    }

    public void calcVolumeO(){
        v = 4 * pi * r * r * r / 3;
    }

    public void dispAreaQ(){
        calcAreaQ();
        System.out.println("\nArea Of Sphere Is " + a );
    }
    
    public void dispVolumeO(){
        calcVolumeO();
        System.out.println("\nVolume Of Sphere Is " + v );
    }

}

class Cylinder extends Figure implements IFig {

    private double h;

    Cylinder( double a, double b ){
        h = a;
        r = b;
        System.out.println("\nCone : \th : " + h + " r : " + r + "\n");
        dispAreaQ();
        dispVolumeO();
    }

    public void calcAreaQ(){
        a =  2 * pi * r * r + 2 * pi * r * h;
    }

    public void calcVolumeO(){
        v = pi * r * r * h ;
    }

    public void dispAreaQ(){
        calcAreaQ();
        System.out.println("\nArea Of Cylinder Is " + a );
    }
    
    public void dispVolumeO(){
        calcVolumeO();
        System.out.println("\nVolume Of Cylinder Is " + v );
    }

}

class Program3{

    public static void main( String[] args ){

        IFig figure = new Cone( 1, 2, 3 );
        figure = new Sphere(3);
        figure = new Cylinder( 4, 5 );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Cone :  h : 1.0 r : 2.0 s : 3.0


Area of Cone Is 31.427999999999997

Volume Of Cone Is 4.1903999999999995

Sphere :        r : 3.0


Area Of Sphere Is 113.1408

Volume Of Sphere Is 113.1408

Cone :  h : 4.0 r : 5.0


Area Of Cylinder Is 282.852

Volume Of Cylinder Is 314.28

--------------------------------------------

*/