public class Verified implements DeliveryState {

    private static Verified instance = new Verified();

    private Verified() {}

    public static Verified instance() {
        return instance;
    }


    @Override
    public void updateState(DeliveryContext dev)
    {
        System.out.println("Order verified. It will be shipped soon.");
        dev.setCurrentState(Shipped.instance());
    }
}