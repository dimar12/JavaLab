package com.company.decorator;

import com.company.hierarchy.Weapons;

public class bayonetKnife extends Decorator
{
    Weapons weapon;
    public bayonetKnife(String name, int price,  Weapons weapon) {
        super(name, price);
        this.weapon = weapon;
    }
    public String description() {
        return weapon.description() + ", с штык-ножом";
    }
    public int getPrice(){
        return weapon.getPrice() + 200;
    }
    @Override
    public void setCaliber(double caliber) {

    }

    @Override
    public void setAmmunition(int ammunition) {

    }


}
