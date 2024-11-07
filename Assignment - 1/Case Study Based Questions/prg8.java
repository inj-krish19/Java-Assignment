/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 8 : Coin Toss Simulator

Develop a program that simulates a coin toss. 
The program should have the following features:

 Allow the user to choose the number of coin tosses to perform.
 Randomly generate the outcome of each coin toss (heads or tails).
 Keep track of the number of heads and tails.
 Display the results, including the number of heads and tails, 
 as well as the percentage of each outcome.

------------------------------------------------------------------

*/

import java.util.Scanner;

class CoinTossSimulator{

    private int heads;
    private int tails;
    private int outcomes;
    private int coins;
    private int flips;
    private int totalOutcomes;
    private double posibilityHead;
    private double posibilityTail;

    CoinTossSimulator(){    coins = 1;outcomes = 2;    }

    CoinTossSimulator( int c,int f ){ 
        outcomes = 2;
        coins = c;    
        flips = f;
    }

    void tossCoins(){

        System.out.println("\n");

        totalOutcomes = (int) ( Math.pow(2,(coins * flips) ) );

        int result = -1;

        for( int i=0;i<totalOutcomes;i++){

            result = (int) Math.round( Math.random() * ( outcomes - 1 ) );
             
            System.out.print("\nCoin : " + ( (i / ( flips * flips * outcomes ) / ( 2 * coins  ) ) + 1) + " \tFlip : " + (i % 2 + 1) + " \t");

            if( result == 0 ){
                System.out.println("Pass " + ((i+1) + " : Head"));
                heads ++;
            }

            if( result == 1 ){
                System.out.println("Pass " + ((i+1) + " : Tail"));
                tails ++;
            }

        }

        System.out.println("\n");

    }

    void givePercentage(){

        System.out.println("\n");
        System.out.println("\nFor " + coins + " Coins and " + flips + " Flips \n");

        posibilityHead = Math.round( ( heads / (double) totalOutcomes ) * 100 );
        posibilityTail = Math.round( ( tails / (double) totalOutcomes ) * 100 );

        System.out.println("Heads : " + heads + " / " + totalOutcomes + " => Posibility Of Head : " + posibilityHead );
        System.out.println("Tails : " + tails + " / " + totalOutcomes + " => Posibility Of Tail : " + posibilityTail );

        System.out.println("\n\n");


    }


}


class Program8{

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        int coin,flip;
   
        System.out.print("\n\nEnter Coint Count: ");

        coin = input.nextInt();

        System.out.print("\n\nEnter Flip Count: ");

        flip = input.nextInt();

        CoinTossSimulator c = new CoinTossSimulator(coin,flip);

        c.tossCoins();
        c.givePercentage();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------



Enter Coint Count: 1


Enter Flip Count: 2



Coin : 1        Flip : 1        Pass 1 : Tail

Coin : 1        Flip : 2        Pass 2 : Tail

Coin : 1        Flip : 1        Pass 3 : Head

Coin : 1        Flip : 2        Pass 4 : Tail





For 1 Coins and 2 Flips

Heads : 1 / 4 => Posibility Of Head : 25.0
Tails : 3 / 4 => Posibility Of Tail : 75.0



********************************

Enter Coint Count: 4


Enter Flip Count: 2



Coin : 1        Flip : 1        Pass 1 : Head

Coin : 1        Flip : 2        Pass 2 : Tail

Coin : 1        Flip : 1        Pass 3 : Head

Coin : 1        Flip : 2        Pass 4 : Head

Coin : 1        Flip : 1        Pass 5 : Head

Coin : 1        Flip : 2        Pass 6 : Head

Coin : 1        Flip : 1        Pass 7 : Head

Coin : 1        Flip : 2        Pass 8 : Tail

Coin : 1        Flip : 1        Pass 9 : Tail

Coin : 1        Flip : 2        Pass 10 : Tail

Coin : 1        Flip : 1        Pass 11 : Tail

Coin : 1        Flip : 2        Pass 12 : Tail

Coin : 1        Flip : 1        Pass 13 : Tail

Coin : 1        Flip : 2        Pass 14 : Head

Coin : 1        Flip : 1        Pass 15 : Tail

Coin : 1        Flip : 2        Pass 16 : Tail

Coin : 1        Flip : 1        Pass 17 : Tail

Coin : 1        Flip : 2        Pass 18 : Tail

Coin : 1        Flip : 1        Pass 19 : Head

Coin : 1        Flip : 2        Pass 20 : Tail

Coin : 1        Flip : 1        Pass 21 : Head

Coin : 1        Flip : 2        Pass 22 : Tail

Coin : 1        Flip : 1        Pass 23 : Head

Coin : 1        Flip : 2        Pass 24 : Tail

Coin : 1        Flip : 1        Pass 25 : Head

Coin : 1        Flip : 2        Pass 26 : Head

Coin : 1        Flip : 1        Pass 27 : Tail

Coin : 1        Flip : 2        Pass 28 : Tail

Coin : 1        Flip : 1        Pass 29 : Tail

Coin : 1        Flip : 2        Pass 30 : Tail

Coin : 1        Flip : 1        Pass 31 : Tail

Coin : 1        Flip : 2        Pass 32 : Head

Coin : 1        Flip : 1        Pass 33 : Tail

Coin : 1        Flip : 2        Pass 34 : Tail

Coin : 1        Flip : 1        Pass 35 : Head

Coin : 1        Flip : 2        Pass 36 : Tail

Coin : 1        Flip : 1        Pass 37 : Head

Coin : 1        Flip : 2        Pass 38 : Tail

Coin : 1        Flip : 1        Pass 39 : Tail

Coin : 1        Flip : 2        Pass 40 : Tail

Coin : 1        Flip : 1        Pass 41 : Head

Coin : 1        Flip : 2        Pass 42 : Tail

Coin : 1        Flip : 1        Pass 43 : Tail

Coin : 1        Flip : 2        Pass 44 : Tail

Coin : 1        Flip : 1        Pass 45 : Head

Coin : 1        Flip : 2        Pass 46 : Head

Coin : 1        Flip : 1        Pass 47 : Head

Coin : 1        Flip : 2        Pass 48 : Head

Coin : 1        Flip : 1        Pass 49 : Tail

Coin : 1        Flip : 2        Pass 50 : Tail

Coin : 1        Flip : 1        Pass 51 : Tail

Coin : 1        Flip : 2        Pass 52 : Tail

Coin : 1        Flip : 1        Pass 53 : Tail

Coin : 1        Flip : 2        Pass 54 : Tail

Coin : 1        Flip : 1        Pass 55 : Head

Coin : 1        Flip : 2        Pass 56 : Head

Coin : 1        Flip : 1        Pass 57 : Tail

Coin : 1        Flip : 2        Pass 58 : Tail

Coin : 1        Flip : 1        Pass 59 : Head

Coin : 1        Flip : 2        Pass 60 : Tail

Coin : 1        Flip : 1        Pass 61 : Tail

Coin : 1        Flip : 2        Pass 62 : Head

Coin : 1        Flip : 1        Pass 63 : Head

Coin : 1        Flip : 2        Pass 64 : Tail

Coin : 2        Flip : 1        Pass 65 : Tail

Coin : 2        Flip : 2        Pass 66 : Head

Coin : 2        Flip : 1        Pass 67 : Head

Coin : 2        Flip : 2        Pass 68 : Head

Coin : 2        Flip : 1        Pass 69 : Head

Coin : 2        Flip : 2        Pass 70 : Tail

Coin : 2        Flip : 1        Pass 71 : Tail

Coin : 2        Flip : 2        Pass 72 : Tail

Coin : 2        Flip : 1        Pass 73 : Tail

Coin : 2        Flip : 2        Pass 74 : Tail

Coin : 2        Flip : 1        Pass 75 : Tail

Coin : 2        Flip : 2        Pass 76 : Tail

Coin : 2        Flip : 1        Pass 77 : Tail

Coin : 2        Flip : 2        Pass 78 : Tail

Coin : 2        Flip : 1        Pass 79 : Tail

Coin : 2        Flip : 2        Pass 80 : Head

Coin : 2        Flip : 1        Pass 81 : Head

Coin : 2        Flip : 2        Pass 82 : Tail

Coin : 2        Flip : 1        Pass 83 : Tail

Coin : 2        Flip : 2        Pass 84 : Tail

Coin : 2        Flip : 1        Pass 85 : Tail

Coin : 2        Flip : 2        Pass 86 : Tail

Coin : 2        Flip : 1        Pass 87 : Tail

Coin : 2        Flip : 2        Pass 88 : Tail

Coin : 2        Flip : 1        Pass 89 : Tail

Coin : 2        Flip : 2        Pass 90 : Tail

Coin : 2        Flip : 1        Pass 91 : Tail

Coin : 2        Flip : 2        Pass 92 : Head

Coin : 2        Flip : 1        Pass 93 : Head

Coin : 2        Flip : 2        Pass 94 : Tail

Coin : 2        Flip : 1        Pass 95 : Tail

Coin : 2        Flip : 2        Pass 96 : Head

Coin : 2        Flip : 1        Pass 97 : Head

Coin : 2        Flip : 2        Pass 98 : Tail

Coin : 2        Flip : 1        Pass 99 : Tail

Coin : 2        Flip : 2        Pass 100 : Head

Coin : 2        Flip : 1        Pass 101 : Head

Coin : 2        Flip : 2        Pass 102 : Head

Coin : 2        Flip : 1        Pass 103 : Head

Coin : 2        Flip : 2        Pass 104 : Head

Coin : 2        Flip : 1        Pass 105 : Head

Coin : 2        Flip : 2        Pass 106 : Tail

Coin : 2        Flip : 1        Pass 107 : Tail

Coin : 2        Flip : 2        Pass 108 : Tail

Coin : 2        Flip : 1        Pass 109 : Head

Coin : 2        Flip : 2        Pass 110 : Tail

Coin : 2        Flip : 1        Pass 111 : Head

Coin : 2        Flip : 2        Pass 112 : Head

Coin : 2        Flip : 1        Pass 113 : Head

Coin : 2        Flip : 2        Pass 114 : Tail

Coin : 2        Flip : 1        Pass 115 : Tail

Coin : 2        Flip : 2        Pass 116 : Tail

Coin : 2        Flip : 1        Pass 117 : Head

Coin : 2        Flip : 2        Pass 118 : Tail

Coin : 2        Flip : 1        Pass 119 : Head

Coin : 2        Flip : 2        Pass 120 : Tail

Coin : 2        Flip : 1        Pass 121 : Tail

Coin : 2        Flip : 2        Pass 122 : Head

Coin : 2        Flip : 1        Pass 123 : Head

Coin : 2        Flip : 2        Pass 124 : Tail

Coin : 2        Flip : 1        Pass 125 : Tail

Coin : 2        Flip : 2        Pass 126 : Tail

Coin : 2        Flip : 1        Pass 127 : Head

Coin : 2        Flip : 2        Pass 128 : Tail

Coin : 3        Flip : 1        Pass 129 : Head

Coin : 3        Flip : 2        Pass 130 : Tail

Coin : 3        Flip : 1        Pass 131 : Tail

Coin : 3        Flip : 2        Pass 132 : Tail

Coin : 3        Flip : 1        Pass 133 : Tail

Coin : 3        Flip : 2        Pass 134 : Head

Coin : 3        Flip : 1        Pass 135 : Head

Coin : 3        Flip : 2        Pass 136 : Head

Coin : 3        Flip : 1        Pass 137 : Head

Coin : 3        Flip : 2        Pass 138 : Tail

Coin : 3        Flip : 1        Pass 139 : Tail

Coin : 3        Flip : 2        Pass 140 : Head

Coin : 3        Flip : 1        Pass 141 : Head

Coin : 3        Flip : 2        Pass 142 : Head

Coin : 3        Flip : 1        Pass 143 : Tail

Coin : 3        Flip : 2        Pass 144 : Head

Coin : 3        Flip : 1        Pass 145 : Tail

Coin : 3        Flip : 2        Pass 146 : Head

Coin : 3        Flip : 1        Pass 147 : Tail

Coin : 3        Flip : 2        Pass 148 : Tail

Coin : 3        Flip : 1        Pass 149 : Head

Coin : 3        Flip : 2        Pass 150 : Head

Coin : 3        Flip : 1        Pass 151 : Head

Coin : 3        Flip : 2        Pass 152 : Tail

Coin : 3        Flip : 1        Pass 153 : Head

Coin : 3        Flip : 2        Pass 154 : Head

Coin : 3        Flip : 1        Pass 155 : Tail

Coin : 3        Flip : 2        Pass 156 : Tail

Coin : 3        Flip : 1        Pass 157 : Head

Coin : 3        Flip : 2        Pass 158 : Tail

Coin : 3        Flip : 1        Pass 159 : Tail

Coin : 3        Flip : 2        Pass 160 : Head

Coin : 3        Flip : 1        Pass 161 : Tail

Coin : 3        Flip : 2        Pass 162 : Tail

Coin : 3        Flip : 1        Pass 163 : Head

Coin : 3        Flip : 2        Pass 164 : Tail

Coin : 3        Flip : 1        Pass 165 : Tail

Coin : 3        Flip : 2        Pass 166 : Tail

Coin : 3        Flip : 1        Pass 167 : Head

Coin : 3        Flip : 2        Pass 168 : Head

Coin : 3        Flip : 1        Pass 169 : Tail

Coin : 3        Flip : 2        Pass 170 : Head

Coin : 3        Flip : 1        Pass 171 : Head

Coin : 3        Flip : 2        Pass 172 : Head

Coin : 3        Flip : 1        Pass 173 : Tail

Coin : 3        Flip : 2        Pass 174 : Tail

Coin : 3        Flip : 1        Pass 175 : Tail

Coin : 3        Flip : 2        Pass 176 : Head

Coin : 3        Flip : 1        Pass 177 : Tail

Coin : 3        Flip : 2        Pass 178 : Tail

Coin : 3        Flip : 1        Pass 179 : Head

Coin : 3        Flip : 2        Pass 180 : Head

Coin : 3        Flip : 1        Pass 181 : Head

Coin : 3        Flip : 2        Pass 182 : Tail

Coin : 3        Flip : 1        Pass 183 : Head

Coin : 3        Flip : 2        Pass 184 : Head

Coin : 3        Flip : 1        Pass 185 : Head

Coin : 3        Flip : 2        Pass 186 : Tail

Coin : 3        Flip : 1        Pass 187 : Head

Coin : 3        Flip : 2        Pass 188 : Tail

Coin : 3        Flip : 1        Pass 189 : Head

Coin : 3        Flip : 2        Pass 190 : Head

Coin : 3        Flip : 1        Pass 191 : Head

Coin : 3        Flip : 2        Pass 192 : Head

Coin : 4        Flip : 1        Pass 193 : Head

Coin : 4        Flip : 2        Pass 194 : Tail

Coin : 4        Flip : 1        Pass 195 : Head

Coin : 4        Flip : 2        Pass 196 : Head

Coin : 4        Flip : 1        Pass 197 : Tail

Coin : 4        Flip : 2        Pass 198 : Tail

Coin : 4        Flip : 1        Pass 199 : Head

Coin : 4        Flip : 2        Pass 200 : Head

Coin : 4        Flip : 1        Pass 201 : Tail

Coin : 4        Flip : 2        Pass 202 : Tail

Coin : 4        Flip : 1        Pass 203 : Head

Coin : 4        Flip : 2        Pass 204 : Tail

Coin : 4        Flip : 1        Pass 205 : Head

Coin : 4        Flip : 2        Pass 206 : Tail

Coin : 4        Flip : 1        Pass 207 : Head

Coin : 4        Flip : 2        Pass 208 : Head

Coin : 4        Flip : 1        Pass 209 : Head

Coin : 4        Flip : 2        Pass 210 : Head

Coin : 4        Flip : 1        Pass 211 : Head

Coin : 4        Flip : 2        Pass 212 : Tail

Coin : 4        Flip : 1        Pass 213 : Head

Coin : 4        Flip : 2        Pass 214 : Tail

Coin : 4        Flip : 1        Pass 215 : Head

Coin : 4        Flip : 2        Pass 216 : Head

Coin : 4        Flip : 1        Pass 217 : Head

Coin : 4        Flip : 2        Pass 218 : Tail

Coin : 4        Flip : 1        Pass 219 : Head

Coin : 4        Flip : 2        Pass 220 : Head

Coin : 4        Flip : 1        Pass 221 : Tail

Coin : 4        Flip : 2        Pass 222 : Tail

Coin : 4        Flip : 1        Pass 223 : Head

Coin : 4        Flip : 2        Pass 224 : Tail

Coin : 4        Flip : 1        Pass 225 : Tail

Coin : 4        Flip : 2        Pass 226 : Head

Coin : 4        Flip : 1        Pass 227 : Head

Coin : 4        Flip : 2        Pass 228 : Tail

Coin : 4        Flip : 1        Pass 229 : Tail

Coin : 4        Flip : 2        Pass 230 : Head

Coin : 4        Flip : 1        Pass 231 : Head

Coin : 4        Flip : 2        Pass 232 : Tail

Coin : 4        Flip : 1        Pass 233 : Tail

Coin : 4        Flip : 2        Pass 234 : Head

Coin : 4        Flip : 1        Pass 235 : Tail

Coin : 4        Flip : 2        Pass 236 : Head

Coin : 4        Flip : 1        Pass 237 : Head

Coin : 4        Flip : 2        Pass 238 : Tail

Coin : 4        Flip : 1        Pass 239 : Tail

Coin : 4        Flip : 2        Pass 240 : Tail

Coin : 4        Flip : 1        Pass 241 : Head

Coin : 4        Flip : 2        Pass 242 : Head

Coin : 4        Flip : 1        Pass 243 : Head

Coin : 4        Flip : 2        Pass 244 : Head

Coin : 4        Flip : 1        Pass 245 : Head

Coin : 4        Flip : 2        Pass 246 : Head

Coin : 4        Flip : 1        Pass 247 : Tail

Coin : 4        Flip : 2        Pass 248 : Head

Coin : 4        Flip : 1        Pass 249 : Head

Coin : 4        Flip : 2        Pass 250 : Head

Coin : 4        Flip : 1        Pass 251 : Tail

Coin : 4        Flip : 2        Pass 252 : Head

Coin : 4        Flip : 1        Pass 253 : Head

Coin : 4        Flip : 2        Pass 254 : Head

Coin : 4        Flip : 1        Pass 255 : Tail

Coin : 4        Flip : 2        Pass 256 : Head





For 4 Coins and 2 Flips

Heads : 124 / 256 => Posibility Of Head : 48.0
Tails : 132 / 256 => Posibility Of Tail : 52.0


--------------------------------------------

*/