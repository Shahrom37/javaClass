package OOp.Abstract.inheritance;

public class ChildrenClass extends  ParentClass {
    public static void main(String[] args) {
        printName();
    }

    public static void printName() {
        System.out.println("This is a Child class");
    }

    @Override
    public void addTwoNumbers() {
        System.out.println("This is a child class " + (100 + 100));
    }

    @Override
    public void drawingShape() {
        addTwoNumbers();
        printName();
    }
}