package ro.ase.cts.main;

import ro.ase.cts.animale.FoodType;
import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Maimuta;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Baneasa", new ZooKeeper("Ionescu"));

        zoo.addAnimal(new Lion("Leon", 0, FoodType.MEAT, 150));
        zoo.addAnimal(new Zebra("Zebra", 0, FoodType.GRASS, 24));
        zoo.addAnimal(new Maimuta("Zebra", 0, FoodType.BANANE));

        zoo.feedAllAnimals();
    }
}