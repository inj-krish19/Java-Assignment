/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 2 : Write a program for restaurant. Use Inter Thread Communication. 

When customer places an order then and only then Manager 
can take the Order or  generate a bill of an Order.  

∙ And display the customer order after it place the Order.  

∙ You have to display minimum three orders of three different customers 
A, B and C, in  which customer A is the preferred customer with higher priority. 


------------------------------------------------------------------

*/

class Order {
    private String customerOrder;
    private boolean orderPlaced = false;

    public synchronized void placeOrder(String order) {
        while (orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        customerOrder = order;
        orderPlaced = true;
        System.out.println("Order placed: " + customerOrder);
        notify();
    }

    public synchronized void generateBill() {
        while (!orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Generating bill for: " + customerOrder);
        orderPlaced = false;
        notify();
    }
}

class Customer extends Thread {
    private final Order order;
    private final String name;
    private final String orderItem;

    public Customer(Order order, String name, String orderItem) {
        this.order = order;
        this.name = name;
        this.orderItem = orderItem;
    }

    @Override
    public void run() {
        order.placeOrder(orderItem);
    }
}

class Manager extends Thread {
    private final Order order;

    public Manager(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            order.generateBill();
        }
    }
}

class Restaurant {
    public static void main() {
        Order order = new Order();
        Manager manager = new Manager(order);

        Customer customerA = new Customer(order, "Customer A", "Pizza");
        Customer customerB = new Customer(order, "Customer B", "Burger");
        Customer customerC = new Customer(order, "Customer C", "Pasta");

        manager.start();
        customerA.start();
        customerB.start();
        customerC.start();
    }
}

class Program2{

    public static void main( String[] args ){
    
        Restaurant.main();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Order placed: Burger
Generating bill for: Burger
Order placed: Pasta
Generating bill for: Pasta
Order placed: Pizza
Generating bill for: Pizza

--------------------------------------------

*/