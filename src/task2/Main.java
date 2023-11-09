package task2;

public class Main {
    public static void main(String[] args) {

    //Создайте класс Mother с
    //полями(name, age, eye color) и метод
    //getName(); возвращает "name + this is
    //mother". Создайте класс Daughter c
    //полем(hair color, heigh) класс должен
    //наследоваться от класса Mother и
    //должен переопределять его метод
    //и при его вызове возвращать "this
    //is daughter".
    //В main создайте по 2 объекта
    //каждого класса. Вызовите методы
    Mother mother  = new Mother("Айнура",45,"Черный");
    Mother mother1 = new Mother("Асел",54,"Курон");
        System.out.println("mother1 = " + mother1);
        System.out.println("mother = " + mother);
        Daughter daughter = new Daughter("Айзат",20,"Черный","черный");
        Daughter daughter1 = new Daughter("Айпери",20,"Черный","черный");
        System.out.println("daughter = " + daughter);
        System.out.println("daughter = " + daughter1);}}

