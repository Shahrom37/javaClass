import java.util.Scanner;

public class conditionalStatment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How month old is your baby ");
        int month = sc.nextInt();

        if(month > 0 && month <= 23){
            System.out.println("Send your baby to DayCare");
        }

        if(month >= 24 && month <= 35){
            System.out.println("Send your baby to pre-Kindergarten");
        }

        if(month >= 36){
            System.out.println("Send your kid to kindergarten");

            //Ask user to enter 5
            //integers and store all of them.
            //Count how many of them
            //odd, how many of them even.
            //Print number of evens and
            //odds.

            //check the exam score and produce final grade
            //100 - 90 -> A
            //89 - 80 -> B
            //79 - 70 -> C
            //69 - 60 -> D
            //else failed

            System.out.println(" ");







            
        }
    }
}

