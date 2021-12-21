package com.company;

public class Air implements ElementalForce{
    private int dmg = 15;
    private final String name = "air element";
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
