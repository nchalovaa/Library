package lesson_20.task1.Animal;

public class AnimalApl {

    public static void main(String[] ards){

            Animal animal = new Animal();
            Dog dog = new Dog();
            Cat cat = new Cat();


            animal.makeSound(); // Вывод: Животное издает звук, не понятно какой именно!
            // т.к. тип и фактический тип Animal берется реализация метода makeSound() из классе Animal

            dog.makeSound(); // Вывод: Гав-гав!
            // т.к. тип и фактический тип Dog берется реализация метода makeSound() из классе Dog

            cat.makeSound();// Вывод: Мяу-мяу!
            // т.к. тип и фактический тип Cat берется реализация метода makeSound() из классе Cat
        }

    }

