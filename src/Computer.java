public class Computer extends Technique{
    private  String monitor;

    public Computer(String name, String brand, String version, String monitor) {
        super(name, brand, version);
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String turnOn(){
        return  getName()+"Куйду";
    }
    public String turnOf(){
        return  getName()+"очту";
    }

    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\'' +
                '}'+super.toString();
    }
}
