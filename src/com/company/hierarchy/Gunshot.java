package com.company.hierarchy;

public class Gunshot extends Weapons{
    private double caliber;
    private int ammunition;
    public Gunshot(String name, int price, double caliber,int ammunition){
        super(name, price);
        this.caliber = caliber;
        this.ammunition = ammunition;
    }
    public  void setCaliber(double caliber){
        this.caliber = caliber;
    }
    public  void setAmmunition( int ammunition){
        this.ammunition = ammunition;
    }
    public int getAmmunition(){
        return ammunition;
    }
    public double getCaliber(){
        return caliber;
    }
    public String description() {
        return "Модель: " + getName() + ", калибр: " + caliber +  ", боезапас: " + ammunition;
    }
}
