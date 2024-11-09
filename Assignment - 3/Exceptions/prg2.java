/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 : A method named average() has one argument that is 
an array of strings. It converts these  to double values and returns their average. 

The method generates a NullPointerException  if a array elements is null or 
NumberFormatException if an element is incorrectly  formatted. 

Write a program that illustrates how to declare and use this method. 
Include  throws clause in the method declaration to indicate that these problems can occur. 

------------------------------------------------------------------

*/

class Program2{

    public static double average( String[] numbers ){

        try{

            double average = 0.0;

            for ( String number : numbers) {
                average += Double.parseDouble(number);
            }

            average /= numbers.length;

            return average;

        }catch( NullPointerException ne ){
            System.out.println("\nArray Is Null. \n");
            System.exit(0);
            return -1;
        }catch( NumberFormatException nf ){
            System.out.println("\nElements Has Some Other Values Than Numbers. \n");
            System.exit(0);
            return -1;
        }
    }

    public static void main( String[] args ){

        String numbers[] = new String[5];
        numbers[0] = "01";
        numbers[1] = "05";
        numbers[2] = "12";
        numbers[3] = "25";
        numbers[4] = "47";

        double avg = Program2.average( numbers );

        System.out.println("\nAverage Of Array Is " + avg + "\n" );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Average Of Array Is 18.0


*************************************

Array Is Null.

*************************************

Elements Has Some Other Values Than Numbers.

*************************************

--------------------------------------------

*/