package OOp.Abstract.inheritance;

public class Tayota extends Car {
    public static String country;
    public static String engineType;

    public static void main(String[] args) {

        make = "Tovota";
        model = "Prius";
        year = 2023;
        color = "Silver";
        tireSize = 16;
        engineSize = 1.8;
        country = "Japan";
        engineType = "Hybrid";
        displavInfo();
    }

    public static void displavInfo() {
        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getColor());
        System.out.println(getTiresize());
        System.out.println(getEnginesize());
        System.out.println(getCountry());
        System.out.println(engineType);
    }

    public static String getCountry() {
        return country;
    }
}