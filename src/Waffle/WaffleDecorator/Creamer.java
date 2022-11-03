package Waffle.WaffleDecorator;

import Waffle.Waffle;

public class Creamer extends CondimentDecorator {
    Waffle waffle;

    public Creamer(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 1.5 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Creamer";
    }
}
