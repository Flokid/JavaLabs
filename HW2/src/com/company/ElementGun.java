package com.company;

public class ElementGun <T extends ElementalForce> implements Shootable{
    private T _elementalForce;
    private String gunName;

    public ElementGun(String gName, T _elementalForce){
        this.gunName = gName;
        this._elementalForce = _elementalForce;
    }

    @Override
    public void fire() {
        System.out.printf("%s fire by %s\n", gunName, _elementalForce.getType());
        System.out.printf("%s damage was %d\n", _elementalForce.getType(), _elementalForce.getDamage());
    }

    @Override
    public void cd() {
        System.out.printf("%s  magic cd %s\n", gunName, _elementalForce.getType());
    }
}

