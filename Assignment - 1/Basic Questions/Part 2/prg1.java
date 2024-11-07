/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 2: Classes and Methods

Program - 1 Create a Person class with the 
following properties: name, age, and gender. 
Implement methods to set and get these properties.

------------------------------------------------------------------

*/

class Person{
    
    private String name;
    private int age;
    private char gender;

    Person(){}

    Person( String name, int age, char gender ){
        setName( name );
        setAge( age );
        setGender( gender );
    }

    void showDetails(){
        System.out.println("Name Is " + name );
        System.out.println("Age Is " + age );
        System.out.println("Gender Is " + (gender == 'M'  ? "Male" : "Female" ) );
    }

    String getName(){   return name;       }
    int getAge(){   return age;            }
    char getGender(){   return gender;     }

    void setName( String n ){   name = n;   }
    void setAge( int a ){   age = a;        }
    void setGender( char g ){   gender = g; }

}

class Program1{
    
    public static void main( String[] args ){

        Person person = new Person( "KRISH",19,'M' );

        System.out.println("\n\nDetails \n");

        person.showDetails();

        System.out.println("\n\n");

    }


}

/*

-----------------------------------------

Output :

-----------------------------------------



Details

Name Is KRISH
Age Is 19
Gender Is Male


********************



Details

Name Is RASHI
Age Is 17
Gender Is Female



--------------------------------------------

*/