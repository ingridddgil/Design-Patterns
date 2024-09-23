package AbstractFactory.FurnitureFactory;

public class FurnitureStore {
    private IChair chair;
    private ISofa sofa;
    private ICoffeeTable coffeetable;

    public FurnitureStore(IFactoryAbstract factory){
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.coffeetable = factory.createTable();
    }

    public void showFurnitures(){
        chair.sentarse();
        sofa.acostarse();
        coffeetable.usar();
    }
}
