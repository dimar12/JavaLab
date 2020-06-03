package com.company.factory;

import com.company.hierarchy.MachineGun;
import com.company.hierarchy.Pistol;
import com.company.hierarchy.Rifle;
import com.company.hierarchy.Weapons;

public class RUSWeaponFactory extends WeaponFactory{

    @Override
    public Weapons createWeapon(WeaponType type) {
        Weapons weapon = null;
        switch(type) {
            case Pistol:
                weapon = new Pistol("RUS Pistol", 350, 9.5, 12);
                break;
            case MachineGun:
                weapon = new MachineGun("RUS MachineGun", 1000, 49, 30, 90);
                break;
            case Rifle:
                weapon = new Rifle("RUS Rifle", 750, 20, 12);
                break;
        }
        return weapon;
    }
}
