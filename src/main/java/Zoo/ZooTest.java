package Zoo;

import java.util.ArrayList;

/**
 * Created by debas on 02.05.2017.
 */
public class ZooTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Adolf");
        Zebra zebra = new Zebra("Mark");
        Lion lion = new Lion("Leo");

        ArrayList al = new ArrayList();
        al.add(tiger);
        al.add(zebra);
        al.add(lion);

        if(!al.isEmpty()){
            System.out.println(al.toString());
        }

        tiger.sayHello();
        zebra.sayHello();
        lion.sayHello();
    }


}
