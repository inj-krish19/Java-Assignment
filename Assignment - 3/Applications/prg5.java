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
    char countGrade(int[] marks);
    void displayGrade();
}

abstract class Student{
    int id;
    String name;
    String course;
    double marks[];
    double percentage;
    char grade;

    Student( int sid, String n, String c, double[] m ){
        id = sid;
        name = n;
        course = c;
        marks = m;
    }

    char countGrade(int[] marks){
        percentage = 
    }


}

class MCAStudent extends Student implements Grade {

    private static int semesters = 6;

    MCAStudent( int sid, String n, String c, double[] m ){
        super( sid,n,c,m );
    }

}

class DCAStudent extends Student implements Grade {

    private static int semesters = 2;

    DCAStudent( int sid, String n, String c, double[] m ){
        super( sid,n,c,m );
    }

}


class Program5{

    public static void main( String[] args ){
    
    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

--------------------------------------------

*/