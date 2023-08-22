package Arrayspack;

public class Array2 {

    public static void main(String[] args) {
        int[] num1 = new int[3];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        System.out.println(num1[0]);

        //second way
        int[] num2 = {10, 20, 30, 40};

        System.out.println(num1[0] + " | " + num2[0]);


        char[] vowels = {'a', 'e', 'o', 'u', 'i'};
        System.out.println(vowels);

        System.out.println(vowels[0]);
        System.out.println(vowels[1]);
        System.out.println(vowels[2]);
        System.out.println(vowels[3]);
        System.out.println(vowels[4]);

        //with loop

        char[] vowels1 = {'a', 'e', 'o', 'u', 'i'};
        for (int i = 0; i < vowels1.length; i++) {
            System.out.println(vowels1[i] + ", ");
        }

        String[] animal = {"birds", "dog", "cat",
                "chiken", "tiger", "Swans", "snake", "birds", "lion", "pig"};
        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);
        System.out.println(animal[4]);
        System.out.println(animal[5]);
        System.out.println(animal[6]);
        System.out.println(animal[7]);
        System.out.println(animal[8]);
        System.out.println(animal[9]);
        //with loop
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);

            //for off

            String[] animal2 = {"birds", "dog", "cat",
                    "chiken", "tiger", "Swans", "snake", "birds", "lion", "pig"};
            for (String s : animal) {
                System.out.println(s);
            }


            char[] vowels2 = {'a', 'e', 'o', 'u', 'i'};
            for (char vowel : vowels) {
                System.out.print(vowel + ", ");
            }


            int[] numbers = {30, 40, 50, 60, 70, 80, 90, 100};
            for (int num : numbers) {
                System.out.println(num);
            }


            char[] vowels3 = {'a', 'e', 'o', 'u', 'i'};
            for (char vowel : vowels) {
                if (vowel == 'a') {
                } else {
                    System.out.println("There is an a in this array");
                    System.out.println("No a found!");
                }


            }

        }
    }
}
