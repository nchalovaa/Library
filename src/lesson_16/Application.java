package lesson_16;

public class Application {

    public static void main(String[] args) {
//        Planet planetMars = new Planet("Mars", 500);
//        Planet planetEarth = new Planet("Earth", 200);
//        Planet planetJupiter = new Planet("Jupiter", 400);
//
//        System.out.println(planetMars.getName()); // Mars
//        System.out.println(planetEarth.getName()); // Earth
//        System.out.println(planetJupiter.getName()); // Jupiter
//
//        planetMars.setName("ABC");
//        System.out.println();
//        System.out.println(planetMars.getName()); // ABC
//        System.out.println(planetEarth.getName()); // Earth
//        System.out.println(planetJupiter.getName()); // Jupiter
//
//        planetMars.setName("Mars");
//        System.out.println();
//        System.out.println(planetMars.getName()); // Mars
//        System.out.println(planetEarth.getName()); // Earth
//        System.out.println(planetJupiter.getName()); // Jupiter
//
//        System.out.println();
//        System.out.println("Имя планеты " + planetJupiter.getName() + ", размер: " + planetJupiter.getSize()); // Mars
//
//        System.out.println();
//        planetJupiter.printDetails();
//        planetEarth.printDetails();
//        planetMars.printDetails();

        // пример с классом Car
     /*   Car bwm = new Car("BMW", "Black", 250.0, "disel"); // создание новго объекта типа Car
        bwm.drive(); // начать движение машины BMW
        bwm.stop(); // отсановить BMW

        System.out.println();

        Car vw = new Car("VW", "White", 100.0, "disel"); // создание новго объекта типа Car
        vw.drive(); // начать движение VW
        vw.stop(); // отсановить VW

        System.out.println();

        Car ford = new Car("Ford", "Green", 160.0, "disel"); // создание новго объекта типа Car
        ford.drive(); // начать движение Frod
        ford.stop(); // отсановить Frod */


       User anastasiia = new User ("Anastasiia", 30, "nchalova93");
      anastasiia.printUser();
      User andrej = new User ("Vasya", 35, "vasya35");
      andrej.printUser();
      andrej.setName("Andrej");
      andrej.printUser();

        System.out.println(andrej.getName());

      //  hw_book HwObject = new hw_book("Team Topologies", "Matthew Skelton", 2021 ,"9781942788829" );
        // HwObject.printHwBook();


    }
}

