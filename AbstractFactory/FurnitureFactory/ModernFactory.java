package AbstractFactory.FurnitureFactory;

public class ModernFactory implements IFactoryAbstract{
    @Override
    public IChair createChair(){
        return new ModernChair();
    }

    @Override
    public ISofa createSofa(){
        return new ModernSofa();
    }

    @Override
    public ICoffeeTable createTable(){
        return new ModernCoffeeTable();
    }
}
