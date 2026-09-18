package factorymethod;

public class SneakersFactory extends FootwearFactory{
    @Override
    public IFootwear createFootwear() {
        return new Sneakers();
    }
}
