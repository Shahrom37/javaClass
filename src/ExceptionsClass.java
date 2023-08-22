import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsClass {
    public static void main(String[] args) {


        try{Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println(num);

        }catch(InputMismatchException e){
            System.out.println("oops " + e.getMessage());


        }












    }




            }
















