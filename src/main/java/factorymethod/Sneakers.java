package factorymethod;

public class Sneakers implements IFootwear {
    @Override
    public void create() {
        System.out.println("Created casual sneakers.");
    }
}
