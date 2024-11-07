/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Case Study Based Questions

Program - 9 :  Password Validator

Create a program that validates the strength of a user's password. 
The program should have the following features:

 Prompt the user to enter a password.
 
 Implement a set of rules to check the password's strength, 
 such as minimum length, inclusion of uppercase and 
 lowercase letters, digits, and special characters.
 
 Provide feedback to the user on the password's strength 
 (e.g., weak, medium, strong).
 
 Allow the user to try again if the password is not strong enough.

------------------------------------------------------------------

*/

import java.util.Scanner;

class PasswordValidator{
    
    private String password;

    PasswordValidator(){}

    void getPassword(){

        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter Password : ");
        password = input.next();

    }

    void validate(){

        boolean[] checks = new boolean[5];
        int score = 0;
        
        if( password.length() < 8 ){
            System.out.println("\nPassword Should Have At least 8 Characters \n");
            getPassword();
            validate();
            return;
        }else{
        
            checks[0] = true;

            for( int i=0;i<password.length();i++){

                if( password.charAt(i) >= 'a' && password.charAt(i) <= 'z' ){
                    checks[1] = true;
                }

                if( password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ){
                    checks[2] = true;
                }

                if( password.charAt(i) >= '0' && password.charAt(i) <= '9' ){
                    checks[3] = true;
                }

                if( (password.charAt(i) >= '!' && password.charAt(i) <= '/') || (password.charAt(i) >= ':' && password.charAt(i) <= '@') ){
                    checks[4] = true;
                }

            }

        }

        for(int i=0;i<5;i++){
            if( checks[i] == true ){
                score ++;
            }
        }

        Scanner input = new Scanner(System.in);
        char choice;

        if( score < 3 ){
            System.out.println( "\n\nYour Password Is Weak \n");

            System.out.print("Do You Want To Change Your Password (Y for Yes) : ");
            choice = input.next().charAt(0);

            if( choice == 'y' || choice == 'Y' ){
                getPassword();
                validate();
            }


        }else if( score < 5 ){
            System.out.println( "\n\nYour Password Strength Is Medium \n");
            
            System.out.print("Do You Want To Change Your Password (Y for Yes) : ");
            choice = input.next().charAt(0);

            if( choice == 'y' || choice == 'Y' ){
                getPassword();
                validate();
            }


        }else{
            System.out.println( "\n\nYour Password Is Strong \n");
        }

    }

}


class Program9{

    public static void main( String[] args ){

        PasswordValidator p = new PasswordValidator();

        p.getPassword();
        p.validate();

    }

}


/*

-----------------------------------------

Output :

-----------------------------------------



Enter Password : dhfjh

Password Should Have At least 8 Characters



Enter Password : dfkghkdgdlkg


Your Password Is Weak

Do You Want To Change Your Password (Y for Yes) : y


Enter Password : kjvfdlkg478


Your Password Strength Is Medium

Do You Want To Change Your Password (Y for Yes) : y


Enter Password : fjdgk;ld;lg98743598A


Your Password Is Strong


********************************



Enter Password : kdfgjdlgfd


Your Password Is Weak

Do You Want To Change Your Password (Y for Yes) : y


Enter Password : fhgdlkJHKJASDH8347


Your Password Strength Is Medium

Do You Want To Change Your Password (Y for Yes) : n

--------------------------------------------

*/