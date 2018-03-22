package Circus;


import java.io.IOException;

/**
 * Created by DeBasser on 28.05.2017.
 */
public class CircusTest {
    public static void main(String[] args) throws IOException {
        Circus circus = new Circus();
        Acrobat a1 = new Acrobat("Вася", "Пупкин");
        circus.hireArtist(a1);
        Acrobat a2 = new Acrobat("Егор", "Сидоров");
        circus.hireArtist(a2);
        RopeWalker r1 = new RopeWalker("Вася", "Жопин");
        circus.hireArtist(r1);
        RopeWalker r2 = new RopeWalker("Петя", "Мухин");
        circus.hireArtist(r2);
        Acrobat a3 = new Acrobat("Лера", "Жопина");
        circus.hireArtist(a3);
        RopeWalker r3 = new RopeWalker("Сёмен", "Петров");


circus.showMenu(circus);


    }
}
