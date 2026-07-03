//Create Class CartItem
class CartItem{
    private String itemName;
    private double price;
    private int quantity;
    // Static
    static int totalItemsAdded ;
    //Method Static
    static {
        System.out.println("Online Shopping Cart System Initialized");
        totalItemsAdded= 0 ;
    }
    // Default Construction
    public CartItem(){
        this.itemName="Unknown";
        this.price= 0.0;
        this.quantity= 0;
        totalItemsAdded++;
    }
    // Method
    public CartItem(String itemName , double price , int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        totalItemsAdded++;
    }
    //Getter & Setter

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getTotalItemsAdded() {
        return totalItemsAdded;
    }

    public static void setTotalItemsAdded(int totalItemsAdded) {
        CartItem.totalItemsAdded = totalItemsAdded;
    }
    // Show Cart Details & Inform
    public void displayInform(){
        System.out.println("\n====Show Online Shopping System Details & Information====");
        System.out.println("Item name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("Item Quantity: " + quantity);
    }
    // Show Total Item
    public static void showTotalItems(){
        System.out.println("Show Total Item: " + totalItemsAdded);
    }
}
public class Task20 {
    //Task 01: Online Shopping Cart System
    public  static  void main(String[] args){
        // Create & 	Add 3 items
        CartItem c1 = new CartItem("Laptop", 80000, 1);
        CartItem c2 = new CartItem("Mouse", 1500, 2);
        CartItem c3 = new CartItem("Keyboard", 3000, 1);
        // Display Each
        c1.displayInform();
        c2.displayInform();
        c3.displayInform();
        //	Show total items
        System.out.println("\nShow Total Items");
        CartItem.showTotalItems();
    }
}
