package task3;

public class Vsadniki extends Spartansy {
    public int height;
    public int weight;

    public Vsadniki(String name, int count, int weight,int height) {
        super(name, count);
        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String rostves(){
        return "Вес: "+weight+"," +" Рост: "+ height;
}

    @Override
    public String toString() {
        return "Vsadniki{" +
                "height=" + height +
                ", weight=" + weight +
                '}'+super.toString();
    }
}
