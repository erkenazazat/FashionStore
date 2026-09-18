package abstractfactory;

public class ClassicShoes implements IShoe {
    @Override
    public void wearShoe() {
        System.out.println("Wearing classic oxford shoes.");
    }
}
