package Beverage;

public class IceTea extends ColdBeverage {
    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return "Lipton Ice Tea";
    }
}
