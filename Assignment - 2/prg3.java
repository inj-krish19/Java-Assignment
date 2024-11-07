/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 3:  Program in Java to find A+B, A-B, A*B 
and transpose of A, where A is a matrix of 3*3 and 
B is a matrix of 3*4.Take the values in matrices 
A and B from the user.



------------------------------------------------------------------

*/

import java.util.Scanner;

class Matrix{

    private int row;
    private int cols;
    private int ary[][];

    Matrix(  ){ 
        row = 0;
        cols = 0;
        ary = new int[0][0];
    }

    Matrix( int x,int y ){
        row = x;
        cols = y;
        ary = new int[row][cols];
    }

    void setMatrix( ){

        System.out.println("\n");
        Scanner input = new Scanner( System.in );

        for( int i=0; i<row; i++ ){
            for( int j=0; j<cols; j++ ){
                System.out.print("\nEnter Element " + i + " " + j + " : ");
                this.ary[i][j] = input.nextInt();
            }
        }

        System.out.println("\n\n");

    }

    void display(  ){
        System.out.println("\n");
        for( int i=0; i<row; i++ ){
            for( int j=0; j<cols; j++ ){
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static Matrix add( Matrix A,Matrix B ){

        if( A.row != B.row || A.cols != B.cols ){
            System.out.println("\nAddition For This Size Of Matrices Is Not Possible");
            return null;
        }

        Matrix ans = new Matrix( A.row, B.cols );

        for( int i=0; i<ans.row; i++ ){
            for( int j=0; j<ans.cols; j++ ){
                ans.ary[i][j] = A.ary[i][j] + B.ary[i][j];
            }
        }

        return ans;

    }

    public static Matrix sub( Matrix A,Matrix B ){
        
        if( A.row != B.row || A.cols != B.cols ){
            System.out.println("\nSubtraction For This Size Of Matrices Is Not Possible");
            return null;
        }

        Matrix ans = new Matrix( A.row, B.cols );

        for( int i=0; i<ans.row; i++ ){
            for( int j=0; j<ans.cols; j++ ){
                ans.ary[i][j] = A.ary[i][j] - B.ary[i][j];
            }
        }

        return ans;

    }


    public static Matrix mul( Matrix A,Matrix B ){
        
        if( A.cols != B.row ){
            System.out.println("\nMultiplication For This Size Of Matrices Is Not Possible");
            return null;
        }

        Matrix ans = new Matrix( A.row, B.cols );

        for( int i=0; i<A.row; i++ ){
            for( int j=0; j<B.cols; j++ ){
                int temp = 0;
                for( int k=0;k<A.cols;k++){
                    temp += ( A.ary[i][k] * B.ary[k][i] );
                }
                ans.ary[i][j] = temp;
            }
        }

        return ans;

    }
    public static Matrix transpose( Matrix A ){
        
        Matrix ans = new Matrix( A.cols, A.row );

        for( int i=0; i<ans.row; i++ ){
            for( int j=0; j<ans.cols; j++ ){
                ans.ary[j][i] = A.ary[i][j];
            }
        }

        return ans;

    }

}

class Program3{

    public static void main( String args[] ){

        Matrix A = new Matrix(3,3);
        Matrix B = new Matrix(3,4);

        A.setMatrix();
        B.setMatrix();

        A.display();
        B.display();

        Matrix C;

        C = Matrix.add(A,B);
        C = Matrix.sub(A,B);
        C = Matrix.mul(A,B);
        C.display();
        C = Matrix.transpose(A);
        C.display();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------



Enter Element 0 0 : 1

Enter Element 0 1 : 2

Enter Element 0 2 : 3

Enter Element 1 0 : 4

Enter Element 1 1 : 5

Enter Element 1 2 : 6

Enter Element 2 0 : 7

Enter Element 2 1 : 8

Enter Element 2 2 : 9






Enter Element 0 0 : 1

Enter Element 0 1 : 2

Enter Element 0 2 : 3

Enter Element 0 3 : 4

Enter Element 1 0 : 5

Enter Element 1 1 : 6

Enter Element 1 2 : 7

Enter Element 1 3 : 8

Enter Element 2 0 : 9

Enter Element 2 1 : 10

Enter Element 2 2 : 11

Enter Element 2 3 : 12





1 2 3
4 5 6
7 8 9




1 2 3 4
5 6 7 8
9 10 11 12



Addition For This Size Of Matrices Is Not Possible

Subtraction For This Size Of Matrices Is Not Possible


38 38 38 38
98 98 98 98
176 176 176 176




1 4 7
2 5 8
3 6 9

--------------------------------------------

*/