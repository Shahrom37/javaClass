package Arrayspack;

public class Array3333 {
    public static void main(String[] args) {

        String[][] fiveElements = {{"Mango", "Strawberry", "Peach", "Apple", "Pineapple"},
                {"Spinach", "Carrot", "Beans", "peas", "lettuce"},
                {"Toyota", "Lexus", "Ford", "Audi", "BMW"},
                {"Dog", "Cat", "Rhino", "Turtle", "Lion"},
                {"Sushi", "Spaguetti", "Hamburger", "Pizza", "Tacos"}};

        for (int i = 0; i < fiveElements.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println();
            }




            char[][] sh = {
                    {'A', 'b', 'c', 'd'},
                    {'e', 'f', 'g', 'h'},
                    {'i', 'j', 'k', 'l'},
                    {'m', 'n', 'o', 'p'}
            };
            for (char[] h : sh) {
                for (char s = 0; s <= 3; s++) {
                    System.out.println(h[s] + "  ");
                }
            }
        }
    }
    }


