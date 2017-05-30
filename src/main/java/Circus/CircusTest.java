package Circus;

import java.io.IOException;

/**
 * Created by DeBasser on 28.05.2017.
 */
public class CircusTest {
    public static void main(String[] args) throws IOException {
        Circus circus = new Circus();
        Acrobat a1 = new Acrobat("Bob", "Fisher");
        circus.hireArtist(a1);
        Acrobat a2 = new Acrobat("Tom", "Taylor");
        circus.hireArtist(a2);
        RopeWalker r1 = new RopeWalker("RopeWalker_1_name", "RopeWalker_1_surName");
        circus.hireArtist(r1);
        RopeWalker r2 = new RopeWalker("RopeWalker_2_name", "RopeWalker_2_surName");
        circus.hireArtist(r2);
        Acrobat a3 = new Acrobat("Acrobat_3_name", "Acrobat_3_surName");
        circus.hireArtist(a3);
        RopeWalker r3 = new RopeWalker("RopeWalker_3_name", "RopeWalker_3_surName");
/*        circus.hireArtist(r3);
        circus.performAllArtists();

        circus.paySalary();*/

/*        System.out.println(circus.showArtists());

        //test hireArtist method
        int expected1 = 6;
        int actual1 = circus.getSize();
        System.out.format("Method hireArtist - %s, expected - %d, actual - %d\n\n", expected1 == actual1, expected1, actual1);*/

circus.showMenu(circus);


    }
}
