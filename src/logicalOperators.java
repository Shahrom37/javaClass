import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program that prompts the user to enter two boolean values and performs a logical AND operation on them. Print the result.

        System.out.println(" Enter fist boolean values:");
        boolean a = sc.nextBoolean();
        System.out.println("Enter second boolean values:");
        boolean b = sc.nextBoolean();
        boolean result = a && b;
        System.out.println(result);







    }

}
