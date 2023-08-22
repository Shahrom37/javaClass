package OOp.Abstract.inheritance;

public class cat extends Animal {
    public static void main(String[] args) {
        makeASound();
        run();
        jumpHigher();
    }


    public static void makeSound() {
        System.out.println("Cat making Sound");
    }

    public static void run() {
        System.out.println("Cat running");
    }

    public static void jumpHigher() {
        System.out.println("Cat jumping high!");

    }
}