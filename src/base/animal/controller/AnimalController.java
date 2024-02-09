package base.animal.controller;

import base.animal.model.Animal;

import java.util.ArrayList;
import java.util.HashMap;

public class AnimalController {
    private final HashMap<Integer, Animal> animals = new HashMap<>();
    private int lastId;
    public AnimalController() {
    }

    public ArrayList<Animal> getAll(){
        return new ArrayList<>(animals.values());
    }

    public Animal create(Animal animal) {
        var newAnimal = new Animal(animal);
        newAnimal.setId(lastId);
        animals.put(lastId, newAnimal);
        lastId++;
        return newAnimal;
    }
    public void create(Animal[] animals){
        for(var a : animals){
            a.setId(lastId);
            this.animals.put(lastId, a);
            lastId++;
        }
    }
}
