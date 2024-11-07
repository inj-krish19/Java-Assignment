/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 7 :  Leap Year Checker

Write a program that checks whether a given year is a leap year. 
The program should have the following features:

 Prompt the user to enter a year.

 Implement the logic to determine if the year is a 
 leap year (a year divisible by 4, except for years divisible by 100, 
 unless they are also divisible by 400).
 
 Display whether the entered year is a leap year or not.


------------------------------------------------------------------

*/

import java.util.Scanner;

class LeapYearChecker{
    
    private int year;

    LeapYearChecker(){}

    LeapYearChecker(int y){
        year = y;
    }

    void checkLeapYear(){

        System.out.println();

        if( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ){
            System.out.println(year + " Is Leap Year");
        }else{
            System.out.println(year + " Is Not Leap Year");
        }

        System.out.println("\n\n");

    }

}


class Program7{

    public static void main( String[] args ){


        Scanner input = new Scanner( System.in );

        System.out.print("\n\nEnter a Year : ");

        int year = input.nextInt();

        LeapYearChecker l = new LeapYearChecker(year);

        l.checkLeapYear();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------


Enter a Year : 2000

2000 Is Leap Year


********************************


Enter a Year : 1900

1900 Is Not Leap Year


********************************


Enter a Year : 2024

2024 Is Leap Year




--------------------------------------------

*/