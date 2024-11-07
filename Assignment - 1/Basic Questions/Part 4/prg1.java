/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 4: Putting It All Together

Program - 1 Create a Student class with the following properties: 
name, grade, and age. 

Implement the following methods:

setName(String name): Sets the student's name.
getGrade(): Returns the student's grade.
incrementAge(): Increments the student's age by 1.
printStudentInfo(): Prints the student's name, grade, and age.

In the main method, create an array of Student objects and 
perform the following tasks:

Prompt the user to enter the number of students.
Create the Student objects and populate their information.
Use a for loop to iterate through the array and call the 
printStudentInfo() method for each student.

Find the student with the highest grade and print their information.

Note: Remember to include appropriate comments and 
documentation throughout your code to 
make it more readable and maintainable.


------------------------------------------------------------------

*/

import java.util.Scanner;

class Student{

    private String name;
    private char grade;
    private int age;

    // Student(){}

    Student( String n,int a,char g ){
        setName(n);
        grade = g;
        age = a;
    }

    void setName( String n ){   name = n;   }
    char getGrade( ){   return grade;    }
    String getName( ){   return name;   }
    void incrementAge(){    age++;          }

    void printStudentInfo(){

        System.out.println( "Name Is " + name );
        System.out.println( "Grade Is " + grade );
        System.out.println( "Age Is " + age );

        System.out.println();

    }

}

class Program1{
    
    public static void main( String[] args ){
        
        Scanner input = new Scanner( System.in );

        System.out.println("\n\n");

        System.out.print("\nEnter Total Number Of Students : ");
        int totalStudents = input.nextInt();

        String name;
        int age;
        char grade;

        Student[] student = new Student[totalStudents];

        for(int i=1;i<=totalStudents;i++){

            System.out.println( "\n\nStudent " + i + "\n" );

            System.out.print("Enter Name : ");
            name = input.next();
            System.out.print("\nEnter Age : ");
            age = input.nextInt();
            System.out.print("\nEnter Grade : ");
            grade = input.next().charAt(0);
            System.out.println("\n\n");

            student[i-1] = new Student( name,age,grade );

        }

        for(int i=1;i<=totalStudents;i++){

            System.out.println( "Student " + i + "\n" );

            System.out.print( "Do You Wanna Increment Age Of " + student[i-1].getName() + " Y for Yes : ");
            grade = input.next().charAt(0);

            if( grade == 'Y' || grade == 'y' ){
                student[i-1].incrementAge();
            }

            student[i-1].printStudentInfo();

        }

        System.out.println("\n\nStudents With Highest Grades Are : \n\n");

        int x = 1;

        for(int i=1;i<=totalStudents;i++){

            
            if( student[i-1].getGrade() == 'A' || student[i-1].getGrade() == 'A' ){
                System.out.println( "Student " + x + "\n" );
                student[i-1].printStudentInfo();
                x++;
            }


        }

        System.out.println("\n\n");

    }


}

/*

-----------------------------------------

Output :

-----------------------------------------






Enter Total Number Of Students : 2


Student 1

Enter Name : KRISH

Enter Age : 18

Enter Grade : A





Student 2

Enter Name : VISHAL

Enter Age : 19

Enter Grade : B



Student 1

Do You Wanna Increment Age Of KRISH Y for Yes : Y
Name Is KRISH
Grade Is A
Age Is 19

Student 2

Do You Wanna Increment Age Of VISHAL Y for Yes : N
Name Is VISHAL
Grade Is B
Age Is 19



Students With Highest Grades Are :


Student 1

Name Is KRISH
Grade Is A
Age Is 19




*****************************************





Enter Total Number Of Students : 3


Student 1

Enter Name : KRISH

Enter Age : 18

Enter Grade : C





Student 2

Enter Name : VISHAL

Enter Age : 17

Enter Grade : B





Student 3

Enter Name : DEV

Enter Age : 25

Enter Grade : A



Student 1

Do You Wanna Increment Age Of KRISH Y for Yes : N
Name Is KRISH
Grade Is C
Age Is 18

Student 2

Do You Wanna Increment Age Of VISHAL Y for Yes : Y
Name Is VISHAL
Grade Is B
Age Is 18

Student 3

Do You Wanna Increment Age Of DEV Y for Yes : Y
Name Is DEV
Grade Is A
Age Is 26



Students With Highest Grades Are :


Student 1

Name Is DEV
Grade Is A
Age Is 26



--------------------------------------------

*/