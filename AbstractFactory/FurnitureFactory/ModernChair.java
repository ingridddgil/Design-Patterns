package AbstractFactory.FurnitureFactory;

public class ModernChair implements IChair{
    @Override
    public void sitOn(){
        System.out.println("I'm sitting on a modern chair");
    }
}
