public class Main {

    public static void main(String[] args) {

        ShoppingCard shoppingCard=new ShoppingCard();
        Item item=new Item("item1",100);
        Item item1=new Item("item2",50);
        Item item2=new Item("item3",70);

        shoppingCard.addItem(item);
        shoppingCard.addItem(item1);
        shoppingCard.addItem(item2);

        //test with 3 payment strategies
        shoppingCard.pay(new CashPaymentStrategy());
        shoppingCard.pay(new CreditCardPaymentStrategy());
        shoppingCard.pay(new PaypalPaymentStrategy());


    }
}
