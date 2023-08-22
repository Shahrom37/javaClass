import org.w3c.dom.ls.LSOutput;

public class calculator {

    //1. create a method that does addition
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    //2. create a method that deducts ole number from another one
    public void deduct(int a, int b) {
        System.out.println(a - b);
    }

    //3, create a method that multiplies 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    //4. create a method that divides 2 numbers
    //action performed: division
    public int divide(float a, float b) {
        int c = (int) (a / b); //casting
        return c;
    }
}

class buddy{
    public static void main(String[] args) {
        //c is the object of calculator class, it is called instantiation of the class
        calculator c = new calculator();

        //calling static method
        calculator.add ( 500,  20) ;


      //calling non-static method
        c.divide (  354,  3456345) ;

        calculator.multiply (  3,  6) ;

        c. deduct (  325,  345);

    }
}


