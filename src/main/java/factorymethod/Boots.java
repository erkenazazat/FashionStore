package factorymethod;

public class Boots implements IFootwear {
    @Override
    public void create() {
        System.out.println("Created leather boots.");
    }
}
