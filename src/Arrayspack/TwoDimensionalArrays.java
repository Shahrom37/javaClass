package Arrayspack;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] numbers2 = {{1, 2, 31, 14, 5, 6}, {10, 23, 443, 44, 67, 444, 23}};
        System.out.println(numbers2[0][0]);
        System.out.println(numbers2[0][2]);
        System.out.println(numbers2[2][2]);
        System.out.println(numbers2[3][3]);


        String[][] days = {{"Sun", "Sat"}, {"Mon", "Tue", "Wed", "Thu", "Fri"}};
        System.out.println(days[1][0]);




        String [] [] fiveElements = { {"Mango", "Strawberry", "Peach", "Apple", "Pineapple"},
                {"Spinach", "Carrot", "Beans", "peas", "lettuce"},
                {"Toyota", "Lexus", "Ford", "Audi", "BMW"},
                {"Dog", "Cat", "Rhino", "Turtle", "Lion"},
                {"Sushi", "Spaguetti", "Hamburger", "Pizza", "Tacos" } };

        System.out.println(fiveElements[0][0]);
        System.out.println(fiveElements[1][0]);
        System.out.println(fiveElements[2][0]);
        System.out.println(fiveElements[3][0]);
        System.out.println(fiveElements[4][0]);


        System.out.println(fiveElements[0][4]);
        System.out.println(fiveElements[1][4]);
        System.out.println(fiveElements[2][4]);
        System.out.println(fiveElements[3][4]);
        System.out.println(fiveElements[4][4]);

        String [][] twoDarry = {
                {},
                {},
                {},
                {},

        };

    }
}
