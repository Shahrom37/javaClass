package OOp.Abstract;

public class shape2 extends Drawing{
    @Override
    void drawing() {
        System.out.println("Painting a picture of the city");

    }

    @Override
    int numberOfPaintings() {
        return 5;
    }

    @Override
    void nameOfPainter(String name) {
        System.out.println("Name is " + name);

    }
}
