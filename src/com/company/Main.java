package com.company;

public class Main {
    public static void main(String[] args) {
        Weapons pistol = new Pistol("fd1", 2000, 4.5, 9);
        Weapons avtomat = new MachineGun("fd2", 4000, 9.5, 30, 100);
        Weapons vintovka = new Rifle("fd3", 1500, 12, 5);
        pistol.printDescription();
        avtomat.printDescription();
        vintovka.printDescription();
    }
}

