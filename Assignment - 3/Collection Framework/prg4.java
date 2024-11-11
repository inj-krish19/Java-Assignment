/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 4 : Write a program to store a deck of 52 cards in a linked list
in random sequence using a Random class  object. You can represent a 
card as a two-character string—”1C” for the ace of clubs, “JD” for the  
jack of diamonds, and so on. Output the cards from the linked list as four hands of 13 cards. 

------------------------------------------------------------------

*/

import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

class Program4{

    public static void main( String[] args ){
    
        String card = "";
        Random rand = new Random();
        LinkedList<String> cards = new LinkedList<>();
        LinkedList<LinkedList<String>> players = new LinkedList<>();
        
        for (int i=1;i<=4;i++) {
            for (int j=0;j<13;j++) {
                card = "";
                
                if( j == 0 ){   card += "A"; }
                else if( j == 10 ){   card += "J"; }
                else if( j == 11 ){   card += "Q"; }
                else if( j == 12 ){   card += "K"; }
                else{   card += String.valueOf(j);  }
                
                if( i == 1 ){   card += "S"; }
                if( i == 2 ){   card += "H"; }
                if( i == 3 ){   card += "C"; }
                if( i == 4 ){   card += "D"; }
                
                cards.add( card );
                
            }
            players.add( new LinkedList<>() );
        }
        System.out.println("\nCards Shuffled ...\n");

        System.out.println("S : Spade\t\tH : Heart\t\tC : Club\t\tD : Diamond");
        System.out.println("A : Ace\t\t\tJ : Jack\t\tQ : Queen\t\tK : King");
        
        int turn = 0;
        
        System.out.println("\n\n\t\tPlayer 1\tPlayer 2\tPlayer 3\tPlayer 4\n");

        while( cards.size() != 0 ){
            
            System.out.print("Turn " + (turn+1) + " : \t");

            for (int i=0;i<4;i++) {
                int value = rand.nextInt( cards.size() );
                players.get(i).add( cards.get( value ) );
                System.out.print(cards.get(value) + "\t\t");
                cards.remove( value );
            }
            turn ++;            
            System.out.println("");

        }

        System.out.println("\n");

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Cards Shuffled ...

S : Spade               H : Heart               C : Club                D : Diamond
A : Ace                 J : Jack                Q : Queen               K : King


                Player 1        Player 2        Player 3        Player 4

Turn 1 :        6D              JD              QH              5H
Turn 2 :        2S              6C              8D              8H
Turn 3 :        1D              3H              KH              1C
Turn 4 :        6H              9H              KC              7H
Turn 5 :        AS              JS              KD              8C
Turn 6 :        3D              QD              9D              5C
Turn 7 :        JH              9C              9S              5S
Turn 8 :        AC              5D              2H              1S
Turn 9 :        2C              JC              4C              2D
Turn 10 :       8S              3S              4H              1H
Turn 11 :       7C              QS              KS              AD
Turn 12 :       7S              4S              4D              7D
Turn 13 :       QC              6S              3C              AH


--------------------------------------------

*/