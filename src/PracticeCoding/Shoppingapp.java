package PracticeCoding;

import java.util.Scanner;

public class Shoppingapp {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        shoppingApp(2);

    }

    public static void shoppingApp(int itemNumber) {
        Scanner sc = new Scanner(System.in);
        String item = "";
        double price = 0;
        double total = 0.0;
        for (int i = 1; i <= itemNumber; i++) {
            System.out.println("Enter your item #" +i + " ");
            item = sc.nextLine();
            System.out.println("Enter price for "+ item + " ");
            price = sc.nextDouble();
            total += price;
            sc.nextLine();

        }
        System.out.println("Total......." +total);

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
    }
}