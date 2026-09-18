package factorymethod;

public class BootsFactory extends FootwearFactory {
    @Override
    public IFootwear createFootwear() {
        return new Boots();
    }
}
