// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          Phone phone1 = new Phone("Samsung","jjj","j1","20x40");
        System.out.println("phone = " + phone1);
        Technique technique = new Technique("Машина","BMW","Х5");
        System.out.println("phone1.turnOn() = " + phone1.turnOn());
        System.out.println("phone1.turnOf() = " + phone1.turnOf());

        System.out.println("--------------------------------");
        System.out.println("technique.turnOn() = " + technique.turnOn());
        System.out.println("technique.turnOf() = " + technique.turnOf());
        System.out.println("--------------------------------------");
        Computer computer = new Computer("Asus","м5","l","25Х45");
        System.out.println("comp: " +computer);
        System.out.println("computer.turnOn() = " + computer.turnOn());
        System.out.println("computer.turnOf() = " + computer.turnOf());
        System.out.println("----------------------------");
        SmartWatch smartWatch = new SmartWatch("Apple","ооо","77","7800");
        System.out.println("smart watch: " + smartWatch);
        System.out.println("smartWatch.turnOn() = " + smartWatch.turnOn());
        System.out.println("smartWatch.turnOf() = " + smartWatch.turnOf());
    }
    }
