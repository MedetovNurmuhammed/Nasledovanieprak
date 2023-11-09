package task3;

public class Rycari extends Spartansy {
    private int age;
    private String uibuloo;

    public Rycari(String name, int count, int age, String uibuloo) {
        super(name, count);
        this.age = age;
        this.uibuloo = uibuloo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUibuloo() {
        return uibuloo;
    }

    public void setUibuloo(String uibuloo) {
        this.uibuloo = uibuloo;
    }
    public  String ryc(){
        return "Уй булоолук абалы:"+uibuloo+", Жашы: "+ age;
    }

    @Override
    public String toString() {
        return "Rycari{" +
                "age=" + age +
                ", uibuloo='" + uibuloo + '\'' +
                '}'+super.toString();
    }
}
