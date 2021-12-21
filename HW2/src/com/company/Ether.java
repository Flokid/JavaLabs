package com.company;

public class Ether implements ElementalForce{
    private int dmg = 68;
    private final String name = "ether element";
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
