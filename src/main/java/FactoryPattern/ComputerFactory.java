package FactoryPattern;

public class ComputerFactory {
    public Computer getComputer(String objectWeWantToReturn){
        if(objectWeWantToReturn.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(objectWeWantToReturn.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        else if(objectWeWantToReturn.equalsIgnoreCase("SmartTv")){
            return new SmartTv();
        }
        System.out.println("None of the cases matches");
        return null;
    }
}
