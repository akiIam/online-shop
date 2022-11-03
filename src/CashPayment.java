public class CashPayment implements PaymentStrategy {
    public void pay(String cost) {
        System.out.println("Payment method: Cash. Client pays the " + cost + "$. ");
    }
}
