import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class StringMetodsPart2 {
    public static void main(String[] args) {

        String text = "Java is fun";
        Scanner sc = new Scanner(System.in);

        //int total = text.length();
        //System.out.println(total);


        //System.out.println("Enter your answer");
        //text = sc.nextLine();
        //total = text.length();
        //System.out.println(total);

        //chart

        //text = "Java is fun to learn:";
        //char ch = text.charAt(0);
        //System.out.println(ch);
        //System.out.println(text.charAt(6));

        //System.out.println(text.charAt(text.length()-1));


         //equals()
        //String str1 = "Java";
        //String str2 = "JavA";
        //boolean strResult = str1.equals(str2);
        //System.out.println(strResult);

        //equalsIgnoreCase
        //strResult = str1.equalsIgnoreCase(str2);
       // System.out.println(strResult);

        //isEmpty excepts no data and returns boolean

        //String str3 = "";
        //System.out.println(str3.isEmpty());



        //contains
        //text = "Hello World 2023";
        //boolean textResult = text.contains("2023");
        //System.out.println(textResult);

        //startWith
        //System.out.println(text.startsWith("Hello"));
        //System.out.println(text.startsWith("H"));
        //System.out.println(text.startsWith("w"));

        //endsWith

        //System.out.println(text.endsWith("3"));
        //System.out.println(text.endsWith("23"));
        //System.out.println(text.endsWith("2023"));
        //System.out.println(text.endsWith("d 2023"));


        //toLowerCase()
        text = "JAVA IS FUN";
        System.out.println(text);
        System.out.println(text.toLowerCase());


        //toUpperCase()
        text = "java is fun";
        System.out.println(text);
        System.out.println(text.toUpperCase());





        //indexOf
        int index = text.indexOf("a");
        System.out.println(text.indexOf("fun"));

        //lastInDexOf

        text = "Apple";
        System.out.println(text.indexOf("p"));
        System.out.println(text.lastIndexOf("p"));

        //replace

        text = "Apple";
        System.out.println(text.replace("A", "I"));;
        System.out.println(text.replace("Apple", "Watermelon"));

        //task


        System.out.println("Enter text: ");
        text = sc.nextLine();
        char first = text.charAt(0);
        char last = text.charAt(text.length()-1);
        System.out.println(text);
        String sum = text.replace(first, 'A').replace(last, 'Z');

        System.out.println(sum);

        //substring

        text = "hello world";
        System.out.println(text.substring(1));

        //trim

        text = "   This is a text with space    ";
        System.out.println(text);
        System.out.println(text.trim());
        System.out.println();











        //System.out.println(" Enter a text: ");
        //text = sc.nextLine();

        //System.out.println("Please enter a text: ");

        //char  text = sc.nextLine().charAt(0);

        //System.out.println("First character is " + "" + text);































    }
}
