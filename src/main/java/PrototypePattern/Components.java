package PrototypePattern;

public class Components {
    private String name;
    private String functionality;

    public Components(String name, String functionality){
        this.name = name;
        this.functionality = functionality;
    }

    public Components(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }
}
