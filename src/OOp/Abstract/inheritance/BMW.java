package OOp.Abstract.inheritance;

public class BMW extends Car {
    public static String country;
    public static String packageType;

    public static void main(String[] args) {
        make = "BMW";
        model = "X7";
        year = 2023;
        color = "Black";
        tireSize = 21;
        engineSize = 3.5;
        country = "Germany";
        packageType = "M Drive";
        displavInfo();

    }

    public static String getCountry() {
        return country;
    }

    public static String getPackageType() {
        return packageType;
    }

    public static void displavInfo(){
        System.out .println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getColor());
        System.out.println(getTiresize());
        System.out.println(getEnginesize());
        System.out.println(getCountry( ));
        System.out .println(getPackageType()) ;
    }
}