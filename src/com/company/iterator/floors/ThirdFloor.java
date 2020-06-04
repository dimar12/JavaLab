package com.company.iterator.floors;

import com.company.iterator.Flat;
import com.company.iterator.iterators.ArrayIterator;
import com.company.iterator.iterators.Iterator;

public class ThirdFloor {
    private Flat[] flats;

    public ThirdFloor(Flat[] flats) {
        this.flats = flats;
    }

    public Iterator createIterator() {
        return new ArrayIterator(flats);
    }
}
