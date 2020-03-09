package com.company;

public class Rifle extends Gunshot{
    public  Rifle(String name, int price, double caliber, int ammunition){
        super(name, price, caliber, ammunition);
    }
    public String description() {
        return "Винтовка, модель: " + getName() + ", цена: " + getPrice() + ", калибр: " + getCaliber() +  ", боезапас: " + getAmmunition();
    }
}
