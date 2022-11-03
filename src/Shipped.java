public class Shipped implements DeliveryState {

    private static Shipped instance = new Shipped();

    private Shipped() {}

    public static Shipped instance() {
        return instance;
    }


    @Override
    public void updateState(DeliveryContext dev)
    {
        System.out.println("Waffle shipped, not yet delivered.");
        dev.setCurrentState(Delivered.instance());
    }
}