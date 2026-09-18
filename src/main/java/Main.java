import abstractfactory.*;
import factorymethod.BootsFactory;
import factorymethod.FootwearFactory;
import factorymethod.IFootwear;
import factorymethod.SneakersFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Factory Method---");
        FootwearFactory factory1=new SneakersFactory();
        IFootwear item1=factory1.createFootwear();
        item1.create();

        FootwearFactory factory2=new BootsFactory();
        IFootwear item2=factory2.createFootwear();
        item2.create();

        System.out.println();
        System.out.println("---Abstract Factory---");

        IFashionFactory sportStyle=new SportFactory();
        IShoe sportShoe=sportStyle.createShoe();
        IOuterwear sportOuter=sportStyle.createOuterwear();
        System.out.println("Sport Collection: ");
        sportShoe.wearShoe();
        sportOuter.wearOuterwear();
        System.out.println();

        IFashionFactory classicStyle=new ClassicFactory();
        IShoe classicShoe=classicStyle.createShoe();
        IOuterwear classicOuter=classicStyle.createOuterwear();
        System.out.println("Classic Collection: ");
        classicShoe.wearShoe();
        classicOuter.wearOuterwear();
    }
}
