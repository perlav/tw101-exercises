package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by PerlaIvetteVillarreal on 9/11/15.
 */

// * Trolls are named “Troll”, have 40 hit points and only take half damage
public class Troll implements Monster {
    private final String name = "Troll";
    private int hitpoints = 40;

    public void takeDamage(int amount) {
        hitpoints -= amount/2;
    }
    public void reportStatus() {
        System.out.println("Name of Monster: " + name);
        System.out.println("Current HitPoints: " + hitpoints);
    }
}
