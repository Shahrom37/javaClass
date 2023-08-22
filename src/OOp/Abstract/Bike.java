package OOp.Abstract;

public class Bike extends Vechile{

    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.moveForward();
        bike.moveBackward();
        bike.turnLeft();
        bike.turnRight();
        bike.drive();
    }

    @Override
    void moveForward() {
        System.out.println("Bike moveForward");

    }

    @Override
    void moveBackward() {
        System.out.println("Bike moveBackward");

    }

    @Override
    void turnLeft() {
        System.out.println("Bike turning left");

    }

    @Override
    void turnRight() {
        System.out.println("Bike turning right");

    }
}
