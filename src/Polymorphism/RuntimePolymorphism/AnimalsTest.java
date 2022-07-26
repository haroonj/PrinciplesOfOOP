package Polymorphism.RuntimePolymorphism;

public class AnimalsTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Dog();
        animal.makeSound();
    }
}
