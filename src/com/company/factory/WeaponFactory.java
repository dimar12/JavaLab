package com.company.factory;

import com.company.hierarchy.Weapons;

public abstract class WeaponFactory {

    protected abstract Weapons createWeapon(WeaponType type);


}
