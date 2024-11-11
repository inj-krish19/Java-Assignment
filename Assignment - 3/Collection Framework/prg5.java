/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 5 : Write a generic class Stack<T> that can be used to represent stacks of objects of type T. 
The class  should include methods push(), pop(), and isEmpty(). 
Inside the class, use an ArrayList to hold the  items on the stack.  

------------------------------------------------------------------

*/

import java.util.ArrayList;

class Stack<T>{

    private int top = -1;
    private ArrayList<T> stack;

    Stack(){
        stack = new ArrayList<>(10);
    }

    public void push( T value){
        stack.add(value);
        top ++;
    }

    public T pop(){
        T value = stack.get(top--);
        stack.remove(top+1);
        return value;
    }

    public boolean isEmpty(){
        return ( stack == null || stack.size() == 0 ) ? true : false;
    }

    public void display(){
        for (int i= 0;i <= top;i++){
            System.out.print( stack.get(i) + " " );
        }
        System.out.println("\n");
    }

}

class Program5{

    public static void main( String[] args ){
    
        Stack<String> stack = new Stack<String>();

        System.out.println( stack.isEmpty() ? "Stack Is Empty\n" : "Stack Has Elements\n" );

        stack.push("Hello");
        stack.push("World");
        stack.push("Bro");

        stack.display();

        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println( stack.isEmpty() ? "Stack Is Empty\n" : "Stack Has Elements\n" );

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Stack Is Empty

Hello World Bro

Hello World



Stack Is Empty

--------------------------------------------

*/