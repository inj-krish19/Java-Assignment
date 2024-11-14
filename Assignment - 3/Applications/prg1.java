/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Write an Application program to generate Employee Payslip.  

Create following classes 
    => Employee - emp_no,emp_name,basic ,Des  
    => InvalidBasicException - Class for user defined Exception (if basic is negative or non numeric).  
    => Payslip - do all calculations (da, hra) based on following rules. 

-> If basic<=5000 Then hra=5% of basic and da=3% of basic.  
-> If basic>=15000 Then hra=7.5% of basic and da=5% of basic  
-> Else hra=10% of basic and da=8% of basic.  

Based on that calculate netpay for each employee in Payslip class and 
generate the  formatted pay slip in a file, with filename as <emp_no>_payslip.txt.  

Note: emp_no should be generated automatically with prefix EMP, use array of objects. 

------------------------------------------------------------------

*/

import java.io.FileWriter;
import java.io.IOException;

class Employee{

    private String employee_no;
    private String name;
    private double basic;
    private double netsalary;
    private Payslip payslip;

    Employee( int ec, String n, double b){
        employee_no = "EMP" + String.valueOf(ec);
        name = n;
        validateSalary(b);
        basic = b;
        payslip = new Payslip( employee_no, basic );
        netsalary = payslip.getNetSalary();
        payslip.information( info() );
        display();
        payslip.generate();
    }

    public void validateSalary( double basic ){
        try{    if( basic < 0 ){    basic = 0;  throw new InvalidBasicException();  }
        }catch( InvalidBasicException ibe ){  System.out.println("\nBasic Slary Should Not Be Negative or Non Numeric. \n"); System.exit(0);  }
    }

    public void display(){
        System.out.println( "\nDetails of Employee " + employee_no + " : \n" );
        System.out.println( "Employee Number Is " + employee_no );
        System.out.println( "Employee Name Is " + name );
        System.out.println( "Employee Basic Salary Is " + basic );
        payslip.getInfoAboutInterest();
        System.out.println( "Employee Net Salary Is " + netsalary );
        System.out.println( "" );
    }

    public String info(){
        return "Details of Employee " + employee_no + " : \n\nEmployee Number Is " + employee_no + "\nEmployee Name Is " + name + "\nEmployee Basic Salary Is " + basic;
    }

}

class InvalidBasicException extends Exception{
    
    InvalidBasicException( ){
        System.out.println("\nBasic Slary Should Not Be Negative or Non Numeric. \n");
    }

    InvalidBasicException( String error ){
        System.out.println(error);
    }

}

class Payslip{

    private String employee_no;
    private String filename;
    private String info;
    private double basic;
    private double hra;
    private double da;

    Payslip( String en, double b ){
        employee_no = en;
        basic = b;
        filename = employee_no + "_payslip.txt";
        assignRates();
    }

    private void assignRates(){
        if( basic <= 5000 ){    hra = 5;    da = 3;         }
        else if( basic <= 15000 ){    hra = 7.5;    da = 5; }
        else{   hra = 10;   da = 8;                         }
    }

    public void getInfoAboutInterest(){
        System.out.println( "Employee Has " + hra + "% HRA" );
        System.out.println( "Employee Has " + da + "% DA" );
    }

    public void information( String _info ){
        info = _info;
    }

    public double getNetSalary(){
        return basic + ( basic * hra / 100 ) + ( basic * da / 100 );
    }

    public void generate(){

        try (FileWriter fw = new FileWriter(filename)) { 

            fw.write(info);
            fw.write( "\nEmployee Has " + hra + "% HRA" );
            fw.write( "\nEmployee Has " + da + "% DA" );
            fw.write( "\n" + basic + " + " + ( basic * hra / 100 ) + " + " + ( basic * da / 100 ) + " = " + getNetSalary() );
            fw.write( "\nEmployee Net Salary Is " + getNetSalary() + "\n");

            System.out.println("Payslip Generated For Employee " + employee_no + ".\n");

        }catch( IOException ie ){
            System.out.println("\nFailed To Generate Payslip for Employee " + employee_no +".\n");
        }

    }

}

class Program1{

    public static void main( String[] args ){

        Employee employees[] = new Employee[3];
        
        employees[0]= new Employee( 101, "KRISH", 5000 );
        employees[1]= new Employee( 102, "DHRUV", 54000 );
        employees[2]= new Employee( 103, "VISHAL", 12000 );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Details of Employee EMP101 :

Employee Number Is EMP101
Employee Name Is KRISH
Employee Basic Salary Is 5000.0
Employee Has 5.0% HRA
Employee Has 3.0% DA
Employee Net Salary Is 5400.0

Payslip Generated For Employee EMP101.


Details of Employee EMP102 :

Employee Number Is EMP102
Employee Name Is DHRUV
Employee Basic Salary Is 54000.0
Employee Has 10.0% HRA
Employee Has 8.0% DA
Employee Net Salary Is 63720.0

Payslip Generated For Employee EMP102.


Details of Employee EMP103 :

Employee Number Is EMP103
Employee Name Is VISHAL
Employee Basic Salary Is 12000.0
Employee Has 7.5% HRA
Employee Has 5.0% DA
Employee Net Salary Is 13500.0

Payslip Generated For Employee EMP103.

--------------------------------------------

*/