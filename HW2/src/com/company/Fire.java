package com.company;

public class Fire implements ElementalForce{
    private int dmg = 50;
    private final String name = "fire element";
    @Override
    public int getDamage() {
        return this.dmg;
    }

    @Override
    public void upgDamage(int value) {
        this.dmg=value;
    }

    @Override
    public String getType() {
        return this.name;
    }
}
