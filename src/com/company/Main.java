package com.company;

import com.company.decorator.BarrelTacticalFlashlight;
import com.company.decorator.opticalSight;
import com.company.decorator.rifledBarrel;
import com.company.factory.RUSWeaponFactory;
import com.company.factory.USAWeaponFactory;
import com.company.hierarchy.MachineGun;
import com.company.hierarchy.Pistol;
import com.company.hierarchy.Rifle;
import com.company.hierarchy.Weapons;
import com.company.threads.StorageForValue;
import com.company.threads.myThread;
import com.company.threads.myThread2;
import com.company.factory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        StorageForValue storage = new StorageForValue();
        myThread thread1 = new myThread(storage);
        myThread2 thread2 = new myThread2(storage);
        thread1.start();
        System.out.println("thread 1 started");
        thread2.start();
        System.out.println("thread 2 started");
        thread1.join();
        thread2.join();
        System.out.println("end value = " + storage.value);

        RUSWeaponFactory rusFactory = new RUSWeaponFactory();
        USAWeaponFactory usaFactory = new USAWeaponFactory();

        List<Weapons> army = new ArrayList<>();

        Weapons weapon = null;
        weapon = rusFactory.createWeapon(WeaponType.Pistol);
        weapon = new BarrelTacticalFlashlight("0",0,weapon);
        army.add(weapon);
        weapon = usaFactory.createWeapon(WeaponType.Pistol);
        army.add(weapon);
        for (Weapons d : army) {
            d.printDescription();
            d.printPrice();
        }
    }
}

