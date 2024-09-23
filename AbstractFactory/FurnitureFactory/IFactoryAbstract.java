package AbstractFactory.FurnitureFactory;

public interface IFactoryAbstract {
    public IChair createChair();
    public ISofa createSofa();
    public ICoffeeTable createTable();
}
