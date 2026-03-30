
import java.util.List;
public class Purchase {
    private List<Item> items;

    public Purchase(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
}