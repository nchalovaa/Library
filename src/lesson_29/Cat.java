package lesson_29;


    public class Cat extends Animal {

        public Cat(String name, String color) {
            super(name, color);
        }

        @Override
        public void makeSound() {
            System.out.println("Мяу-мяу!"); // указали поведение метода для класса Cat
        }
        @Override
        public void canEat(){
            System.out.println("Кошка ест рыбу");//указали, что кошка может кушать. Поведение метода для класса Cat
        }

        @Override
        public String getDetails() {
            // Я кошка, Name: Том color: Серый
//        String details = super.getDetails();    //details = Name: Том color: Серый
//        String result = "Я кошка, " + details;  // result = Я кошка, Name: Том color: Серый
            String result = "Я кошка, " + "Name: " + super.getName() + " color: " + super.getColor();  // result = Я кошка, Name: Том color: Серый
            return result;
        }

        @Override
        public String getName() {
            return "tram-pam-pam";
        }

        /**
         * Метод, который позволяет кошке лазить по деревьям.
         */
        public void climbTree() {
            System.out.println("Кошка лазит по деревьям.");
        }

        /**
         * Метод, представляющий охотничьи навыки кошки.
         */
        public void hunt() {
            System.out.println("Кошка идет на охоту.");
        }
}
