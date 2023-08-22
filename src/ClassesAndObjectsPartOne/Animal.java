package ClassesAndObjectsPartOne;

public class Animal {
    String name;
    String color;
    String type;
    int age;
    double weight;

    public Animal(String name, String color, String type, int age, double weight){
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }
    public void displayInfo(){
        System.out.println("name: " +name);
        System.out.println("color: " + color);
        System.out.println("type: " +type);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }

}
