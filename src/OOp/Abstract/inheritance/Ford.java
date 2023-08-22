package OOp.Abstract.inheritance;

public class Ford extends Car {

    public static void main(String[] args) {

        make = "Ford";
        model = "F150";
        year = 2023;
        color = "White";
        tireSize = 25;
        engineSize = 5.7;
        displayInfo();

    }

    public static void displayInfo() {
        System.out.println(getMake());
        System.out.println(getModel());
        System.out.println(getYear());
        System.out.println(getColor());
        System.out.println(getTiresize());
        System.out.println(getEnginesize());
    }
}
