package com.company;

public class Medic extends Hero  {
    private int healpoints;
    private String superability;

    public int getHealpoints() {
        return healpoints;
    }

    public Medic(int damage, int health, int healpoints, String superability) {
        super(damage, health);
        this.healpoints = healpoints;
        this.superability = superability;
    }

    public String getSuperability() {
        return superability;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(superability+healpoints);
    }
}
