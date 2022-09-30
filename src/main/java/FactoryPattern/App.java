package FactoryPattern;

public class App {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer laptopObj = computerFactory.getComputer("Laptop");
        Computer phoneObj = computerFactory.getComputer("Phone");
        Computer smartTvObj = computerFactory.getComputer("SmartTv");
        laptopObj.compute();
        phoneObj.compute();
        smartTvObj.compute();
    }

}
