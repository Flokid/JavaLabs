package com.company;

public class Freeze implements ElementalForce{
    private int dmg = 48;
    private final String name = "freeze element";
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
