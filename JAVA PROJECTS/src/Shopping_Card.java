import java.util.Scanner;
public class Shopping_Card {
    public static void main(String[] args){
        //SHOPPING CARD PROGRAM:
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the items  you want to buy?: ");
        String item=input.nextLine();
        System.out.println("Enter the  price for each one?: ");
        double price=input.nextDouble();
        System.out.println("Enter the  quantity  you want to buy?: ");
        double quantity=input.nextDouble();
        double total= price * quantity ;
        char currency= '$';
        //THE RESULT OF THE ITEMS SHOPPING CARD
        System.out.println("Simple Output For Shopping Card: ");
        System.out.println("Items: " + item);
        System.out.println("Price: " +price);
        System.out.println("Quantity: " + quantity);
        System.out.println("You are total is: " +  currency +  total );
        input.close();
    }
}
