public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payed with paypal  total amount of "+amount);
    }
}
