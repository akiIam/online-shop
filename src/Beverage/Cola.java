package Beverage;

public class Cola extends ColdBeverage{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Coca Cola";
    }
}
