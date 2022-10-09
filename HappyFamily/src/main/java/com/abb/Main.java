package com.abb;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human("Vito", "Karleone", 1977);
        Human child = new Human("Michael", "Karleone", 1990, mother, father);


        Pet pet = new Pet("Dog", "Rock", 5, 75, new String[] {"eat", "drink", "sleep"} );

        String[][] schedule = new String[2][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "Go to work";
        schedule[1][0] = "Thuesday";
        schedule[1][1] = "Meet with friends";
        Human teacher = new Human("Jhon", "Jack", 1990, 86, pet, mother, father,schedule);


        mother.name = "Jane";
        mother.surname = "Karloene";
        mother.year = 1977;

        pet.species = "Dog";
        pet.nickname = "Rock";
        pet.age    = 5;
        pet.trickLevel = 75;
        pet.habits = new String[] {"eat", "drink", "sleep"};

        child.name= "Michael";
        child.surname = "Karleone";
        child.year = 1990;
        child.mother = mother;
        child.father = father;
        child.pet = pet;


        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(pet);
        System.out.println(teacher);
    }
}