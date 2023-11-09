package task2;

public class Mother {
    private String name;
    private int age;
    private String eyecolor;

    public Mother(String name,int age, String eyecolor) {
        this.name = name;
        this.age = age;
        this.eyecolor = eyecolor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyecolor='" + eyecolor + '\'' +
                '}'+super.toString();
    }
}
