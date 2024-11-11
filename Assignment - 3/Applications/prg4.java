/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 4 :  Write a program which will read text and count all 
occurrence of a particular word and also  reverse that word. 

------------------------------------------------------------------

*/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Program4{

    public static void main( String[] args ){
    
        int occurences = 0;
        
        String line,word,reverse;
        StringTokenizer tokens;
        Scanner input = new Scanner( System.in );
        List<String> parts = new ArrayList<>();
        line = word = reverse = "";
        
        System.out.print("\nEnter Text : ");
        line = input.nextLine();

        System.out.print("\nEnter Word To Find Occurences : ");
        word = input.next();

        tokens = new StringTokenizer(line);

        while( tokens.hasMoreTokens() ){
            String token = tokens.nextToken().toString();
            if( token.equals(word) ){
                occurences ++;
                token = new StringBuilder( token ).reverse().toString();
            }
            parts.add(token);
        }

        for (int i=0; i < parts.size(); i++) {
            reverse += parts.get(i) + " ";
        }

        System.out.print("\n" + word + " Word Found In Text " + occurences + " Times.\n");
        System.out.print("\nText After Reversing " + word + " Is : " + reverse + "\n\n" );
        


    }

}

/*

-----------------------------------------

Output :

-----------------------------------------


Enter Text : The Sun Rises in East. But Every Sun doesn't rise in east. Even all the Sun doesn't rise. Also its important to be careful to your son like as Sun protects you

Enter Word To Find Occurences : Sun

Sun Word Found In Text 4 Times.

Text After Reversing Sun Is : The nuS Rises in East. But Every nuS doesn't rise in east. Even all the nuS doesn't rise. Also its important to be careful to your son like as nuS protects you

--------------------------------------------

*/