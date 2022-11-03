package Waffle.WaffleDecorator;


import Waffle.Waffle;

public class CIC extends CondimentDecorator{
    Waffle waffle;

    public CIC(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 4 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Coconut";
    }
}
