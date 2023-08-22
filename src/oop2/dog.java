package oop2;

public class dog extends Mammal{
    public static String Friendly;

    public static void main(String[] args) {

        name = "Barbos";
        height = 32;
        weigh = 80;
        color = "brown";
        speed = 40;
        country = "Tajikistan";
        veryTall = "No";
        Friendly = "yes";
        displayInfo();
        getFriendly();
        System.out.println(getFriendly());
    }
    public static String getFriendly(){
        return Friendly;
    }
}
