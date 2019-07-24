import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    public List<Item> itemGroup=new ArrayList<Item>();
    public void addItem(Item item){
        itemGroup.add(item);
    }
    public void removeItem(Item item){
        itemGroup.remove(item);
    }
    public int calculateTotalPrice(){
        int totalPrice=0;
        for (Item item:itemGroup)
        {
            totalPrice+=item.getPrice();
        }
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotalPrice());
    }
}
