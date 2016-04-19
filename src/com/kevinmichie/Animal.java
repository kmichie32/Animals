package com.kevinmichie;

import java.util.Objects;

public abstract class Animal {

    private int age;// VS public int age (don't need a getter);

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public void sleep(){
        System.out.println("An animal is sleeping ");
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("The dog's age is "+ dog.getAge());
        System.out.println("The cat's age is "+ cat.getAge());
        cat.meow();
        dog.ruff();
        dog.eat();
        cat.eat();
        dog.run();
        cat.prance();

        System.out.println();
        System.out.println();
        dog.eat();
        cat.eat();

        System.out.println();
        System.out.println();
        cat.sleep();
        dog.sleep();

        //Converting from a super to a sub
        //Animal billy = new Dog();

        // Casting
        Object doggie = new Dog();
        Dog realDog = (Dog) doggie;
        realDog.ruff();

        Object str = "est";
        String realS = (String) str;
        realS.getBytes();

        // What happens when...

        Dog doggy = new Dog();
        if (dog instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();

    }
}
