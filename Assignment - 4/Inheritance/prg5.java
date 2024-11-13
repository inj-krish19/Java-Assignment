/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 5 : Define a class Employee with usual member for an 
employee like empCode(String), empName(String), dateOfBirth(Date),
dateOfJoin(Date), designationCode(int), salary(float).
Create a list to store data about 10 employees using Vector. 
Manipulate the list using the methods in class Vector.

------------------------------------------------------------------

*/

import java.util.Date;
import java.util.Vector;
import java.util.Scanner;

class Employee{

    private String employee_code;
    private String name;
    private Date date_of_birth;
    private Date date_of_appointment;
    private int designation_code;
    private double salary;

    private Scanner input;

    Employee(){
        input = new Scanner( System.in );
        inputData();
    }

    Employee( String ec, String n, Date dob, Date doa, int designation, double income ){
        employee_code = ec;
        name = n;
        date_of_birth = dob;
        date_of_appointment = doa;
        designation_code = designation;
        salary = income;
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

    }

    public void display( int number ){

        System.out.println( "\nDetails of Employee " + number  + " : \n" );
        System.out.println( "Employee Code Is " + employee_code );
        System.out.println( "Employee Name Is " + name );
        System.out.println( "Employee Date Of Birth Is " + date_of_birth.toString() );
        System.out.println( "Employee Date Of Appointment Is " + date_of_appointment.toString() );
        System.out.println( "Employee Designation Code Is " + designation_code );
        System.out.println( "Employee Salary Is " + salary );
        System.out.println( "\n" );
    }

}

class Program5{

    public static void main( String[] args ){
    
        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee("2020-A-001", "Krish", new Date(100, 0, 15), new Date(120, 5, 10), 1, 50000.0));
        employees.add(new Employee("2021-E-002", "Dhruv", new Date(101, 1, 20), new Date(121, 6, 11), 2, 55000.0));
        employees.add(new Employee("2022-M-003", "Rahil", new Date(102, 2, 25), new Date(122, 7, 12), 3, 60000.0));
        employees.add(new Employee("2023-T-004", "Shivam", new Date(103, 3, 30), new Date(123, 8, 13), 4, 65000.0));
        employees.add(new Employee("2024-A-005", "Jay", new Date(104, 4, 5), new Date(124, 9, 14), 5, 70000.0));
        employees.add(new Employee("2025-E-006", "Yash", new Date(105, 5, 10), new Date(125, 10, 15), 1, 75000.0));
        employees.add(new Employee("2026-M-007", "Vishal", new Date(106, 6, 15), new Date(126, 11, 16), 2, 80000.0));
        employees.add(new Employee("2027-T-008", "Mohit", new Date(107, 7, 20), new Date(127, 0, 17), 3, 85000.0));
        employees.add(new Employee("2028-A-009", "Dev", new Date(108, 8, 25), new Date(128, 1, 18), 4, 90000.0));
        employees.add(new Employee("2029-E-010", "Yash", new Date(109, 9, 30), new Date(129, 2, 19), 5, 95000.0));

        int number = 1;
        System.out.println("\nAll Employees:");
        for (Employee employee : employees) {
            employee.display(number++);
        }

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


All Employees:

Details of Employee 1 :

Employee Code Is 2020-A-001
Employee Name Is Krish
Employee Date Of Birth Is Sat Jan 15 00:00:00 IST 2000
Employee Date Of Appointment Is Wed Jun 10 00:00:00 IST 2020
Employee Designation Code Is 1
Employee Salary Is 50000.0



Details of Employee 2 :

Employee Code Is 2021-E-002
Employee Name Is Dhruv
Employee Date Of Birth Is Tue Feb 20 00:00:00 IST 2001
Employee Date Of Appointment Is Sun Jul 11 00:00:00 IST 2021
Employee Designation Code Is 2
Employee Salary Is 55000.0



Details of Employee 3 :

Employee Code Is 2022-M-003
Employee Name Is Rahil
Employee Date Of Birth Is Mon Mar 25 00:00:00 IST 2002
Employee Date Of Appointment Is Fri Aug 12 00:00:00 IST 2022
Employee Designation Code Is 3
Employee Salary Is 60000.0



Details of Employee 4 :

Employee Code Is 2023-T-004
Employee Name Is Shivam
Employee Date Of Birth Is Wed Apr 30 00:00:00 IST 2003
Employee Date Of Appointment Is Wed Sep 13 00:00:00 IST 2023
Employee Designation Code Is 4
Employee Salary Is 65000.0



Details of Employee 5 :

Employee Code Is 2024-A-005
Employee Name Is Jay
Employee Date Of Birth Is Wed May 05 00:00:00 IST 2004
Employee Date Of Appointment Is Mon Oct 14 00:00:00 IST 2024
Employee Designation Code Is 5
Employee Salary Is 70000.0



Details of Employee 6 :

Employee Code Is 2025-E-006
Employee Name Is Yash
Employee Date Of Birth Is Fri Jun 10 00:00:00 IST 2005
Employee Date Of Appointment Is Sat Nov 15 00:00:00 IST 2025
Employee Designation Code Is 1
Employee Salary Is 75000.0



Details of Employee 7 :

Employee Code Is 2026-M-007
Employee Name Is Vishal
Employee Date Of Birth Is Sat Jul 15 00:00:00 IST 2006
Employee Date Of Appointment Is Wed Dec 16 00:00:00 IST 2026
Employee Designation Code Is 2
Employee Salary Is 80000.0



Details of Employee 8 :

Employee Code Is 2027-T-008
Employee Name Is Mohit
Employee Date Of Birth Is Mon Aug 20 00:00:00 IST 2007
Employee Date Of Appointment Is Sun Jan 17 00:00:00 IST 2027
Employee Designation Code Is 3
Employee Salary Is 85000.0



Details of Employee 9 :

Employee Code Is 2028-A-009
Employee Name Is Dev
Employee Date Of Birth Is Thu Sep 25 00:00:00 IST 2008
Employee Date Of Appointment Is Fri Feb 18 00:00:00 IST 2028
Employee Designation Code Is 4
Employee Salary Is 90000.0



Details of Employee 10 :

Employee Code Is 2029-E-010
Employee Name Is Yash
Employee Date Of Birth Is Fri Oct 30 00:00:00 IST 2009
Employee Date Of Appointment Is Mon Mar 19 00:00:00 IST 2029
Employee Designation Code Is 5
Employee Salary Is 95000.0


--------------------------------------------

*/