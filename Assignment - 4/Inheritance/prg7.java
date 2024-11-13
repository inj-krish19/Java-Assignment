/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 7 : Define two 2D arrays of integers, namely A[3]4] and B[4][2]. 
Store the values into them. Store the result of matrix multiplication
into an another 2D array, say C.

------------------------------------------------------------------

*/

class Program7{

    public static void display( int ary[][], int row, int cols ){
        System.out.println("\n");
        for( int i=0; i<row; i++ ){
            for( int j=0; j<cols; j++ ){
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static int[][] mul(int[][] A, int[][] B) {
        int a = A.length;
        int aCols = A[0].length;
        int bRows = B.length;
        int b = B[0].length;

        if (aCols != bRows) {
            System.out.println("\nMultiplication for this size of matrices is not possible.");
            return null;
        }

        int[][] ans = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int temp = 0;
                for (int k = 0; k < aCols; k++) {
                    temp += A[i][k] * B[k][j];
                }
                ans[i][j] = temp;
            }
        }

        return ans;
    }

    public static void main( String[] args ){
    
        int a[][] = {   {1,2,3,4},  {5,6,7,8},  {9,2,6,8}   };
        int b[][] = {   {1,2},  {3,4},  {5,6},  {7,8}       };
        int c[][];

        System.out.println("\nMatrix A : ");
        Program7.display( a, 3, 4 );
        System.out.println("Matrix B : ");
        Program7.display( b, 4, 2);
        c = Program7.mul( a, b );
        System.out.println("ANSWER => A * B = Matrix C : ");
        Program7.display( c, 3, 2);

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Matrix A :


1 2 3 4
5 6 7 8
9 2 6 8


Matrix B : 


1 2
3 4
5 6
7 8


ANSWER => A * B = Matrix C :


50 60
114 140
101 126


--------------------------------------------

*/