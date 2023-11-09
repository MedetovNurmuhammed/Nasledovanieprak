public class Technique {
    private  String name;
    private String brand;
    private String version;

    public Technique(String name,String brand,String version) {
        this.name = name;
        this.version = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String turnOn(){
        return  this.name+"Куйду";
    }
    public String turnOf(){
        return  this.name+"очту";
}

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
