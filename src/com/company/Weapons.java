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
    public String description() {
        return "Модель: " + name + ", цена: " + price;
    }
    public void printDescription()
    {
        System.out.println(description());
    }
}
