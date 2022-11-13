package com.company;

import com.company.Hero;

public class Magic extends Hero {
    private int boost_damage;
    private String super_ability;

    public String getSuper_ability() {
        return super_ability;
    }

    public Magic(int damage, int health, int boost_damage,String super_ability) {
        super(damage, health);
        this.boost_damage = boost_damage;
        this.super_ability=super_ability;
    }

    public int getBoost_damage() {
        return boost_damage;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(super_ability+boost_damage);
    }
}
