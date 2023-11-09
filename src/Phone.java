public class Phone extends  Technique{
    private String screen;

    public Phone(String name, String brand, String version, String screen) {
        super(name, brand, version);
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
    public String turnOn(){
        return  getName()+"Куйду";
    }
    public String turnOf(){
        return  getName()+"очту";
}

    @Override
    public String toString() {
        return "Phone{" +
                "screen='" + screen + '\'' +
                '}'+super.toString();
    }
}
