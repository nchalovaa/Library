package lesson_29;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }
        @Override // переопределили метод супер класса
        public void makeSound () { // переопределили метод супер класса
            System.out.println("Гав-гав!");  // указали поведение метода для класса Dog
        }
        @Override
        public void canEat(){
            System.out.println("Собачка может кушать кость");
        }

        /**
         * Метод, который позволяет собаке вернуть мяч после его броска
         */
        public void fetchBall () {
            System.out.println("Собака принесла мяч");
        }

        /**
         * Метод, который представляет действие охраны дома
         */
        public void guardHouse () {
            System.out.println("Собака охраняет дом");
        }
    }
