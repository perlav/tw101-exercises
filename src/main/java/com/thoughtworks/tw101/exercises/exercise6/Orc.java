package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by PerlaIvetteVillarreal on 9/11/15.
 */

// * Orcs are named “Orc” and have 20 initial hitpoints
public class Orc implements Monster {
    private final String name = "Orc";
    private int hitpoints = 20;

    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    public void reportStatus() {
        System.out.println("Name of Monster: " + name);
        System.out.println("Current HitPoints: " + hitpoints);
    }
}
