package com.company;

import com.company.Hero;

public class Warrior extends Hero {
    private int critical_damage;
private String super_ability;

    public Warrior(int damage, int health, int critical_damage, String super_ability) {
        super(damage, health);
        this.critical_damage = critical_damage;
        this.super_ability = super_ability;
    }

    public String getSuper_ability() {
        return super_ability;
    }

    public int getCritical_damage() {
        return critical_damage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(super_ability+critical_damage);
    }

}
