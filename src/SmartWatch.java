public class SmartWatch extends Technique {
     private String price;

    public SmartWatch(String name, String brand, String version, String price) {
        super(name, brand, version);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String turnOn(){
        return  getName()+"Куйду";
    }
    public String turnOf(){
        return  getName()+"очту";
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "price='" + price + '\'' +
                '}'+super.toString();
    }
}
