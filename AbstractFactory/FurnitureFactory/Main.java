package AbstractFactory.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        IFactoryAbstract factory = new ArtDecoFactory();
        FurnitureStore store = new FurnitureStore(factory);
        store.showFurnitures();
    }
}
