package com.company.iterator;

//класс комнаты
public class Flat {

    private int idFlat;
    private int roomsAmount;
    private int residentAmount;

    public Flat(int idFlat, int roomsAmount, int residentAmount) {
        this.idFlat =  idFlat;
        this.roomsAmount = roomsAmount;
        this.residentAmount = residentAmount;
    }

    public void showInfo() {
        System.out.println("Квартира номер " + idFlat + ": комнат - " + roomsAmount + ", жителей - " + residentAmount);
    }
}
