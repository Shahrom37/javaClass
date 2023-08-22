public class Stringbuilder {
    public static void main(String[] args) {
        String name = "James";
        String name2 = new String("James");


        StringBuilder name3 = new StringBuilder("james");
        System.out.println(name3);

        StringBuilder fruit = new StringBuilder("Apple");
        System.out.println(fruit);

        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        //append()
        str.append(" World ");
        System.out.println(str);

        //deleteChart
        str.deleteCharAt(0);
        System.out.println(str);

        //delete
        StringBuilder text2 = new StringBuilder("Java is fun");

        text2.delete(0, 4);
        System.out.println(text2);

        text2.delete(0, 3);
        System.out.println(text2);

        //reverse
        StringBuilder fruit2 = new StringBuilder("Apple");
        System.out.println(fruit2);
        fruit2.reverse();
        System.out.println(fruit2);

        //task
        StringBuilder name1 = new StringBuilder("Shahrom");
        name1.reverse();
        System.out.println(name1);


        //insert
        StringBuilder fruit3 = new StringBuilder("Apple");
        fruit3.insert(2, "10 kg of ");
        System.out.println(fruit3);

        //ask

        StringBuilder firstname = new StringBuilder("shahrom");
        firstname.insert(7," Sharipov ");
        System.out.println(firstname);

        //convert
        String x = "Apple";
        StringBuilder y = new StringBuilder(x);
        System.out.println(y);


        StringBuilder sb = new StringBuilder("iphone");
        String iphone = sb.toString();
        System.out.println(iphone);















    }
}
