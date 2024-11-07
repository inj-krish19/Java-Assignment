/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 1 : Currency Converter

Write a program that can convert between different currencies. 
The program should have the following features:

  Prompt the user to enter the amount they want to convert.
  
  Provide a list of available currencies (e.g., USD, EUR, JPY, GBP, INR) and 
  ask the user to select the source and target currencies.

  Implement the currency conversion logic using appropriate exchange rates.
  
  Display the converted amount to the user.


------------------------------------------------------------------

*/

import java.util.Scanner;

class CurrencyConverter{
    
    private String baseCurrency;
    private String resultCurrency;
    private double base;
    private double result;

    CurrencyConverter(){}

    void chooseBaseCurrency(){
        
        System.out.println("\n\n");
        
        System.out.println("Choose Your Currency From This ");
        System.out.println("USD, EUR, INR ");
        System.out.print("Enter Base Currency : ");
        
        Scanner input = new Scanner(System.in);
        baseCurrency = input.next();
        
        System.out.println("\n");

    }

    void chooseResultCurrency(){
        
        do{

            System.out.println("\nChoose Your Currency From This ");
            System.out.println("USD, EUR, INR ");
            System.out.print("Enter Result Currency : ");
            
            Scanner input = new Scanner(System.in);
            resultCurrency = input.next();

        }while( baseCurrency.equals(resultCurrency) );

        System.out.println("\n\n");

    }

    void getCurrency(){

        System.out.print("Enter Amount Of Base Currency In " + baseCurrency  + ": ");

        Scanner input = new Scanner(System.in);
        base = input.nextDouble();

        System.out.println("\n\n");

    }

    void calculateCurrency(){

        System.out.println("\n");

        if( baseCurrency.equals( "USD" ) ){
            
            if( resultCurrency.equals( "EUR" ) ){
                result = base * 1.09;
            }else if( resultCurrency.equals( "INR" ) ){
                result = base * 80;
            }else{
                System.out.println( "Invalid Currency. Can't Convert \n\n");
                return;
            }

        }else if( baseCurrency.equals( "EUR" ) ){
            
            if( resultCurrency.equals( "USD" ) ){
                result = base * 0.92;
            }else if( resultCurrency.equals( "INR" ) ){
                result = base * 91;
            }else{
                System.out.println( "Invalid Currency. Can't Convert \n\n");
                return;
            }
            
        }else if( baseCurrency.equals( "INR" ) ){
            
            if( resultCurrency.equals( "USD" ) ){
                result = base * 0.011;
            }else if( resultCurrency.equals( "EUR" ) ){
                result = base * 0.012;
            }else{
                System.out.println( "Invalid Currency. Can't Convert \n\n");
                return;
            }

        }else{
            System.out.println( "Invalid Currency. Can't Convert \n\n");
            return;
        }

        System.out.println("\nSo The " + base + " " + baseCurrency  + " In" + resultCurrency + " Became " + result + " " + resultCurrency + "\n");

    }

}


class Program1{

    public static void main( String[] args ){

        CurrencyConverter c = new CurrencyConverter();
        
        c.chooseBaseCurrency();
        c.chooseResultCurrency();
        c.getCurrency();
        c.calculateCurrency();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------



Choose Your Currency From This
USD, EUR, INR
Enter Base Currency : USD



Choose Your Currency From This
USD, EUR, INR
Enter Result Currency : USD

Choose Your Currency From This
USD, EUR, INR
Enter Result Currency : USD

Choose Your Currency From This
USD, EUR, INR
Enter Result Currency : INR



Enter Amount Of Base Currency In USD: 10






So The 10.0 USD InINR Became 800.0 INR


********************************




Choose Your Currency From This
USD, EUR, INR
Enter Base Currency : INR



Choose Your Currency From This
USD, EUR, INR
Enter Result Currency : USD



Enter Amount Of Base Currency In INR: 100






So The 100.0 INR InUSD Became 1.0999999999999999 USD




--------------------------------------------

*/