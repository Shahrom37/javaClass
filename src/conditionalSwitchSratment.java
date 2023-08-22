import java.util.Scanner;

public class conditionalSwitchSratment {
    public static void main(String[] args) {

        //int num = 1;

        //switch(num){
            //case 1:
               // System.out.println("one");
               // break;
           // case 2:
              //  System.out.println("two");
              //  break;
            //case 3:
             //   System.out.println("three");
             //   break;
            //default:
                //System.out.println("we could not find the match");

                Scanner sc = new Scanner(System.in);

                System.out.println("Please enter your letter grade: ");
                String grade = sc.nextLine();

                //switch(grade){
                    //case "A":
                       // System.out.println("Excellent");
                       // break;
                    //case "B":
                       // System.out.println("Great");
                       // break;
                    //case "C":
                        //System.out.println("Okay");
                        //break;
                    //case "D":
                        //System.out.println("You can do better");
                        //break;
                    //case "f":
                       // System.out.println("Something needs to change");
                       // break;
                    //default:
                       // System.out.println("Invalid letter grade");

                        //ask user to enter a month number
                        //with the usage of switch, print out the month name

        System.out.println("Please enter a month number:");
        int num = sc.nextInt();
        switch(num){
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

