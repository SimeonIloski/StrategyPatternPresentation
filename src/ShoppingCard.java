import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Item> itemGroup=new ArrayList<Item>();
    void addItem(Item item){
        itemGroup.add(item);
    }
    public void removeItem(Item item){
        itemGroup.remove(item);
    }
    private int calculateTotalPrice(){
        int totalPrice=0;
        for (Item item:itemGroup)
        {
            totalPrice+=item.getPrice();
        }
        return totalPrice;
    }

    void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotalPrice());
    }
}
