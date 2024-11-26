import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private List<Item> items;

    // Constructor
    public Cart() {
        items = new ArrayList<>();
    }

    // Method to add items to the cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to print items in the cart
    public void printCart() {
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng của bạn hiện tại trống.");
        } else {
            System.out.println("Các mặt hàng trong giỏ hàng của bạn:");
            for (Item item : items) {
                System.out.println("- " + item.getName() + ": $" + item.getPrice());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Thêm vài món vào giỏ
        cart.addItem(new Item("Sản phẩm A", 29.99));
        cart.addItem(new Item("Sản phẩm B", 49.99));
        cart.addItem(new Item("Sản phẩm C", 19.99));

        // In các mặt hàng trong giỏ hàng
        cart.printCart();
    }
}
