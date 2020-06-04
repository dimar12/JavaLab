package com.company.iterator.floors;

import com.company.iterator.iterators.ArrayListIterator;
import com.company.iterator.iterators.Iterator;
import com.company.iterator.Flat;

import java.util.ArrayList;

public class FirstFloor {
    private ArrayList<Flat> flats;

    public FirstFloor(ArrayList<Flat> flats) {
        this.flats = flats;
    }

    public Iterator createIterator() {
        return new ArrayListIterator(flats);
    }
}
