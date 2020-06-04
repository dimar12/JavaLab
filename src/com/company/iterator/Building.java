package com.company.iterator;

import com.company.iterator.floors.FirstFloor;
import com.company.iterator.floors.SecondFloor;
import com.company.iterator.floors.ThirdFloor;
import com.company.iterator.iterators.Iterator;

public class Building {

    private String street;
    private int idBuilding;

    private FirstFloor firstFloor;
    private SecondFloor secondFloor;
    private ThirdFloor thirdFloor;

    public Building(String street, int idBuilding, FirstFloor firstFloor, SecondFloor secondFloor, ThirdFloor thirdFloor) {
        this.street = street;
        this.idBuilding = idBuilding;
        this.firstFloor = firstFloor;
        this.secondFloor = secondFloor;
        this.thirdFloor = thirdFloor;
    }

    public void showInfo() {
        System.out.println("Ул." + street + " д." + idBuilding + ";");
        System.out.println("Информация о квартирах в доме:");
        System.out.println("Первый этаж:");
        showFloorInfo(firstFloor.createIterator());
        System.out.println("Второй этаж:");
        showFloorInfo(secondFloor.createIterator());
        System.out.println("Третий этаж:");
        showFloorInfo(thirdFloor.createIterator());
    }

    private void showFloorInfo(Iterator iterator) {
        while (iterator.hasNext()) {
            Flat flat = (Flat) iterator.next();
            flat.showInfo();
        }
    }

}
