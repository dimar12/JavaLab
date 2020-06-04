package com.company.iterator.floors;

import com.company.iterator.Flat;
import com.company.iterator.iterators.Iterator;
import com.company.iterator.iterators.LinkedListIterator;

import java.util.LinkedList;

public class SecondFloor {
    private LinkedList<Flat> flats;

    public SecondFloor(LinkedList<Flat> flats) {
        this.flats = flats;
    }

    public Iterator createIterator() {
        return new LinkedListIterator(flats);
    }
}
