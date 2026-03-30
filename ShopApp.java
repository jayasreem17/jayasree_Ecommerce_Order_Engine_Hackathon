

import java.util.Scanner;
public class ShopApp {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item name:");
        String name = scanner.nextLine();

        System.out.println("Enter item price:");
        double price = scanner.nextDouble();

        Item item = new Item(name, price);
        basket.addItem(item);

        Checkout.completePurchase(basket.getItems());
    }
}