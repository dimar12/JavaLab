package com.company.iterator.iterators;

import com.company.iterator.Flat;
import java.util.LinkedList;

public class LinkedListIterator implements Iterator {
    private LinkedList<Flat> rooms;
    private int position = 0;

    public LinkedListIterator(LinkedList<Flat> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return position < rooms.size() && rooms.get(position) != null;
    }

    @Override
    public Object next() {
        Flat room = rooms.get(position);
        position++;
        return room;
    }
}
