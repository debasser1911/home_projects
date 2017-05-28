package Circus;

/**
 * Created by DeBasser on 11.05.2017.
 */
public class Acrobat extends Artist implements Perform {

    public Acrobat(String name, String surName) {
        super(name, surName);
        extraBonusForRisk = 1.5;
    }

    //todo acl amount


    @Override
    public void perform() {
        System.out.println("I'm a acrobat, and i'm performing some acrobat stunts.");
        this.numOfPerformances++;
    }
}
