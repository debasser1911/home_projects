/**
 * Created by DeBasser on 05.06.2017.
 */
public class TimeTest {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

}
