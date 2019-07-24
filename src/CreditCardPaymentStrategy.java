public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payed with credit card total amount of "+amount);
    }
}
