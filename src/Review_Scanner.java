import java.sql.SQLOutput;
import java.util.Scanner;

public class Review_Scanner {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //String name, make, model;
       // int year;

        //String name, make , model;
       // int year;



        //System.out.print(" enter the name of car: ");
        //name = input.nextLine();



       // System.out.print(" enter a make of car:");
       // make = input.nextLine();



       // System.out.print(" enter the model of car:");
       // model = input.nextLine();



        //System.out.print(" enter the year of car:");
        //year = input.nextInt();
       // System.out.println(" name " + name + " make " + make + " model " + model + " year " + year );


       // String firstName;
        //String LastName;
       // String DoB;
        //String address;

        //System.out.println(" Enter Your Name: ");
        //firstName = input.nextLine();

        //System.out.println(" Enter Your Last Name: ");
        //LastName = input.nextLine();

        //System.out.println(" Enter Your DoB ");
       // DoB = input.nextLine();

        //System.out.println(" Enter Your address: ");
        //address = input.nextLine();
        //System.out.println(" Full Name is " + firstName + "  " + LastName );
        //System.out.println(" Date of Birth " + DoB);
       // System.out.println(" Address is " + address);


        //Shopping App: FreshMarket
        // user should enter 5 item + price
        //result: should give a receipt with item names and price
        // it should display the total price

        String item1, item2, item3, item4, item5;
        float price1, price2, price3, price4, price5;

        System.out.println(" Enter item #1: ");
        item1 = input.nextLine();
        System.out.println("Enter price for " + item1);
        price1 = input.nextFloat();

        input.nextLine();

        System.out.println(" Enter item #2: ");
        item2 = input.nextLine();
        System.out.println("Enter price for " + item2);
        price2 = input.nextFloat();

        input.nextLine();

        System.out.println(" Enter item #3: ");
        item3 = input.nextLine();
        System.out.println("Enter price for " + item3);
        price3 = input.nextFloat();

        input.nextLine();

        System.out.println(" Enter item #4: ");
        item4 = input.nextLine();
        System.out.println("Enter price for " + item4);
        price4 = input.nextFloat();

        input.nextLine();

        System.out.println(" Enter item #5: ");
        item5 = input.nextLine();
        System.out.println("Enter price for " + item5);
        price5 = input.nextFloat();

        System.out.println(item1 + "....." + price1);
        System.out.println(item2 + "....." + price2);
        System.out.println(item3 + "....." + price3);
        System.out.println(item4 + "....." + price4);
        System.out.println(item5 + "....." + price5);

        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("           Receipt        ");
        System.out.println("                          ");
        System.out.println("     Fresh Market Sore");
        System.out.println(" 123 Main street, New York, NY 1111 ");
        System.out.println("     +1  (223) 444 3322");
        System.out.println("   freshmarket@shopping.com");
        System.out.println("                           ");
        System.out.println("                           ");
        System.out.println("************************************");
        System.out.println("                           ");
        System.out.println("      06/28/2023  7:08 PM");
        System.out.println("QTY  ITEM                       AMT");
        System.out.println("-------------------------------------");
        System.out.println("1. " + item1 + "                " + price1);
        System.out.println("2. " + item2 + "                " + price2);
        System.out.println("3. " + item3 + "                " + price3);
        System.out.println("4. " + item4 + "                " + price4);
        System.out.println("5. " + item5 + "                " + price5);
        System.out.println("---------------------------------------");
        System.out.println("Total                         " + price1 + price2 + price3 + price4 + price5);
        System.out.println("---------------------------------------");
        System.out.println("   ");
        System.out.println("        THANKS FOR SHOPPING");
        System.out.println("        HAVE A NICE DAY!");
        System.out.println("************************************");
        System.out.println("************************************");




































    }
}
