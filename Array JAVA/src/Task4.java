import java.util.ArrayList;
import java.util.Scanner;
public class Task4 {
    //Task 04: Shopping Cart Items
    //	Use an ArrayList<String>
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Shopping Cart Items: ");
        list.add("Laptop");
        list.add("Mouse");
        list.add("Keyboard");
        list.add("Headphones");
        for (String item: list){
            System.out.println(item);
        }
        // Removed Item Shopping Cart
        System.out.print("Enter Item removed: ");
        String removedItem=input.nextLine();
        list.remove(removedItem);
        System.out.println("Item removed: " + removedItem);
        // Updated Shopping Cart
        System.out.println("\nUpdated Shopping Cart: ");
        for (String item: list){
            System.out.println(item);
        }
        input.close();
    }
}
