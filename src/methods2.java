import java.util.Scanner;

public class methods2 {

    //create a void method that adds 2 numbers
    public static void add(int i, int j) {
        System.out.println(i + j + "is the sum of " + i + " and " + j);

    }

    //create a method that returns difference between 2 numbers
    // /method takes 2 arguments with double data type
    // method returns 1 number with double data type
    public static double difference(double i, double j) {
        double k = i - j;
        return k;

    }

            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                add(66776, 767677);


                double a = difference(23.55, 5.2343524);
                System.out.println(a);








            }


        }
