package ClassesAndObjectsPartOne;

public class car3 {
    String make;
    String model;
    int age;

    public car3(String make, String model, int age){
        //this
        this.make = make;
        this.model = model;
        this.age = age;

    }

    public void displayInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(age);
    }

    public static void main(String[] args) {

        car3 car = new car3("ford", "f150", 1);
        car.displayInfo();

    }
}
