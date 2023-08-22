package OOp.Abstract.inheritance;

public class Dog extends Animal {

    public static void main(String[] args) {
        makeASound();
        run();
    }


    public static void makeASound() {

        System.out.println("Dog making sound");
    }
    public static void run(){
        System.out.println("dog running");
    }

}