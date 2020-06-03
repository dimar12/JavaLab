package com.company.factory;
import com.company.hierarchy.*;

public class USAWeaponFactory extends WeaponFactory {



    @Override
    public Weapons createWeapon(WeaponType type) {
        Weapons weapon = null;
        switch(type) {
            case Pistol:
                weapon = new Pistol("USA Pistol", 500, 9.5, 9);
                break;
            case MachineGun:
                weapon = new MachineGun("USA MachineGun", 1500, 12, 30, 120);
                break;
            case Rifle:
                weapon = new Rifle("USA Rifle", 1000, 15, 10);
                break;
        }
        return weapon;
    }
}
