package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform task");
        features.add("Shut down");

        Components components = new Components();
        components.setName("Infrared Goggles");
        components.setFunctionality("Red temperature of objects");

        //two robot objects, different stack addresses
        Robot robot = new Robot(1, features, components);
        System.out.println(robot);
        Robot anotherRobot = robot.clone();
        System.out.println(anotherRobot);

        System.out.println(robot.getComponents());
        System.out.println(anotherRobot.getComponents());


    }
}
