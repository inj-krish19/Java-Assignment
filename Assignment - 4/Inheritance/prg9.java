/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 4

-----------------------------------------------------------------

Program - 9 : Create a class ArrSort which contains one double array 
to store the data and one integer variable to store the number of elements.

------------------------------------------------------------------

*/

class ArrSort{

    private double elements[];
    private int size;

    ArrSort(int size) {
        elements = new double[size];
        size = 0;
    }

    public void add(double value) {
        if ( size < elements.length) {
            elements[size] = value;
            size++;
        } else {
            System.out.println("Array is full, cannot add more elements.");
        }
    }

    public void showSize() {
        System.out.println("Number of Elements Are " + size);
    }

    public void show() {
        System.out.print("\nArray elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

}

class Program9{

    public static void main( String[] args ){
    
        ArrSort array = new ArrSort(5);

        array.add(1);
        array.add(5);
        array.add(12);
        array.add(25);
        array.add(47);

        array.showSize();
        array.show();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

Number of Elements Are 5

Array elements: 1.0 5.0 12.0 25.0 47.0

--------------------------------------------

*/