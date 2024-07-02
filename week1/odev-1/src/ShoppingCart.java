import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public double totalPrice(){
        double total = 0.0;
        for (Item item : items){
            total += item.getSellPrice();
        }
        return total;
    }

    public void displayItems(){
        for (Item item : items){
            System.out.println("Item Name: " + item.getName() + " // Supplier: " + item.getSupplier() + " // Price: " + item.getSellPrice());
        }
    }
}
