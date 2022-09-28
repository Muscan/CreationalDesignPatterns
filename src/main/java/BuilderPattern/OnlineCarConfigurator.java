package BuilderPattern;

public class OnlineCarConfigurator {
    private Long id;
    private String carBrand;
    private String carName;
    private Long price;
    private Long discountRate;

    private OnlineCarConfigurator(){

    }

    public static class Builder{
        private Long id;
        private String carBrand;
        private String carName;
        private Long price;
        private Long discountRate;

        public Builder (){

        }
        //this is used here as a reference to the current object
        public Builder withId(Long id){
            this.id = id;
            return this;
        }

        public Builder withCarBrand(String carBrand){
            this.carBrand = carBrand;
            return this;
        }

        public Builder withCarName(String carName){
            this.carName = carName;
            return this;
        }

        public Builder withPrice(Long price){
            this.price = price;
            return this;
        }

        public Builder withDiscountRate(Long discountRate){
            this.discountRate = discountRate;
            return  this;
        }
        //this method returns an OnlineCarConfigurator OBJECT
        public OnlineCarConfigurator build(){
            OnlineCarConfigurator onlineCarConfigurator = new OnlineCarConfigurator();
            //sett attributes to OnlineCarConfigurator with the values from the Builder
            onlineCarConfigurator.id = id;
            onlineCarConfigurator.carBrand = carBrand;
            onlineCarConfigurator.carName = carName;
            onlineCarConfigurator.price = price;
            onlineCarConfigurator.discountRate = discountRate;

            return onlineCarConfigurator;
        }
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCarBrand(){
        return carBrand;
    }

    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }

    public String getCarName(){
        return carName;
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public Long getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public Long getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(Long discountRate){
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "OnlineCarConfigurator{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", carName='" + carName + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                '}';
    }

}

