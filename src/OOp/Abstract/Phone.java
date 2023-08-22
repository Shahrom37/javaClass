package OOp.Abstract;

public class Phone implements Iphone {
    @Override
    public void text() {
        System.out.println("I am texting");

    }

    @Override
    public void call() {
        System.out.println("I am calling");

    }

    @Override
    public void ring() {
        System.out.println("I am calling");

    }
}
