import java.util.Scanner;
public class OnlineShoppingBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Online Shopping Billing System
        System.out.println("WELCOME TO ONLINE SHOPPING BILLING SYSTEM!");
        String productTypes = "";
        int productPrice = 0;
        int finalTotal = 0;
        double discount = 0.0;
        while (true) {
            System.out.println("ONLINE SHOPPING MENU:");
            System.out.println("1. Add Items to Cart");
            System.out.println("2. View Bill Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Select a Category:");
                    System.out.println("1. Electronics");
                    System.out.println("2. Clothing");
                    System.out.println("3. Groceries");
                    System.out.print("Enter your category: ");
                    int category = input.nextInt();
                    switch (category) {
                        case 1:
                            System.out.println("ELECTRONICS TYPES:");
                            System.out.println("1. Headphones – Rs.1500");
                            System.out.println("2. Power Bank – Rs.2000");
                            System.out.print("Enter your selection: ");
                            int selection = input.nextInt();
                            if (selection == 1) {
                                productTypes = "Headphones";
                                productPrice = 1500;
                            } else if (selection == 2) {
                                productTypes = "Power Bank";
                                productPrice = 2000;
                            } else {
                                System.out.println("Invalid electronic selection!");
                                continue;
                            }
                            break;
                        case 2:
                            System.out.println("CLOTHING TYPES:");
                            System.out.println("1. T-Shirt – Rs.800");
                            System.out.println("2. Jeans – Rs.1500");
                            System.out.print("Enter your selection: ");
                            int clothChoice = input.nextInt();
                            if (clothChoice == 1) {
                                productTypes = "T-Shirt";
                                productPrice = 800;
                            } else if (clothChoice == 2) {
                                productTypes = "Jeans";
                                productPrice = 1500;
                            } else {
                                System.out.println("Invalid clothing choice!");
                                continue;
                            }
                            break;
                        case 3:
                            System.out.println("GROCERIES TYPES:");
                            System.out.println("1. Rice – Rs.500");
                            System.out.println("2. Milk – Rs.300");
                            System.out.print("Enter your selection: ");
                            int groceriesSelection = input.nextInt();
                            if (groceriesSelection == 1) {
                                productTypes = "Rice";
                                productPrice = 500;
                            } else if (groceriesSelection == 2) {
                                productTypes = "Milk";
                                productPrice = 300;
                            } else {
                                System.out.println("Invalid groceries selection!");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Invalid category input!");
                            continue;
                    }
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    int itemTotal = productPrice * quantity;
                    finalTotal += itemTotal;
                    System.out.println("Added to Cart: " + productTypes + " | Quantity: " + quantity + " | Rs. " + itemTotal);
                    break;
                case 2:
                    if (finalTotal == 0) {
                        System.out.println("\nYour cart is empty! Add items first.");
                        break;
                    }

                    System.out.print("\nDo you have a discount code? (Y/N): ");
                    char hasCode = input.next().toUpperCase().charAt(0);
                    if (hasCode == 'Y') {
                        System.out.print("Enter discount code: ");
                        String code = input.next();
                        if (code.equalsIgnoreCase("SAVE10")) {
                            discount = finalTotal * 0.10;
                            System.out.println("Discount Applied: Rs. " + discount);
                        } else {
                            System.out.println("Invalid code! No discount applied.");
                        }
                    }
                    double finalPayable = finalTotal - discount;
                    System.out.println("BILL SUMMARY: ");
                    System.out.println("Total Items Added: 1");
                    System.out.println("Subtotal: Rs. " + finalTotal);
                    System.out.println("Discount: Rs. " + discount);
                    System.out.println("Final Payable Amount: Rs. " + finalPayable);
                    System.out.println("Thank you for shopping with us!");
                    break;
                case 3:
                    System.out.println("\nThank you for visiting Online Shopping Billing System. Goodbye!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid menu option. Please try again!");
            }
            input.close();
        }
    }
}
