package com.company;

public abstract class Weapons {
    private String name;
    private int price;

    public Weapons(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void printPrice(){
        System.out.println("Цена: " +getPrice());
    }
    public String description() {
        return "Модель: " + name;
    }
    public void printDescription()
    {
        System.out.println(description());
    }

    public abstract void setCaliber(double caliber);

    public abstract void setAmmunition(int ammunition);
}
