package task3;

public class Luchniki extends  Spartansy{
    private String surname;
    private String zvanie;

    public Luchniki(String name, int count, String surname,String zvanie) {
        super(name, count);
        this.surname = surname;
        this.zvanie = zvanie;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }
    public String luch(){
        return "Фамилия: "+ surname+", Звание: "+ zvanie;
    }

    @Override
    public String toString() {
        return "Luchniki{" +
                "surname='" + surname + '\'' +
                ", zvanie='" + zvanie + '\'' +
                '}'+super.toString();
    }
}
