package main;

import inheritance.Animal;
import inheritance.Cow;
import inheritance.Frog;
import inheritance.Sheep;
import inheritance.Babysheep;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Muh", "only gras", 3);
        Frog frog = new Frog("Quak", "yes", 0.25);
        Babysheep babysheep = new Babysheep("Baby-Maeh", "no", 2);
        Sheep sheep = new Sheep("Maeh", "yes", 1);

        //animal.makeNoise();
        System.out.println();

        cow.makeNoise();
        System.out.println();

        frog.makeNoise();
        frog.printFrog();
        System.out.println();

        babysheep.makeNoise();
        System.out.println();

        sheep.makeNoise();
        System.out.println();


        Animal[] animals = new Animal[4];
        animals[0] = sheep;
        animals[1] = babysheep;
        animals[2] = cow;
        animals[3] = frog;

        System.out.println("Array:");
        for (Animal e : animals) {
            e.makeNoise();
        }

    }
}
