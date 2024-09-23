package AbstractFactory.FurnitureFactory;

public interface IFactoryAbstract {
    public abstract IChair createChair();
    public abstract ISofa createSofa();
    public abstract ICoffeeTable createTable();
}
