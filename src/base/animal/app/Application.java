package base.animal.app;

import base.animal.controller.AnimalController;
import base.animal.model.Animal;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }
    private void start(){
        var animalController = new AnimalController();

        var animal0 = new Animal("Bob", "lion", "great", 10);
        var animal1 = new Animal("Tom", "horse", "funny", 15);
        var animal2 = new Animal("Ib", "cow", "ugly", 20);
        var animal3 = new Animal("John", "lizard", "exciting", 25);
        var animal4 = new Animal("Mogens", "bird", "intriguing", 30);
        var animal5 = new Animal("Hans", "dog", "experienced", 35);
        var animal6 = new Animal("Johnny", "cat", "questionable", 40);

        var newAnimals = new Animal[]{animal0, animal1, animal2, animal3, animal4, animal5, animal6};
        animalController.create(newAnimals);

        for(var a : animalController.getAll()){
            System.out.println(a);
        }
    }
}
