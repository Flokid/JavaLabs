package com.company;

public class MagicSlots <A extends ElementGun<?>, B extends ElementGun<?>, C extends ElementGun<?>>{
    private A mainGun;
    private B secondaryGun;
    private C extendGun;

    public MagicSlots(A mainGun, B secondaryGun, C extendGun){
        this.mainGun = mainGun;
        this.secondaryGun = secondaryGun;
        this.extendGun = extendGun;
    }

    public void fireByMainGun(){
        mainGun.fire();
    }

    public void fireBySecondaryGun(){
        secondaryGun.fire();
    }

    public void fireByExtendGun(){
        extendGun.fire();
    }

    public void cdAllGuns(){
        mainGun.cd();
        secondaryGun.cd();
        extendGun.cd();
    }
}
