public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payed with cash total amount of "+ amount);
    }
}
