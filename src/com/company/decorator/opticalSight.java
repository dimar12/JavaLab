package com.company.decorator;

import com.company.hierarchy.Weapons;

public class opticalSight extends Decorator
{
    Weapons weapon;
    public opticalSight(String name, int price,  Weapons weapon) {
        super(name, price);
        this.weapon = weapon;
    }
    public String description() {
        return weapon.description() + ", с оптическим прицелом";
    }
    public int getPrice(){
        return weapon.getPrice() + 500;
    }
    @Override
    public void setCaliber(double caliber) {

    }

    @Override
    public void setAmmunition(int ammunition) {

    }


}
