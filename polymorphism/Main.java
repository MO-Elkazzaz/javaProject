package polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();

        Animal animal1 = new Pig();
        animal1.makeSound();

    }
}
