import java.sql.SQLOutput;
import java.util.Scanner;

public class User1 {
    public static void main(String[] args) {
        //object of Scanner class creation

        Scanner sc = new Scanner(System.in);

        //System.out.println("What is your first name? ");

      // String firstName = sc.nextLine();

       // System.out.println("User's name is " + firstName);


       // System.out.println("What is your last name? ");

        //String Lastname = sc.nextLine();

        //System.out.println("User's  full name is " + firstName + " " + Lastname);


       System.out.println(" What is your year of birth?");
        int yearOfBirth = sc.nextInt();

        int age = 2023 - yearOfBirth;

       System.out.println("Your age is " + age);

        //task1



        //System.out.println("My nmae is Shahrom");
        //String name = sc.nextLine();
        //System.out.println("name is: " + name);


        //System.out.println("what is your name?");
        //String name1 = sc.nextLine();
        //System.out.println("My name is " + name1);

        //System.out.println("What is your name?");
       // String name = sc.nextLine();

       // System.out.println("What is your age?");
        //int age = sc.nextInt();
        //System.out.println("Thank you for inputing your information" + " your name is " + name + " and your age is " + age);

        //Arithmetic Operation +
        double bread = 5.33;
        float milk = 4.20f;
        float apple = 2.20f;
        int fish = 10;
        double total = bread + milk + apple + fish;
        System.out.println("Total spent is " + total);


        //Subtraction -
        int currentYear = 2023;
        int yearOfBirth1 = 2000;
        int age1 = currentYear - yearOfBirth;
        System.out.println("age is " + age);

        // Multiplication *
        float x = 10;
        float y = 2.5f;
        float z = x * y;

        System.out.println(z);

        //division /
        int a = 1000;
        int b = 40;
        int c = a / b;
        System.out.println(c);

        //Increment ++
        int i = 1;
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        //Decrement
        int t = 5;
        t--;
        System.out.println(t);
        --t;
        System.out.println(t);

        int num1 = 100;
        int num2 = 200;
        int prod = num1 * num2;
        System.out.println(prod);



























    }
}
