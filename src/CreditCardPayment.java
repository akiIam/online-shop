public class CreditCardPayment implements PaymentStrategy {

    public void pay(String cost) {
        System.out.println("Payment method: Credit Card. Client pays the " + cost + "$. ");
    }
}
