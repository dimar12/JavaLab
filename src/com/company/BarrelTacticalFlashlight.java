package com.company;

public class BarrelTacticalFlashlight extends Decorator
{
    Weapons weapon;
    public BarrelTacticalFlashlight(String name, int price,  Weapons weapon) {
        super(name, price);
        this.weapon = weapon;
    }
    public String description() {
        return weapon.description() + ", с подствольным тактическим фонарём";
    }
    public int getPrice(){
        return weapon.getPrice() + 150;
    }
    @Override
    public void setCaliber(double caliber) {

    }

    @Override
    public void setAmmunition(int ammunition) {

    }


}
