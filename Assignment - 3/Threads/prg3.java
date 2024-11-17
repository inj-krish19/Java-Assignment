/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 3 : Implement three classes: Storage, Counter, and Printer.  

∙ The Storage class should store an integer.  

∙ The Counter class should create a thread that starts counting 
from 0 (0, 1, 2, 3 ...) and  stores each value in the Storage class.  

∙ The Printer class should create a thread that keeps 
reading the value in the Storage class  and printing it. 

∙ Write a program that creates an instance of the Storage class 
and sets up a Counter and  a Printer object to operate on it. 
Ensure that each number is printed exactly once, by  adding suitable synchronization. 

------------------------------------------------------------------

*/

class Storage {
    private int value;
    private boolean available = false;

    public synchronized void setValue(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        available = true;
        notify();
    }

    public synchronized int getValue() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        notify();
        return value;
    }
}

class Counter extends Thread {
    private final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 50) { // Arbitrary limit to avoid infinite loop
            storage.setValue(count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Printer extends Thread {
    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) { // Match the Counter's loop limit
            System.out.println("Printed value: " + storage.getValue());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Program3{

    public static void main( String[] args ){
    
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Printed value: 0
Printed value: 1
Printed value: 2
Printed value: 3
Printed value: 4
Printed value: 5
Printed value: 6
Printed value: 7
Printed value: 8
Printed value: 9
Printed value: 10
Printed value: 11
Printed value: 12
Printed value: 13
Printed value: 14
Printed value: 15
Printed value: 16
Printed value: 17
Printed value: 18
Printed value: 19
Printed value: 20
Printed value: 21
Printed value: 22
Printed value: 23
Printed value: 24
Printed value: 25
Printed value: 26
Printed value: 27
Printed value: 28
Printed value: 29
Printed value: 30
Printed value: 31
Printed value: 32
Printed value: 33
Printed value: 34
Printed value: 35
Printed value: 36
Printed value: 37
Printed value: 38
Printed value: 39
Printed value: 40
Printed value: 41
Printed value: 42
Printed value: 43
Printed value: 44
Printed value: 45
Printed value: 46
Printed value: 47
Printed value: 48
Printed value: 49

--------------------------------------------

*/