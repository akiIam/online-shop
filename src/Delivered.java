public class Delivered implements DeliveryState {

    private static Delivered instance = new Delivered();

    private Delivered() {}

    public static Delivered instance() {
        return instance;
    }


    @Override
    public void updateState(DeliveryContext dev)
    {
        System.out.println("Waffle delivered to the address, not yet received.");
        dev.setCurrentState(Received.instance());
    }
}