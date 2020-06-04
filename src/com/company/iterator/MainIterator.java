package com.company.iterator;

import com.company.iterator.floors.FirstFloor;
import com.company.iterator.floors.SecondFloor;
import com.company.iterator.floors.ThirdFloor;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainIterator {

    public static void main(String[] args) {
        ArrayList<Flat> firstFloorFlats = new ArrayList<>();
        firstFloorFlats.add(new Flat(1,  2,4));
        firstFloorFlats.add(new Flat(2,  4,1));
        firstFloorFlats.add(new Flat(3,  1,1));
        FirstFloor firstFloor = new FirstFloor(firstFloorFlats);

        LinkedList<Flat> secondFloorFlats = new LinkedList<>();
        secondFloorFlats.add(new Flat(4,  5,3));
        secondFloorFlats.add(new Flat(5,  1,2));
        secondFloorFlats.add(new Flat(6,  3,8));
        SecondFloor secondFloor = new SecondFloor(secondFloorFlats);

        Flat[] thirdFloorFlats = new Flat[2];
        thirdFloorFlats[0] = new Flat(7, 3,3);
        thirdFloorFlats[1] = new Flat(8,  2,1);
        ThirdFloor thirdFloor = new ThirdFloor(thirdFloorFlats);

        Building building = new Building("Учебная", 39, firstFloor, secondFloor, thirdFloor);
        building.showInfo();
    }
}
