/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Write a program to read employee detail and store the 
employee object in linkedlist. Sort the  list based on salary. 

a. Create class- Employee (Attributes- empid, name , dob , salary : 
Methods: setDetails,  getDetails and constructures ) 

b. Employee class must implement comparable interface 

c. Create another class TestEmployee, here create the linkedlist of employees and sort the  list. 

------------------------------------------------------------------

*/

import java.util.List;
import java.util.Date;
import java.util.LinkedList;
import java.util.Collections;

class Employee implements Comparable<Employee>{

    private int empid;
    private String name;
    private Date dob;
    private double salary;

    Employee( int eid, String n, Date date, double income ){
        setDetails( eid, n, date, income );
    }

    public int getEid(){    return empid;       }
    public String getName(){    return name;    }
    public Date getDOB(){    return dob;        }
    public double getSalery(){    return salary;}

    public void setEid( int eid ){   empid = eid;    }
    public void setName( String n){ name = n;   }
    public void setDOB( Date date ){    dob = date; }
    public void setSalary( double income ){ salary = income;    }

    public void setDetails( int eid, String n, Date date, double income ){
        empid = eid;
        name = n;
        dob = date;
        salary = income;
    }

    public Employee getDetails(){
        return this;
    }

    public int compareTo( Employee emp ){
        return Double.compare( salary, emp.salary );
    }

    public void display(){
        System.out.println("\nEmployee Id " + empid );
        System.out.println("Employee Name " + name );
        System.out.println("Employee Date Of Birth " + dob.toString() );
        System.out.println("Employee Salary " + salary );
        System.out.println();
    }

}

class TestEmployee{

    public static void main( ){

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(1, "KRISH", new Date( 105, 1, 19 ), 30000) );
        list.add(new Employee(2, "VISHAL", new Date( 106, 7, 28 ), 12000) );
        list.add(new Employee(3, "MOHIT", new Date( 104, 6, 20 ), 45000) );
        list.add(new Employee(4, "DEV", new Date( 104, 2, 14 ), 17000) );

        System.out.println("\nData Of Employee After Sorting Based On Salary: \n");

        Collections.sort(list);
        for (Employee employee : list) {
            employee.display();
        }

    }

}

class Program1{

    public static void main( String[] args ){
        TestEmployee.main();
    }

}


/*

-----------------------------------------

Output :

-----------------------------------------


Data Of Employee After Sorting Based On Salary:


Employee Id 2
Employee Name VISHAL
Employee Date Of Birth Mon Aug 28 00:00:00 IST 2006
Employee Salary 12000.0


Employee Id 4
Employee Name DEV
Employee Date Of Birth Sun Mar 14 00:00:00 IST 2004
Employee Salary 17000.0


Employee Id 1
Employee Name KRISH
Employee Date Of Birth Sat Feb 19 00:00:00 IST 2005
Employee Salary 30000.0


Employee Id 3
Employee Name MOHIT
Employee Date Of Birth Tue Jul 20 00:00:00 IST 2004
Employee Salary 45000.0


--------------------------------------------

*/