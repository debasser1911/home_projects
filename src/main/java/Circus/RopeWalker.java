package Circus;

/**
 * Created by DeBasser on 11.05.2017.
 */
public class RopeWalker extends Artist{
    public RopeWalker(String name, String surName) {
        super(name, surName);
        extraBonusForRisk = 1.3;
    }


    @Override
    public void perform() {
        System.out.println("I'm a rope walker, and i'm performing now");
        this.numOfPerformances++;
    }
}
