public class ArrayClass {
    public static void main(String[] args) {
        String[] allMonth = new String[12];
        allMonth[0] = "Jan";
        allMonth[1] = "Feb";
        allMonth[2] = "Mar";
        allMonth[3] = "Apr";
        allMonth[4] = "Ma;y";
        allMonth[5] = "Jun";
        allMonth[6] = "Jul";
        allMonth[7] = "Agu";
        allMonth[8] = "Sep";
        allMonth[9] = "Oct";
        allMonth[10] = "Nov";
        allMonth[11] = "Dec";

        //second option

        String[] monthNames = {
                "jan", "feb", "marc", "april"
        };


        System.out.println(allMonth[0]);
        System.out.println(allMonth[1]);
        System.out.println(allMonth[2]);
        System.out.println(allMonth[8]);

        // create an array of str and signing 5 values
        // / of favorite fruit names

        String[] favFruits = new String[5];
        favFruits[0] = "Apple";
        favFruits[1] = "Orange";
        favFruits[2] = "Grape";
        favFruits[3] = "Banana";
        favFruits[4] = "Mango";
        System.out.println(favFruits[0]);
        System.out.println(favFruits[1]);
        System.out.println(favFruits[2]);
        System.out.println(favFruits[3]);
        System.out.println(favFruits[4]);


        // array int
        int[] number = new int[7];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        System.out.println(number[4]);

        //char
        char[] alphabet = new char[4];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        alphabet[3] = 'd';

        //second option

        char[] alphabet2 = {'a', 'b', 'c', 'd'};

        System.out.println(alphabet[0]);
        System.out.println(alphabet2[0]);

        //double
        double[] d = new double[3];

        d[0] = 1.99;
        d[1] = 2.99;
        d[2] = 3.99;
        //second option
        double[] d2 = {1.99, 2.99, 3.99};
        System.out.println(d[2]);
        System.out.println(d[2]);

        //string
        String[] days = {"Monday", "Tuesday", "Thursday",
                "Friday", "Wednesday", "Saturday", "Sunday"};
        System.out.println("Today is: " + days[5]);


        //task
        String[] monthNames1 = {
                "jan", "feb", "marc", "april"
        };
        for (int i = 0; i < monthNames.length; i++) {
            System.out.println(monthNames1[i]);


        }
    }
}