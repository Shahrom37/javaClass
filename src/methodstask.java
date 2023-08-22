import java.util.Scanner;

public class methodstask {

    //2. Print a Message Multiple Times Create a method called printMessage that
    // takes a String message and an int count as parameters
    // . The method should print the message count number of times.

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }


    }
    public static void swapVariables(int a, int b) {
     int empty;
     empty = a;
    a = b;
    b = empty;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
    }


    //Numbers Create a method called printEvenNumbers that
     //takes an in limit as a parameter.
     //The method should print all even numbers from 1 to the given limit.
    public static void printEvenNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      if (i % 2 == 0) {
        System.out.println(i);

        }
     }
     }

     public static void reverseString (String str){
     StringBuilder sb = new StringBuilder (str) .reverse ();
     System.out.println (sb);


     }
    // create a method that convert Celsius to Fahrenheit

    public static double celsiusToFahrenheit(float celsius){
     double fahrenheit = celsius*9/5+32;
     return fahrenheit;

     }


    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        printMessage("Hello", 5);
         printEvenNumbers(20);
         reverseString("Emely");
        System.out.println(celsiusToFahrenheit(35));
    }

}


    //Numbers Create a method called printEvenNumbers that
    // takes an in limit as a parameter.
    // The method should print all even numbers from 1 to the given limit.






        //    }








