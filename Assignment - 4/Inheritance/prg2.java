/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 2 : Define a class Complex to represent an object for 
a complex number like Z = X + i.Y with the following methods:

-> Complex add(Complex z1, Complex z2) //To add two complex numbers

-> Complex sub(Complex z1, Complex z2) //To subtract two complex numbers

-> Complex mul(Complex z1, Complex z2) // To multiply two complex numbers

-> float magnitude(Complex z) // To find the modulus

-> Complex conjugate(Complex z) // To find the complex conjugate

Write the main class and instantiate the objects of the above mentioned classes.

------------------------------------------------------------------

*/

class Complex{

    private int x;
    private int y;

    Complex(){  x = y = 0;  }

    Complex( int a, int b ){
        x = a;  y = b;
    }

    public void display(){
        System.out.println( x + " + "  + y + "i\n");
    }

    public static Complex add( Complex a, Complex b){
        Complex ans = new Complex();
        ans.x = a.x + b.x;
        ans.y = a.y + b.y;
        return ans;
    }

    public static Complex sub( Complex a, Complex b){
        Complex ans = new Complex();
        ans.x = a.x - b.x;
        ans.y = a.y - b.y;
        return ans;
    }

    public static Complex mul( Complex a, Complex b){
        Complex ans = new Complex();
        ans.x = a.x * b.x;
        ans.y = a.y * b.y;
        return ans;
    }

    public static float magnitude( Complex a){
        return a.x % a.y ;
    }

    public static Complex conjugate( Complex a){
        return new Complex( a.x, -a.y );
    }

}

class Program2{

    public static void main( String[] args ){
    
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);

        System.out.print("\n\nObject A Is ");        a.display();
        System.out.print("Object B Is ");        b.display();

        System.out.print("Addition Of Object A and B Is => ");        Complex.add( a,b ).display();
        System.out.print("Subtarction Of Object A and B Is => ");     Complex.add( a,b ).display();
        System.out.print("Multiplication Of Object A and B Is => ");  Complex.add( a,b ).display();
        System.out.print("\nMagnitude Of Object A Is => " + Complex.magnitude( a ) );
        System.out.print("\nMagnitude Of Object B Is => " + Complex.magnitude( b ) );
        System.out.print("\nConjugate Of Object A Is => ");           Complex.conjugate( a ).display();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Object A Is 1 + 2i

Object B Is 3 + 4i

Addition Of Object A and B Is => 4 + 6i

Subtarction Of Object A and B Is => 4 + 6i

Multiplication Of Object A and B Is => 4 + 6i


Magnitude Of Object A Is => 1.0
Magnitude Of Object B Is => 3.0
Conjugate Of Object A Is => 1 + -2i

--------------------------------------------

*/