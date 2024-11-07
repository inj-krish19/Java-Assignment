/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 3 : Student Grade Management

Develop a program to manage student grades. 
The program should have the following features:

 Create a Student class with properties for 
 name, student ID, and grades (in an array).
 
 Implement methods to:
 
 Add a new student
 Update a student's grades
 Calculate the average grade for a student
 Find the student with the highest average grade

 Prompt the user to perform various operations, such as 
 adding a new student, updating a student's grades, and 
 displaying the student with the highest average grade.


------------------------------------------------------------------

*/

import java.util.Scanner;

class StudentGradeManagement{
    
    private int id;
    private String name;
    private int grade[];
    private double average;

    StudentGradeManagement(){}

    StudentGradeManagement( int i,String n,int[] g){
        id = i;
        name = n;
        grade = g.clone();
    }

    void addStudent( int i,String n,int[] g ){
        id = i;
        name = n;
        grade = g;
    }

    void updateStudent(){

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Name : ");
        name = input.next();

        System.out.println("\nEnter Grades : \n");

        for(int i=0;i<3;i++){
            System.out.print("\nEnter Grade Of Subject " + (i+1) + " : ");
            grade[i] = input.nextInt();
        }

        calculateAverage();

        System.out.println("\n");

    }

    void calculateAverage(){
        
        average = 0.0;

        for (int i=0;i<3;i++) {
            average += grade[i];
        }

        average /= 3;

        System.out.println("Average Of Grades Are " + average + "\n");

    }
  
    double getAverage(){    return average; }

    void printInfo(){
    
        System.out.println();
        System.out.println("Id Is " + id);
        System.out.println("Name Is " + name);
        System.out.println("Grades Are : ");

        for (int i = 0; i < grade.length; i++) {
            System.out.println("Subject " + (i+1) + " : " + grade[i] );           
        }
    
        calculateAverage();

    }


}


class Program3{

    public static void main( String[] args){
        
        Scanner input = new Scanner(System.in);

        int totalStudents = 0;

        System.out.print("\n\nEnter Total Number Of Student : ");

        totalStudents = input.nextInt();

        StudentGradeManagement student[] = new StudentGradeManagement[totalStudents];

        int id;
        String name;
        int grade[] = new int[3];

        for (int i = 0; i < totalStudents; i++) {
            
            System.out.println("\nStudent " + (i+1) + "\n");
            
            System.out.print("Enter ID : ");
            id = input.nextInt();

            System.out.print("\nEnter Name : ");
            name = input.next();

            System.out.println("\nEnter Grades : \n");

            for(int j=0;j<3;j++){
                System.out.print("\nEnter Grade Of Subject " + (j+1) + " : ");
                grade[j] = input.nextInt();
            }

            student[i] = new StudentGradeManagement(id,name,grade);
            
        }
    
        System.out.println("\n");

        char choice;

        for (int i = 0; i < totalStudents; i++) {
            
            System.out.println("\nStudent " + (i+1) + "\n");
            
            System.out.print("\n\nDo You Wanna Update Details\nY for Yes\nEnter Choice : ");
            choice = input.next().charAt(0);

            if( choice == 'Y' || choice == 'y' ){
                student[i].updateStudent();
            }

        }

        System.out.println("\n");

        int max = 0;

        for (int i = 0; i < totalStudents; i++) {

            System.out.println("\nStudent " + (i+1) + "\n");
            
            student[i].printInfo();
            
            if( max < student[i].getAverage() ){
                max = i;
            }

        }

        System.out.println("\n");
        
        
        System.out.println("Student With Highest Grades Is ");
        System.out.println("\nStudent " + (max+1) + '\n');
        student[max].printInfo();

        

    }

}


/*

-----------------------------------------

Output :


-----------------------------------------


Enter Total Number Of Student : 2

Student 1

Enter ID : 1

Enter Name : KRISH

Enter Grades :


Enter Grade Of Subject 1 : 3

Enter Grade Of Subject 2 : 4

Enter Grade Of Subject 3 : 3

Student 2

Enter ID : 2

Enter Name : RAHUL

Enter Grades :


Enter Grade Of Subject 1 : 5

Enter Grade Of Subject 2 : 5

Enter Grade Of Subject 3 : 5



Student 1



Do You Wanna Update Details
Y for Yes
Enter Choice : N

Student 2



Do You Wanna Update Details
Y for Yes
Enter Choice : N



Student 1


Id Is 1
Name Is KRISH
Grades Are :
Subject 1 : 3
Subject 2 : 4
Subject 3 : 3
Average Of Grades Are 3.3333333333333335


Student 2


Id Is 2
Name Is RAHUL
Grades Are :
Subject 1 : 5
Subject 2 : 5
Subject 3 : 5
Average Of Grades Are 5.0



Student With Highest Grades Is

Student 2


Id Is 2
Name Is RAHUL
Grades Are :
Subject 1 : 5
Subject 2 : 5
Subject 3 : 5
Average Of Grades Are 5

*****************************


Enter Total Number Of Student : 1

Student 1

Enter ID : 1 

Enter Name : KRISH

Enter Grades :


Enter Grade Of Subject 1 : 4

Enter Grade Of Subject 2 : 3

Enter Grade Of Subject 3 : 5



Student 1



Do You Wanna Update Details
Y for Yes
Enter Choice : n



Student 1


Id Is 1
Name Is KRISH
Grades Are :
Subject 1 : 4
Subject 2 : 3
Subject 3 : 5
Average Of Grades Are 4.0



Student With Highest Grades Is

Student 1


Id Is 1
Name Is KRISH
Grades Are : 
Subject 1 : 4
Subject 2 : 3
Subject 3 : 5
Average Of Grades Are 4.0


--------------------------------------------

*/