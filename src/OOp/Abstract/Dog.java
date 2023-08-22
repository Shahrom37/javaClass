package OOp.Abstract;

public class Dog implements AnimalInterface, LocationInterface{

    @Override
    public void makeSound() {

        System.out.println("dog make sound");
    }

    @Override
    public void eat() {
        System.out.println("dog eats meal");

    }

    @Override
    public void sleep() {
        System.out.println("dog love sleep");

    }

    @Override
    public void addressLocation() {
        System.out.println("address 123ave");

    }

    @Override
    public void zip() {
        System.out.println("1234");

    }
}
