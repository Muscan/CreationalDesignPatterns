package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<OnlineCarConfigurator> onlineCarConfiguratorList = new ArrayList<>();
        OnlineCarConfigurator onlineCarConfigurator = new OnlineCarConfigurator.Builder()
                .withId(1L)
                .withCarBrand("VW")
                .withCarName("Corrado")
                .withPrice(1000L)
                .withDiscountRate(10L)
                .build();

        OnlineCarConfigurator onlineCarConfigurator1 = new OnlineCarConfigurator.Builder()
                .withId(1L)
                .withCarBrand("VW2")
                .withCarName("Corrado2")
                .withPrice(1000L)
                .withDiscountRate(10L)
                //by using method build, it creates the object onlineCarConfigurator
                .build();


        onlineCarConfiguratorList.add(onlineCarConfigurator);
        onlineCarConfiguratorList.add(onlineCarConfigurator1);
        //check if the object exists
        System.out.println(onlineCarConfiguratorList.contains(onlineCarConfigurator));

        System.out.println(onlineCarConfigurator1.getCarBrand().equals("VW"));


        onlineCarConfigurator.setCarBrand("Volvo");
        System.out.println(onlineCarConfigurator.getCarBrand());

    }

}
