import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getTotal() {
        return product.price * quantity;
    }
}

public class App {

    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<CartItem> cart = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Add products
        products.add(new Product(101, "Laptop", 120000));
        products.add(new Product(102, "Headphones", 3500));
        products.add(new Product(103, "Mobile Phone", 78000));
        products.add(new Product(104, "T-Shirt", 1200));
        products.add(new Product(105, "Shoes", 2800));
        products.add(new Product(106 ,"Iphone 14 pro Max " , 150000 ));

        int choice;

        do {
            System.out.println("\n--------------------------------------");
            System.out.println("      ONLINE SHOPPING SYSTEM");
            System.out.println("--------------------------------------");
            System.out.println("1. View Products");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewProducts(sc);
                    break;

                case 2:
                    viewCart();
                    break;

                case 3:
                    checkout(sc);
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    // Show product list
    public static void viewProducts(Scanner sc) {
        System.out.println("\n------------------ PRODUCT LIST ------------------");
        System.out.println("ID\tName\t\t\tPrice");

        for (Product p : products) {
            System.out.println(p.id + "\t" + p.name + "\t\t" + p.price);
        }

        System.out.print("\nEnter Product ID to add to cart: ");
        int pid = sc.nextInt();

        Product selected = null;
        for (Product p : products) {
            if (p.id == pid) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid Product ID!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        cart.add(new CartItem(selected, qty));
        System.out.println("Item Added to Cart Successfully!");
    }

    // View cart table
    public static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nCart is empty!");
            return;
        }

        System.out.println("\n------------------ SHOPPING CART ------------------");
        System.out.println("Product\t\tQty\tPrice\tTotal");

        double subtotal = 0;

        for (CartItem c : cart) {
            System.out.println(c.product.name + "\t" + c.quantity + "\t" + c.product.price + "\t" + c.getTotal());
            subtotal += c.getTotal();
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Subtotal: " + subtotal);
    }

    // Checkout process
    public static void checkout(Scanner sc) {

        if (cart.isEmpty()) {
            System.out.println("\nCart is empty! Add items first.");
            return;
        }

        double subtotal = 0;
        for (CartItem c : cart) {
            subtotal += c.getTotal();
        }

        double tax = subtotal * 0.10;
        double delivery = 200;
        double grandTotal = subtotal + tax + delivery;

        sc.nextLine(); // Clear buffer

        System.out.println("\n------------------ CUSTOMER DETAILS ------------------");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("\n---------------------- INVOICE ----------------------");
        System.out.println("Customer: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        System.out.println("\nItems:");
        for (CartItem c : cart) {
            System.out.println(c.product.name + " x " + c.quantity + " = " + c.getTotal());
        }

        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Delivery Charges: " + delivery);
        System.out.println("------------------------------------------------------");
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("------------------------------------------------------");

        System.out.println("Thank you for shopping!");
        cart.clear();
    }
}
