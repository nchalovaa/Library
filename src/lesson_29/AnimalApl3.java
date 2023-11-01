package lesson_29;

public abstract class AnimalApl3 {

    public static void main(String[] args) {

        Animal animalDog = new Dog("Снежок", "Черный");
        Animal animalCat = new Cat("Том", "Серый");
        animalCat.canEat();
        animalCat.makeSound();
        animalDog.canEat();
        animalDog.makeSound();


        System.out.println("animalDog: " + animalDog.getName());
        System.out.println("animalCat: " + animalCat.getName());

        System.out.println();
        System.out.println("animalDog: " + animalDog.getDetails());
        System.out.println("animalCat: " + animalCat.getDetails());


        if (animalCat instanceof Cat) {
            Cat cat = (Cat) animalCat;
            cat.hunt();

            String name = ((Cat) animalCat).getName();
        }
    }
}
