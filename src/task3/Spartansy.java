package task3;

public class Spartansy {
    private String name;
    private int count;

    public Spartansy(String name,int count) {
        this.name = name;
        this.count = count;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String info(){
        return "Имя: "+name+", "+ "количество: "+ count;
    }

    @Override
    public String toString() {
        return "Spartansy{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
