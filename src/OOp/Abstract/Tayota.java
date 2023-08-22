package OOp.Abstract;

public class Tayota extends Car1{
    @Override
    void starting() {
        System.out.println("car starting");

    }

    @Override
    void driving() {
        System.out.println("car driving");

    }

    @Override
    void stopping() {
        System.out.println("car stopping");

    }

    @Override
    void parking() {
        System.out.println("car parking");

    }
}
