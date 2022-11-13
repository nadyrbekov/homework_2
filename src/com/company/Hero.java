package com.company;

import com.company.Printable;

public class Hero implements Printable {

    private int  damage;
    private int health;



    public int getHealth() {
        return health;
    }

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void print() {
        System.out.println("Damage"+ damage+"health"+health);
    }
}
