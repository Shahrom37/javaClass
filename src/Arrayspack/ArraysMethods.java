package Arrayspack;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 2, 0, 8, 7, 5, 6, 1};
        //regular
        for (int n : numbers) {
            System.out.println(n + ", ");
        }
        //sort Arrays
        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.println(n + ", ");
        }

        //regular
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            System.out.print(day + ", ");
        }
        //sort Array
        Arrays.sort (days);
        for(String day : days) {
            System.out.print(day + " t ");
        }


            //task

            char[] ch = {'a', 'f', 'h', 'l'};
            for (char c : ch) {
                System.out.print(c + ", ");
            }

            Arrays.sort(ch);
            for (char c : ch) {
                System.out.print(c + ", ");

                //equals - compares two arrays for equality
                int[] array1 = {4, 2, 3, 1};
                int[] array2 = {1, 2, 3, 4};
                boolean result = Arrays.equals(array1, array2);
                System.out.println();
                System.out.println(result);

                //length returns the length of an array

                int[] array3 = {1, 2, 3, 4, 6, 88, 776, 443};
                System.out.println(array3.length);

                //toString returns  a string representation of

                String str = Arrays.toString(array3);
                System.out.println(str);


            }


        }

    }





