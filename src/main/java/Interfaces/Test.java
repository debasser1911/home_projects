package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by debas on 02.05.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outInfo(animal1);

    }

    public static void outInfo(Info info) {
        info.showInfo();
    }


}
