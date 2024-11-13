/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 1 : Read at most 10 names of students and store them into 
an array of String nameOfStudents[10]. Sort the names into the
lexicographic order. Display the sorted list of names.

------------------------------------------------------------------

*/

import java.util.Scanner;

class Program1{

    public static void main( String[] args ){
    
        String names[] = new String[10];
        Scanner input = new Scanner( System.in );

        System.out.println("\nEnter 10 Names : \n");

        for( int i=0;i<10;i++){
            System.out.print("\nEnter Name " + (i+1) + " : ");
            names[i] = input.next();
        }

        System.out.println("\nNames After Sorting In Lexiographical Order : \n");
        
        for( int i=0; i<10; i++){
            for( int j=i+1; j<10; j++){
                char[] s1 = names[i].toCharArray();
                char[] s2 = names[j].toCharArray();
                boolean swap = false;

                int minimum = Math.min( s1.length, s2.length );
                for( int temp=0; temp<minimum; temp++){
                    if( s1[temp] < s2[temp] ){
                        break;
                    }
                    if( s2[temp] < s1[temp] ){
                        swap = true;
                        break;
                    }
                }

                if( !swap && names[i].length() > names[j].length() ){
                    swap = true;
                }

                if( swap ){
                    String temp = names[i];
                    names[i] = names[j]; 
                    names[j] = temp;
                }

            }
        }

        for( int i=0;i<10;i++){
            System.out.println("\nName " + (i+1) + " : " + names[i] );
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter 10 Names :


Enter Name 1 : Krish

Enter Name 2 : Shah

Enter Name 3 : Vishal

Enter Name 4 : Baghel

Enter Name 5 : Aaditya

Enter Name 6 : Dhruv

Enter Name 7 : Rapariya

Enter Name 8 : Rahil

Enter Name 9 : Mohit

Enter Name 10 : Dev

Names After Sorting In Lexiographical Order :


Name 1 : Dev

Name 2 : Dhruv

Name 3 : Mohit

Name 4 : Rahil

Name 5 : Aaditya

Name 6 : Baghel

Name 7 : Rapariya

Name 8 : Shah

Name 9 : Krish

Name 10 : Vishal

--------------------------------------------

*/