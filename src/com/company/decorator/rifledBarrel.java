package com.company.decorator;

import com.company.hierarchy.Weapons;

public class rifledBarrel extends Decorator
{
    Weapons weapon;
    public rifledBarrel(String name, int price,  Weapons weapon) {
        super(name, price);
        this.weapon = weapon;
    }
    public String description() {
        return weapon.description() + ", с нарезным стволом";
    }
    public int getPrice(){
        return weapon.getPrice() + 300;
    }
    @Override
    public void setCaliber(double caliber) {

    }

    @Override
    public void setAmmunition(int ammunition) {

    }


}
