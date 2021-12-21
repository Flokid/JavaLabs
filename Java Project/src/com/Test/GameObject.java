package com.Test;

public class GameObject {
    private String Name;
    private int Lvl;
    public  GameObject(String Name, int Lvl){
        this.Name=Name;
        this.Lvl=Lvl;
    }
    public String GetName(){
        return Name;
    }
    public int GetLvl(){
        return Lvl;
    }
}
