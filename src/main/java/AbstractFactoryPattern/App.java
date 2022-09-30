package AbstractFactoryPattern;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(true);

        Computer laptopObj = factory.getComputer("Laptop");
        Computer phoneObj = factory.getComputer("Phone");
        Computer smartTvObj = factory.getComputer("SmartTv");
        laptopObj.compute();
        phoneObj.compute();
        //smartTvObj.compute(); --if this would be run, NullPoint Exception will be thworn.
        //Because smartTvObj is not a portableComputer.

        AbstractFactory factoryFalse = FactoryProducer.getFactory(false);

        Computer laptopObj2 = factoryFalse.getComputer("Laptop");
        Computer phoneObj2 = factoryFalse.getComputer("Phone");
        Computer smartTvObj2 = factoryFalse.getComputer("SmartTv");
        laptopObj2.compute();
        phoneObj2.compute();
        smartTvObj2.compute();
    }

}

