public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Phone", "Google", 350.00, 500.00);
        Item item2 = new Item("PC Game", "TaleWorlds Ent.", 10.00, 35.00);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();

        System.out.println("Total Price: " + cart.totalPrice());
    }
}
