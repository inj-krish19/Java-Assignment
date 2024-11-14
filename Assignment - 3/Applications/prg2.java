/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 :

I) Write an application that defines a Circle class with two constructors. 
The first form accepts a  double value that represents the radius of the circle. 
This constructor assumes that the circle is  centered at the origin. 
The second form accepts the three double values. The first two  arguments 
define the coordinates of the center and the third argument defines the radius.  

create 10 objects of the Circle type and save them in an array. 
Randomly select a radius  between 1 and 10 cm for each Circle created. 
After all circles have been created display each  circle and total area of all the circles. 

II) Read an IP address from user in the form of- 192.11.12.112.  
Separate each part from ‘.’ And store it in an array using String Tokenizer. 

------------------------------------------------------------------

*/

import java.util.Scanner;
import java.util.StringTokenizer;

class Circle{

    private static int number = 1;
    private double x, y, area, radius;

    Circle( double r ){
        x = y = 0;
        radius = r;
    }

    Circle( double a, double b, double r ){
        x = a;  y = b;
        radius = r;
    }

    public double area(){
        return 3.14 * radius * radius;
    }

    public void display( ){
        area = area();
        System.out.println("\nCircle " + number + " : \tArea of Circle with Radius " + radius + " cm 's Area Is " + area );
        Circle.number ++;
    }

}

class Program2{

    public static void main( String[] args ){
    
        String ip;
        double total_area = 0;
        StringTokenizer tokens;
        Circle circles[] = new Circle[10];
        Scanner input = new Scanner( System.in );

        for( int i=0; i<10; i++ ){
            circles[i] = new Circle( Math.random() * 10 );
            circles[i].display();
            total_area += circles[i].area();
        }

        System.out.println("\nTotal Area Of All Circles Is " + total_area + "\n\n");

        System.out.println("\nSecond Question : \n");
        System.out.print("\nEnter IP Address : ");
        ip = input.next();

        tokens = new StringTokenizer( ip, "." );

        if( tokens.countTokens() != 4 ){
            System.out.println("\nInvalid IP Address \n");
        }else{
            int parts[] = new int[4];
            int i = 0;
            while( tokens.hasMoreTokens() ){
                parts[i++] = Integer.parseInt(tokens.nextToken().toString());
            }

            System.out.print("\nParts Of IP Are : ");

            for( i=0; i<4; i++ ){
                System.out.print(parts[i] + " ");
            }
            System.out.println("\n");

        }


    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Circle 1 :      Area of Circle with Radius 0.460825035583754 cm 's Area Is 0.666809500141212

Circle 2 :      Area of Circle with Radius 4.522020067940935 cm 's Area Is 64.20880965386209

Circle 3 :      Area of Circle with Radius 2.9063022000901526 cm 's Area Is 26.522300381701424

Circle 4 :      Area of Circle with Radius 7.7206390077191225 cm 's Area Is 187.16995739879434

Circle 5 :      Area of Circle with Radius 8.747547042816363 cm 's Area Is 240.27147889613582

Circle 6 :      Area of Circle with Radius 9.311220622185797 cm 's Area Is 272.2343245515567

Circle 7 :      Area of Circle with Radius 6.500237918092234 cm 's Area Is 132.67471199426475

Circle 8 :      Area of Circle with Radius 4.217135382827982 cm 's Area Is 55.84248482849308

Circle 9 :      Area of Circle with Radius 5.474225237847085 cm 's Area Is 94.0968257377014

Circle 10 :     Area of Circle with Radius 5.592375318516973 cm 's Area Is 98.20243774791555

Total Area Of All Circles Is 1171.8901406905663



Second Question :


Enter IP Address : 192.11.12.112

Parts Of IP Are : 192 11 12 112

--------------------------------------------

*/