package PrototypePattern;

import java.util.List;

public class Robot implements Cloneable{

    private int ID;
    private List<String> features;
    private Components components;

    public Robot(int ID, List<String> features, Components components) {
        this.ID = ID;
        this.features = features;
        this.components = components;

    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public int getID() {
        return ID;
    }

    public List<String> getFeatures() {
        return features;
    }

    public Components getComponents() {
        return components;
    }

    public Robot clone(){
        try{
            return (Robot) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }


}
