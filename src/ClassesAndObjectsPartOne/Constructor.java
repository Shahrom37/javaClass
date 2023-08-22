package ClassesAndObjectsPartOne;

public class Constructor {

    public String color;
    public String make;
    public String model;




    public Constructor(){
        color = "Red";
        make = "benz";
        model = "s63";
    }

    public static void main(String[] args) {
        Constructor car = new Constructor();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);


    }
}
