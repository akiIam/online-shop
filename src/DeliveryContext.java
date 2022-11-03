public class DeliveryContext {

    private DeliveryState currentState;

    public DeliveryContext(DeliveryState currentState) {
        super();
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = Verified.instance();
        }
    }

    public void setCurrentState(DeliveryState currentState) {
        this.currentState = currentState;
    }

    public void update() {
        currentState.updateState(this);
    }

}

