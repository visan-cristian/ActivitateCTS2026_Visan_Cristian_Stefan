package ro.ase.cts.animale;

public class Maimuta extends Animal{
    public Maimuta(String name, int age, FoodType foodType){
        super(name, age, foodType);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println(zooKeeperName + "hraneste cu" + super.foodType + "pe" + super.name);
    }

}
