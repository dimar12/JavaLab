package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Weapons pistol = new Pistol("fd1", 2000,9.5,12);
        Weapons avtomat = new MachineGun("fd2", 4000,39,30,100);
        Weapons vintovka = new Rifle("fd3", 1500,50,5);
        pistol = new rifledBarrel("0",0,pistol);
        pistol = new opticalSight("0",0,pistol);
        avtomat = new rifledBarrel("0",0,avtomat);
        avtomat = new BarrelTacticalFlashlight("0",0,avtomat);
        List<Weapons> army = Arrays.asList(pistol, avtomat, vintovka);
        for (Weapons d : army) {
            d.printDescription();
            d.printPrice();
        }
    }
}

