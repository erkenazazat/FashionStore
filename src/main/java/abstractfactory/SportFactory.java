package abstractfactory;

public class SportFactory implements IFashionFactory {
    @Override
    public IShoe createShoe() {
        return new SportShoes();
    }
    @Override
    public IOuterwear createOuterwear() {
        return new SportOuterwear();
    }
}
