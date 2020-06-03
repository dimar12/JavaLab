package com.company.decorator;

import com.company.hierarchy.Weapons;

public abstract class Decorator extends Weapons {
    public Decorator(String name, int price) {
        super(name, price);
    }

}
