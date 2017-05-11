package Polimorph;

/**
 * Created by debas on 02.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        Animal dog = new Dog();
        dog.eat();
        dog.bark();
        Dog dog1 = new Dog();
        dog1.bark();
    }
}
