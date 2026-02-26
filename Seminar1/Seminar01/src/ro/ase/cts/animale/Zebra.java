package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int numberOfStripes;

    public Zebra(String name, int age, FoodType foodType, int numberOfStripes){
        super(name, age, foodType, numberOfStripes);
        this.numberOfStripes = numberOfStripes;
    }
    @Override
    public void eat(String zooKeeperName) {
        System.out.println("ZooKeeper" + zooKeeperName + "feeds zebra" + super.name + "with" + super.foodType);
    }
}
