import java.util.Scanner;

public class SwitchStatmentsPtactice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int season = 2;
        switch (season) {

            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("autumn");
                break;
            default:
                System.out.println("unknown season");
        }

                //write java code to find season of the year base on month number 1 - 12

                int monthNumber = 0;

                switch (monthNumber) {

                    case 12, 1, 2:
                        System.out.println("winter");
                        break;
                    case 3, 4, 5:
                        System.out.println("spring");
                        break;
                    case 6, 7, 8:
                        System.out.println("summer");
                        break;
                    case 9, 10, 11:
                        System.out.println("autumn");
                        break;
                    default:
                        System.out.println("unknown season");

                        System.out.println("Please enter a month number:");
                        int num = sc.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("January");
                                break;
                            case 2:
                                System.out.println("February");
                                break;
                            case 3:
                                System.out.println("March");
                                break;
                            case 4:
                                System.out.println("April");
                                break;
                            case 5:
                                System.out.println("May");
                                break;
                            case 6:
                                System.out.println("June");
                                break;
                            case 7:
                                System.out.println("July");
                                break;
                            case 8:
                                System.out.println("August");
                                break;
                            case 9:
                                System.out.println("September");
                                break;
                            case 10:
                                System.out.println("October");
                                break;
                            case 11:
                                System.out.println("November");
                                break;
                            case 12:
                                System.out.println("December");
                                break;
                            default:
                                System.out.println("Invalid month");
                        }
                }
        }

    }

