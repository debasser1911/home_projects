package Interfaces;

/**
 * Created by debas on 02.05.2017.
 */
public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("My ID is - " + id);
    }

}