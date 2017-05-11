package Zoo;

/**
 * Created by DeBasser on 02.05.2017.
 */
public class Animal {
    private String name;
    private int age;
    private String color;


    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void sayHello(){
        System.out.println("Hello! My name is " + name);
    }
}
