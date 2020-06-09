package com.company.builder;

import com.company.factory.RUSWeaponFactory;
import com.company.factory.WeaponType;
import com.company.hierarchy.MachineGun;
import com.company.hierarchy.Pistol;
import com.company.hierarchy.Rifle;

public class BuilderMain {
    public static void main(String[] args) {
        RUSWeaponFactory rusFactory = new RUSWeaponFactory();
        Platoon platoon1 = new Platoon.Builder()
                .withName("Alfa")
                .withMachineGun((MachineGun) rusFactory.createWeapon(WeaponType.MachineGun))
                .build();
        Platoon platoon2 = new Platoon.Builder()
                .withName("Beta")
                .withPistol((Pistol) rusFactory.createWeapon(WeaponType.Pistol))
                .withRifle((Rifle) rusFactory.createWeapon(WeaponType.Rifle))
                .build();
        platoon1.showInfo();
        platoon2.showInfo();
    }
}
