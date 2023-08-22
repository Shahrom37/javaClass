package OOp.Abstract;

public class Car extends Vechile{

    @Override
    void moveForward() {
        System.out.println("Car is moving forward");

    }

    @Override
    void moveBackward() {
        System.out.println("Car is moving backward");

    }

    @Override
    void turnLeft() {
        System.out.println("Car is Turning left");

    }

    @Override
    void turnRight() {
        System.out.println("Car is Turning right");

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.moveForward();
        car.moveBackward();
        car.turnLeft();
        car.turnRight();

    }
}
