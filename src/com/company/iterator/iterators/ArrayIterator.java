package com.company.iterator.iterators;

import com.company.iterator.Flat;

public class ArrayIterator implements Iterator {
    private Flat[] rooms;
    private int position = 0;

    public ArrayIterator(Flat[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return position < rooms.length && rooms[position] != null;
    }

    @Override
    public Object next() {
        Flat room = rooms[position];
        position++;
        return room;
    }
}
