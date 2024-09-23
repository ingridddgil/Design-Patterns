package AbstractFactory.FurnitureFactory;

public class ArtDecoFactory implements IFactoryAbstract{
    @Override
    public IChair createChair(){
        return new ArtDecoChair();
    }

    @Override
    public ISofa createSofa(){
        return new ArtDecoSofa();
    }

    @Override
    public ICoffeeTable createTable(){
        return new ArtDecoCoffeeTable();
    }
}