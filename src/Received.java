public class Received implements DeliveryState {

    private static Received instance = new Received();

    private Received() {}

    public static Received instance() {
        return instance;
    }


    @Override
    public void updateState(DeliveryContext dev)
    {
        System.out.println("The waffle has been received by the client.");
    }
}

//The waffle has been received by the client.