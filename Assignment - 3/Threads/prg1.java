/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 1 : Create three threads with different sleep-times 
from the main thread with following capabilities. 

∙ One thread generates prime numbers in an infinite loop. 
Supply the sleep time of main  thread and the sleep 
time of prime thread from the command line. 

∙ Two more threads T1 and T2 doing any other work also 
execute simultaneously with  suitable display information.  

∙ When prime thread prints 13, after that T1 goes into wait mode. 
T1 resumes back when  prime thread prints 79.  

∙ Threads T1 and T2 should stop executing when the keys ‘1’ and ‘2’ 
are pressed  respectively. Prime thread should stop after the ‘ENTER’ 
key is pressed. Exit of each  thread must be displayed on the console. 


------------------------------------------------------------------

*/

import java.util.Scanner;

class PrimeThread extends Thread {
    private int sleepTime;
    private boolean running = true;

    public PrimeThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        int num = 2;
        while (running) {
            if (isPrime(num)) {
                System.out.println("Prime: " + num);
                if (num == 13) synchronized (T1.lock) {
                    T1.waiting = true;
                }
                if (num == 79) synchronized (T1.lock) {
                    T1.lock.notify();
                }
            }
            num++;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Prime thread exited.");
    }

    public void stopRunning() {
        running = false;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class T1 extends Thread {
    public static final Object lock = new Object();
    public static boolean waiting = false;
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            if (waiting) {
                synchronized (lock) {
                    try {
                        System.out.println("T1 is waiting...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
            System.out.println("T1 is working...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("T1 exited.");
    }

    public void stopRunning() {
        running = false;
    }
}

class T2 extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("T2 is working...");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("T2 exited.");
    }

    public void stopRunning() {
        running = false;
    }
}

class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main thread sleep time (ms): ");
        int mainSleep = scanner.nextInt();
        System.out.print("Enter prime thread sleep time (ms): ");
        int primeSleep = scanner.nextInt();

        PrimeThread primeThread = new PrimeThread(primeSleep);
        T1 t1 = new T1();
        T2 t2 = new T2();

        primeThread.start();
        t1.start();
        t2.start();

        while (true) {
            System.out.println("Press 1 to stop T1, 2 to stop T2, Enter to stop Prime:");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    t1.stopRunning();
                    break;
                case "2":
                    t2.stopRunning();
                    break;
                case "":
                    primeThread.stopRunning();
                    break;
                default:
                    System.out.println("Invalid input");
            }
            if (!t1.isAlive() && !t2.isAlive() && !primeThread.isAlive()) break;
        }

        System.out.println("Main thread exiting...");
    }
}

/*

-----------------------------------------

Output :

-----------------------------------------

Enter main thread sleep time (ms): 1000
Enter prime thread sleep time (ms): 1000
Press 1 to stop T1, 2 to stop T2, Enter to stop Prime:
T1 is working...
T2 is working...
Press 1 to stop T1, 2 to stop T2, Enter to stop Prime:
Prime: 2
T1 is working...
Prime thread exited.
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T2 is working...
T1 is working...
T1 is working...

--------------------------------------------

*/