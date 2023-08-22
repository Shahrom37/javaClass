import java.util.Scanner;

public class Sbpractice {
    public static void main(String[] args) {

        //ask user to enter a text print reverse version
        //and make all uppercase


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.reverse().toString().toUpperCase());

        //ask use to enter a text print only last char
        //if user enters only one char print invalid entry

        System.out.println("Enter a text "); // a
        String last = sc.nextLine(); // > 1

        if (last.length() > 1){
            System.out.println(last.charAt(last.length()-1));
        }else{
            System.out.println("Try again");
        }














    }
}
