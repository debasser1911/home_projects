package Interfaces;

/**
 * Created by debas on 02.05.2017.
 */
public class Person implements Info {

    public String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("Hello, my name is " + name);
    }
}
