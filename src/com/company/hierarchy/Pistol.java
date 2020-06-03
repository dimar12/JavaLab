package com.company.hierarchy;

public class Pistol extends Gunshot{
    public  Pistol(String name, int price,double caliber,int ammunition){
        super(name, price,caliber,ammunition);
    }
    public String description() {
        return "Пистолет, модель: " + getName() + ", калибр: " + getCaliber() +  ", боезапас: " + getAmmunition();
    }
}
