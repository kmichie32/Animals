package com.kevinmichie;

public class Dog extends Animal{

    public Dog(){
        super(15); // this referencing Animal Constructor in Animal Class
        System.out.println("A dog has been created.");
    }

    public void eat(){
        System.out.println("A dog is eating");
    }

    //public abstract eat();
    //If we want to make different types

    public void sleep(){
        System.out.println("A dog is sleeping");
    }
    public void ruff(){
        System.out.println("The dog says ruff!"+
        " Just like your mother Trebeck!");
    }

    public void run(){
        System.out.println("A dog is running.");
    }

}
