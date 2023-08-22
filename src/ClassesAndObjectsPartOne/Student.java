package ClassesAndObjectsPartOne;

public class Student {
    String name;
    String gender;
    int age;
    int year;

    public Student(String name, String gender, int age, int year) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.year = year;


    }

    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("year: " + year);


    }

    public static void main(String[] args) {
        Student name = new Student("Shahrom", "Male", 23, 2000);
        name.displayInfo();

    }
}