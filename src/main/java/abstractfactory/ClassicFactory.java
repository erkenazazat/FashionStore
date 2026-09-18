package abstractfactory;

public class ClassicFactory implements IFashionFactory {
    @Override
    public IShoe createShoe() {
        return new ClassicShoes();
    }
    @Override
    public IOuterwear createOuterwear() {
        return new ClassicOuterwear();
    }
}
