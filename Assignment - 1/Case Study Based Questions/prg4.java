/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 4 :  Fibonacci Sequence Generator

Write a program that generates the Fibonacci sequence. 
The program should have the following features:

 Prompt the user to enter the number of Fibonacci numbers to generate.
 
 Use a loop to calculate and display the Fibonacci sequence 
 up to the specified number of terms.
 
 Optionally, allow the user to choose whether to display 
 the sequence using a for loop, while loop, or recursive method.


------------------------------------------------------------------

*/

import java.util.Scanner;

class FibonacciSequenceGenerator{
    
  private int limit;
  
  FibonacciSequenceGenerator(){}

  void combine(){

    System.out.println("\n\n");

    Scanner input = new Scanner(System.in);

  
    System.out.print("\n\nEnter Limit : ");
    limit = input.nextInt();

    System.out.print("A for For Loop\nB for While Loop\nC For Recursion\nEnter Choice : ");
    char choice = input.next().charAt(0);

    if( choice == 'A' || choice == 'a' ){
      fibonacciForLoop();
    }else if( choice == 'B' || choice == 'b' ){
      fibonacciWhileLoop();
    }else if( choice == 'C' || choice == 'c' ){
      fibonacciRecurssion(0,0,1);
    }else{
      System.out.println("\n\nInvalid Choice\n");
    }

    System.out.println("\n\n");

  }

  void fibonacciForLoop(){
      int a = 0;
      int b = 1;

      for(int i=0;i<limit;i++){
        int temp = a;
        System.out.print(a + " ");
        a = b;
        b = a + temp;
      }

  }

  void fibonacciWhileLoop(){
      int a = 0;
      int b = 1;
      int i = 0;

      while( i < limit ){
        int temp = a;
        System.out.print(a + " ");
        a = b;
        b = a + temp;
        i++;
      }

  }

  void fibonacciRecurssion(int current,int a,int b){
      
      if( current < limit ){
        int temp = a;
        System.out.print(a + " ");
        a = b;
        b = a + temp;
        current ++;
        fibonacciRecurssion(current,a,b);
      }

  }

}


class Program4{

  public static void main( String[] args ){

    FibonacciSequenceGenerator f = new FibonacciSequenceGenerator();

    f.combine();

  }

}


/*

-----------------------------------------

Output :

-----------------------------------------



Enter Limit : 7
A for For Loop
B for While Loop
C For Recursion
Enter Choice : a
0 1 1 2 3 5 8


********************************


Enter Limit : 7
A for For Loop
B for While Loop
C For Recursion
Enter Choice : b
0 1 1 2 3 5 8


********************************



Enter Limit : 7
A for For Loop
B for While Loop
C For Recursion
Enter Choice : c
0 1 1 2 3 5 8


--------------------------------------------

*/