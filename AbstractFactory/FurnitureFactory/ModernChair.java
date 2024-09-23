package AbstractFactory.FurnitureFactory;

public class ModernChair implements IChair{
    @Override
    public void sentarse(){
        System.out.println("Estás sentado en una silla moderna");
    }
}
