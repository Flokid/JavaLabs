package com.company;

public class Efir implements ElementalForce{
    private int dmg = 23;
    private final String name = "efir element";
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
