package AbstractFactory.FurnitureFactory;

public class ModernCoffeeTable implements ICoffeeTable {
    @Override
    public void use(){
        System.out.println("I'm using a modern coffee table");
    }
}
