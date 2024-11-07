/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 1 : Write application that creates an array of double, 
to provide following functionality.
 
 Display the length of the array and its elements.
 
 Display an array. (Use for each version of loop for display).
 
 Compute the sume of the squares of these numbers.
 
 Determine Mean and Median of an array. 
 
 Sort an array – Ascending and Descending. 
 Use any two sorting algorithm.
 User can also select the sorting method.
 
 Search an element from the array, 
 i.e. returns the location of the element of an 
 that matches an indicated value.
 
 Copy of an array.
 
 Reverse of an array.

------------------------------------------------------------------

*/

import java.util.Scanner;

class Array{

    private int size;
    private double ary[];

    Array(  ){ size = 0;   }

    void createArray(){

        System.out.println("\n");
        System.out.print("Enter Size : " ); 

        Scanner input = new Scanner( System.in );
        size = input.nextInt();
        ary = new double[ size ];

        for( int i=0;i<size;i++ ){
            System.out.print("Enter Number " + (i+1) + " : " ); 
            ary[i] = input.nextDouble();
        }

        System.out.println("\n");

        input.close();

    }

    void showLength(){
        System.out.println( "\nLength Of Array Is " + size );
    }

    void show(){

        System.out.print( "\nArray : " );

        for (double number : ary) {
            System.out.print(number +" ");
        }

        System.out.println("\n");

    }

    void showSquare(){
        double sums = 1;
        for (double number : ary) {
            sums += number * number;
        }
        System.out.println("Squares Of Arrays Are : " + sums + "\n" );
    }

    void selection_sort(){
        double minimum;
        int pos;
        for (int i = 0; i < ary.length; i++) {
            minimum = ary[i];
            pos = i;
            for (int j = i; j < ary.length; j++) {
                if( minimum > ary[j] ){
                    minimum = ary[j];
                    pos = j;
                }
            }
            ary[pos] = ary[i];
            ary[i] = minimum;
        }
    }

    void bubble_sort(){
        for (int i = 0; i < ary.length; i++) {
            for (int j = i; j < ary.length; j++) {
                if( ary[i] > ary[j] ){
                    double temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
    }

    void reverse(){
        int j = ary.length - 1;
        for (int i = 0; i < ary.length/2; i++) {
            double temp = ary[i];
            ary[i] = ary[j];
            ary[j] = temp;
            j --;
        }
    }

    double mean(){
        double average = 0;
        for (double number : ary) {
            average += number;
        }
        return average / ary.length;
    }

    double median(){
        double average = 0;
        if( ary.length % 2 == 0 ){
            average = ( ary[ary.length/2] + ary[ary.length/2-1] ) / 2;
        }else{
            average = ary[ary.length/2];
        }
        return average;
    }

}

class Program1{

    public static void main( String args[] ){

        Array array = new Array();

        array.createArray();
        array.showLength();
        array.show();
        array.showSquare();
        array.selection_sort();
        array.show();
        System.out.println("Mean Of Array Is " + array.mean() + "\n");
        System.out.println("Median Of Array Is " + array.median() + "\n");
        array.reverse();
        array.show();



    }

}

/*

-----------------------------------------

Output :

-----------------------------------------



Enter Size : 5
Enter Number 1 : 4
Enter Number 2 : 2
Enter Number 3 : 7
Enter Number 4 : -1
Enter Number 5 : 90



Length Of Array Is 5

Array : 4.0 2.0 7.0 -1.0 90.0 

Squares Of Arrays Are : 8171.0


Array : -1.0 2.0 4.0 7.0 90.0

Mean Of Array Is 20.4

Median Of Array Is 4.0


Array : 90.0 7.0 4.0 2.0 -1.0



--------------------------------------------

*/