/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 2

-----------------------------------------------------------------

Program - 2 : Write a program in Java to create variable 
size array. Data can be numeric. 

 Flush an array

 add a number at a specified location in an anay.

 display the array


------------------------------------------------------------------

*/

import java.util.Scanner;

class ArrayList{

    private int size;
    private double ary[];

    ArrayList(  ){ size = 0;   }

    void modifyArrayList( int pos, int data){
        
        double temp[] = new double[ size ];

        for( int i=0;i<size;i++ ){
            temp[i] = ary[i];
        }
        
        ary = new double[ size + 1 ];

        for( int i=0; i<pos; i++ ){
            ary[i] = temp[i];
        }
        ary[pos] = data;
        size ++;
        for( int i=pos+1; i<size; i++ ){
            ary[i] = temp[i-1];
        }

    }

    void flush(){
        size = 0;
        ary = new double[0];
    }

    void createArrayList(){

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

    void show(){

        System.out.print( "\nArray : " );

        for (double number : ary) {
            System.out.print(number +" ");
        }

        System.out.println("\n");
    }

}

class CustomException extends Exception{

    CustomException(String message){
        getErrorMessage(message);
    }

    void getErrorMessage(String message){
        System.out.println(message);
    }

}

class Program2{

    public static void main( String args[] ){

        try{
            
            ArrayList array = new ArrayList();

            int pos = 1, data = 1;

            if( pos < 0 ){
                throw new CustomException("Position Should Not Be Negative ");
            }

            array.createArrayList();
            array.show();
            array.modifyArrayList( pos,data );
            array.show();
            array.flush();

        }catch( CustomException ce ){
        }finally{
            System.out.println("Program Ends ...");
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter Size : 5
Enter Number 1 : 1
Enter Number 2 : 3
Enter Number 3 : 4
Enter Number 4 : 5
Enter Number 5 : 6

Array : 1.0 3.0 4.0 5.0 6.0


Array : 1.0 1.0 3.0 4.0 5.0 6.0

Program Ends ...


--------------------------------------------

*/