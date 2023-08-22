package ClassesAndObjectsPartOne;

public class tiger {

    public static void main(String[] args) {
        Animal tiger = new Animal("Sherkhan", "Orange/black", "wild", 3,180.50);
       tiger.displayInfo();;

       Animal dog = new Animal("rex", "brown", "home animal", 4, 134.5);
       dog.displayInfo();

        Animal cow = new Animal("mumu", "black", "home animal", 5, 220.7);
        cow.displayInfo();

    }
}
