public class QRPayment implements PaymentStrategy {
    public void pay(String cost) {
        System.out.println("Payment method: QR. Client pays the " + cost + "$. ");
    }
}