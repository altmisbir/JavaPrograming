package day44_Abstraction.animalTask;

import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Flyable;
import day44_Abstraction.animalTask.Playable;

public final class Parrot extends Animal implements Playable, Flyable {

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {

    }


    @Override
    public void fly() {
        System.out.println(getName()+" can fly 20km/h");
    }
}