import java.util.List;
public class Checkout {
    public static void completePurchase(List<Item> items) {
        Purchase purchase = new Purchase(items);
        System.out.println("Purchase completed! Total: $" + purchase.getTotal());
    }
}