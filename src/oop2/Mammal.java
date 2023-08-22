package oop2;

public class Mammal extends Animal{

    public static String country;
    public static String veryTall;
    public static void main(String[] args) {

        name = "Giraffe";
        height = 16;
        weigh = 4.250;
        color = "yellow";
        speed = 37;
        country = "Africa";
        veryTall = "tru";
        displayInfo();
    }

    public static String getCountry(){
        return country;
    }

    public static String getVeryTall(){
        return veryTall;
    }
    public static void displayInfo() {
        System.out.println(getName());
        System.out.println(getHeight());
        System.out.println(getWeigh());
        System.out.println(getColor());
        System.out.println(getSpeed());
        System.out.println(getCountry());
        System.out.println(getVeryTall());
    }

}
