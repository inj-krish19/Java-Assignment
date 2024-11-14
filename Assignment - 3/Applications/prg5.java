/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 : Given a Interface : public interface Grade{   int countGrade(int[] marks); void displayGrade(); } 

Implement the above interface to the abstract Student class and 
create 2 subclasses – McaStudent and DcaStudent. Create an 
array of 5 Students objects , read the information of  students – 
name , id , marks of all the semesters , calculate the grade 
and display the  information in the following format 


    *****************************************************************************************
    *                                                                                       *
    *   Id      Course      Firstname       Lastname        Total Marks         Grade       *
    *                                                                                       *
    *****************************************************************************************
    *                                                                                       *
    *   MCA101  MCA         Sunil           Shah            790                 A           *
    *                                                                                       *
    *   DCA101  DCA         Akhil           Jain            250                 B           *
    *                                                                                       *
    *****************************************************************************************

-> DCA- 2 semseter and MCA- 6 semester 
-> DCA has marks of Project also. 

=> Grade- DCA- total marks of 2 sem and project is considered 
o Above 75 % = A            o 60 to 75 = B 
o 50 to 60 =C               o Below 50= D 

=> Grade – MCA- total marks of 6 sem  
o Above 80%= A              o 70 to 80 = B 
o 50 to 70 =C               o Below 50= D


------------------------------------------------------------------

*/

interface Grade{
    char countGrade();
    void displayGrade();
}

abstract class Student{

    String id;
    String name;
    String course;
    double marks[];
    double total;
    double percentage;
    char grade;
    int semesters;
    public static int number = 1;

    Student( String sid, String n, double[] m ){
        id = sid;
        name = n;
        marks = m;
    }

    abstract void display( int number );

}

class MCAStudent extends Student implements Grade {

    MCAStudent( String sid, String n, double[] m ){
        super( sid,n,m );
        course = "MCA";
        semesters = 6;
        grade = countGrade( );
        display( Student.number ++ );
    }

    public String getMarks(){
        String _marks = "";
        for( double mark: marks ){
            _marks = _marks + String.valueOf(mark) + " ";
        }
        return _marks;
    }

    public void displayGrade(){
        grade = countGrade( );
        System.out.println("Student Has " + grade + " grade");
    }

    public char countGrade(){
 
        total = 0;
        for( double mark : marks ){
            total += mark;
        }

        percentage = total / marks.length;

        if( percentage > 80 ){  return 'A'; }
        else if( percentage > 70 && percentage <= 80 ){  return 'B'; }
        else if( percentage >= 50 && percentage <= 70 ){  return 'C'; }
        else{  return 'D'; }

    }

    public void display( int number ){

        System.out.println("\nStudent " + number + " : \n");
        System.out.println("Student Id Is " + id);
        System.out.println("Student Name Is " + name);
        System.out.println("Student Course Is " + course);
        System.out.println("Student Course Has " + semesters + " semesters");
        System.out.println("Student Marks Are " + getMarks() );
        System.out.println("Student Has " + total + " total marks");
        System.out.println("Student Has " + percentage + "% percentage");
        displayGrade();

    }

}

class DCAStudent extends Student implements Grade {

    DCAStudent( String sid, String n, double[] m ){
        super( sid,n,m );
        course = "DCA";
        semesters = 2;
        grade = countGrade( );
        display( Student.number ++ );
    }

    public String getMarks(){
        String _marks = "";
        for( double mark: marks ){
            _marks = _marks + String.valueOf(mark) + " ";
        }
        return _marks;
    }

    public void displayGrade(){
        grade = countGrade( );
        System.out.println("Student Has " + grade + " grade");
    }

    public char countGrade(){
 
        total = 0;
        for( double mark : marks ){
            total += mark;
        }

        percentage = total / marks.length;

        if( percentage > 75 ){  return 'A'; }
        else if( percentage > 60 && percentage <= 75 ){  return 'B'; }
        else if( percentage >= 50 && percentage <= 60 ){  return 'C'; }
        else{  return 'D'; }

    }

    public void display( int number ){

        System.out.println("\nStudent " + number + " : \n");
        System.out.println("Student Id Is " + id);
        System.out.println("Student Name Is " + name);
        System.out.println("Student Course Is " + course);
        System.out.println("Student Course Has " + semesters + " semesters");
        System.out.println("Student Marks Are " + getMarks() );
        System.out.println("Student Has Project Also");
        System.out.println("Student Has " + total + " total marks");
        System.out.println("Student Has " + percentage + "% percentage");
        displayGrade();

    }
}


class Program5{

    public static void main( String[] args ){
    
        Student students[] = new Student[5];

        students[0] = new MCAStudent( "MCA101", "RAHIL", new double[] {87,90,45,36,65} );
        students[1] = new DCAStudent( "DCA101", "KRISH", new double[] {31,32,33,34,35,36} );
        students[2] = new MCAStudent( "MCA102", "DHRUV", new double[] {60,70,80,90,100} );
        students[3] = new DCAStudent( "DCA102", "VISHAL", new double[] {91,92,93,94,95,96} );
        students[4] = new DCAStudent( "DCA103", "MOHIT", new double[] {67,65,96,34,97} );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Student 1 :

Student Id Is MCA101
Student Name Is RAHIL
Student Course Is MCA
Student Course Has 6 semesters
Student Marks Are 87.0 90.0 45.0 36.0 65.0
Student Has 323.0 total marks
Student Has 64.6% percentage
Student Has C grade

Student 2 :

Student Id Is DCA101
Student Name Is KRISH
Student Course Is DCA
Student Course Has 2 semesters
Student Marks Are 31.0 32.0 33.0 34.0 35.0 36.0
Student Has Project Also
Student Has 201.0 total marks
Student Has 33.5% percentage
Student Has D grade

Student 3 :

Student Id Is MCA102
Student Name Is DHRUV
Student Course Is MCA
Student Course Has 6 semesters
Student Marks Are 60.0 70.0 80.0 90.0 100.0
Student Has 400.0 total marks
Student Has 80.0% percentage
Student Has B grade

Student 4 :

Student Id Is DCA102
Student Name Is VISHAL
Student Course Is DCA
Student Course Has 2 semesters
Student Marks Are 91.0 92.0 93.0 94.0 95.0 96.0
Student Has Project Also
Student Has 561.0 total marks
Student Has 93.5% percentage
Student Has A grade

Student 5 :

Student Id Is DCA103
Student Name Is MOHIT
Student Course Is DCA
Student Course Has 2 semesters
Student Marks Are 67.0 65.0 96.0 34.0 97.0
Student Has Project Also
Student Has 359.0 total marks
Student Has 71.8% percentage
Student Has B grade

--------------------------------------------

*/