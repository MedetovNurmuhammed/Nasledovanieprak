package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //спартанцы деген класс тузунуз,
        //анын лучники,рыцари, всадники, философы
        //деген сабкласстары болсун,
        //ар кимдин ар кандай 2 ден полялары болсун,
        //жана 2 ден методдору болсун,
        //спартанцы классында баарына тиешелуу name,
        //count деген полялары анан 1 метод
        //болсун(любой метод), баарын консольго
        //чыгаргыла.
        //count менен сортировка кылган метод тузунуз
        //main deп
        Spartansy spartansy = new Spartansy("Спартанцы", 1000);
        System.out.println( spartansy.info());
        Filosofy filosofy = new Filosofy("Философы", 150, "черный", "черный");
        System.out.println( filosofy.info() + " " + filosofy.color());
        Vsadniki vsadniki = new Vsadniki("Всадники", 500, 89, 185);
        System.out.println( vsadniki.info() + ", " + vsadniki.rostves());
        Rycari rycari = new Rycari("Рыцари", 800, 25, "Бойдок");
        System.out.println( rycari.info() + " ," + rycari.ryc());
        Luchniki luchniki = new Luchniki("Лучники", 678, "Медетов", "Профи");
        System.out.println(luchniki.info() + luchniki.luch());
        Spartansy[] massive = {spartansy, filosofy, vsadniki, rycari, luchniki};


        count(massive);

    }


    public static void count(Spartansy[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length -1; j++) {
                if (mass[j].getCount() > mass[j + 1].getCount()) {
                    Spartansy nnn = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = nnn;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }


}

