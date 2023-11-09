package task2;

public class Daughter extends  Mother {
    private String haircolor;
    private int height;

    public Daughter(String name, int age, String eyecolor, String haircolor) {
        super(name, age, eyecolor);
        this.haircolor = haircolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Daughter{" +
                "haircolor='" + haircolor + '\'' +
                ", height=" + height +
                '}'+super.toString();
    }
}
