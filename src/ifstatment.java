import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ifstatment {
    public static void main(String[] args) {

        //boolean b = 5 > 4;
        //System.out.println(b);

        //if (5 < 6) {
            //System.out.println(" 5 is less then 6");}

         //write a java code to find out if the number from user is + or -

        Scanner userInput = new Scanner(System.in);
        System.out.println(" please enter a number");
        int input = userInput.nextInt();

        if(input > 0){
            System.out.println("positive number");
        }

        if(input < 0){
            System.out.println("negative number");
        }

        System.out.println(" Enter your age: ");
        input = userInput.nextInt();

        if(input > 21){
            System.out.println(" you are elible to vote");
        }

        if(input < 21){
            System.out.println(" you are to young to vote");

        }

        System.out.println(" please anter a number");
        input = userInput.nextInt();

        if(input % 2 == 0){
            System.out.println("Even number");
        }

        if(input % 2 != 0){
            System.out.println("Odd number");
        }
















    }
}
