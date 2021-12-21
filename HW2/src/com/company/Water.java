package com.company;

public class Water implements ElementalForce {
    private int dmg = 70;
    private final String name = "water element";
    @Override
    public int getDamage() {
        return this.dmg;
    }

    @Override
    public void upgDamage(int value) {
        this.dmg = value;
    }

    @Override
    public String getType() {
        return this.name;
    }
}
