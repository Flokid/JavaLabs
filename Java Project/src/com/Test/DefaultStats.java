package com.Test;

public class DefaultStats extends GameObject {
    private int Hp;
    private int Def;
    private int APS;
    DefaultStats(String Name,int Lvl, int Hp,int Def, int APS){
        super(Name,Lvl);
        this.Hp=Hp;
        this.Def=Def;
        this.APS=APS;
    }
    public int GetHp(){
        return Hp;
    }
    public int  GetDef(){
        return Def;
    }
    public int GetAPS(){
        return APS;
    }
}



