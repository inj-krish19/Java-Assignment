/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Define an Employee class with Employee code , name , 
date of birth , and date of  appointment . The Employee code must 
have a format of year-designation-number. The  year will be two digit code . 
The designation is single letter code M for Manager , A for  Administrative , 
T for Technical Staff , E for Executive Staff . The number is a three  digit number. 
For Eg. 
 87-M-123 ( year is 1987 , Designation is Manager and number is 123)  91-T-126 

Write a java program to read the employee code , name , date of birth , 
and date of  appointment and validate the employee code. If the employee code 
is incorrect a suitable  user defined exception must be thrown . If the date of birth 
is after date of appointment then  throw another user defined exception. 

If all the details are correct then only create the employee object and 
display detail of  employees and number of years of experience. 

------------------------------------------------------------------

*/

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

class DateError extends Exception{
    
    DateError( ){
        System.out.println("\nDate Of Birth Should Not Be Same or After The Date Of Appointment. \n");
    }

    DateError( String error ){
        System.out.println(error);
    }

}

class CodeError extends Exception{

    CodeError( ){
        System.out.println("\nEmployee Code Is Invalid. \n");
    }

    CodeError( String error ){
        System.out.println(error);
    }

}

class Employee{

    private String employee_code;
    private String name;
    private Date date_of_birth;
    private Date date_of_appointment;

    private Scanner input;
    private StringTokenizer tokens;

    Employee(){
        input = new Scanner( System.in );
        inputData();
    }

    Employee( String ec, String n, Date dob, Date doa ){
        employee_code = ec;
        name = n;
        date_of_birth = dob;
        date_of_appointment = doa;
        validateDates();
        validateEC();
    }

    public void validateDates(){

        try{

            if( date_of_birth.compareTo( date_of_appointment ) >= 0 ){
                throw new DateError();
            }else{
                System.out.println("\nDate Validated Successfully. \n");
            }

        }catch( DateError date ){   System.exit(0); }

    }

    public void validateEC(){

        try{

            tokens = new StringTokenizer(employee_code,"-");

            
            if( tokens.countTokens() != 3 ){
                throw new CodeError();
            }
            
            String token = tokens.nextToken();
            if( Integer.parseInt(token) != date_of_birth.getYear() ){   throw new CodeError();  }
            
            token = tokens.nextToken();
            if( token.charAt(0) != 'A' && token.charAt(0) != 'E' && token.charAt(0) != 'M' && token.charAt(0) != 'T' ){ throw new CodeError();  }

            token = tokens.nextToken();
            if( token.length() != 3 ){  throw new CodeError();  }

            System.out.println("\nEmployee Code Is Validated Successfully. \n");

        }catch( CodeError ce ){ System.exit(0); }

    }


    public void inputData(){

        System.out.println("\nGive Details Of Employee : \n");
        System.out.print("Enter Employee Code : ");
        employee_code = input.next();
        System.out.print("\nEnter Employee Name : ");
        name = input.next();

        int date, month, year;

        System.out.print("\nEnter Date Of Birth : ");
        date = input.nextInt();
        System.out.print("\nEnter Month Of Birth : ");
        month = input.nextInt();
        System.out.print("\nEnter Year Of Birth : ");
        year = input.nextInt();

        date_of_birth = new Date( year - 1900 , month - 1, date);

        System.out.print("\n\nEnter Date Of Appointment : ");
        date = input.nextInt();
        System.out.print("\nEnter Month Of Appointment : ");
        month = input.nextInt();
        System.out.print("\nEnter Year Of Appointment : ");
        year = input.nextInt();

        date_of_appointment = new Date( year - 1900 , month - 1, date);

        validateDates();
        validateEC();

    }

    public void display(){

        System.out.println( "\nDetails of Employee : \n" );
        System.out.println( "Employee Code Is " + employee_code );
        System.out.println( "Employee Name Is " + name );
        System.out.println( "Employee Date Of Birth Is " + date_of_birth.toString() );
        System.out.println( "Employee Date Of Appointment Is " + date_of_appointment.toString() );
        System.out.println( "\n" );
    }

}

class Program1{

    public static void main( String[] args ){

        Employee emp = new Employee();
        emp.display();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Give Details Of Employee :

Enter Employee Code : 87-A-123

Enter Employee Name : KRISH

Enter Date Of Birth : 19

Enter Month Of Birth : 02

Enter Year Of Birth : 1987


Enter Date Of Appointment : 29

Enter Month Of Appointment : 10

Enter Year Of Appointment : 2024

Date Validated Successfully.


Employee Code Is Validated Successfully.


Details of Employee :

Employee Code Is 87-A-123
Employee Name Is KRISH
Employee Date Of Birth Is Thu Feb 19 00:00:00 IST 1987
Employee Date Of Appointment Is Tue Oct 29 00:00:00 IST 2024


--------------------------------------------

*/