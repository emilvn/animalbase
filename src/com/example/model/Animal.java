package com.example.model;

public class Animal {
    private int id;
    private String name;
    private String type;
    private String description;
    private int age;
    private boolean star;
    private boolean winner;

    public Animal(){

    }
    public Animal(Animal other){
        this.name = other.name;
        this.type = other.type;
        this.description = other.description;
        this.age = other.age;
        this.id = other.id;
    }

    public Animal(String name, String type, String description, int age){
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public Animal(String compound, int age){
        String[] parts = compound.split(" ");
        this.name = parts[0];
        this.description = parts[2];
        this.type = parts[3];
        this.age = age;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", star=" + star +
                ", winner=" + winner +
                '}';
    }
}
