package task3;

public class Filosofy extends  Spartansy {
    private  String haircolor;
    private String eyecolor;

    public Filosofy(String name, int count, String eyecolor,String haircolor) {
        super(name, count);
        this.eyecolor = eyecolor;
        this.haircolor = haircolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    public String color(){
        return "Чачынын ону: "+ haircolor+" Козунун ону: "+ eyecolor;
    }

    @Override
    public String toString() {
        return "Filosofy{" +
                "haircolor='" + haircolor + '\'' +
                ", eyecolor='" + eyecolor + '\'' +
                '}'+super.toString();
    }
}
