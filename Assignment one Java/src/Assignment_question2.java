import java.util.Scanner;
public class Assignment_question2 {
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String burgerName= "";
        String sideName= "";
        String drinkName= "";
        int burgerPrice= 0;
        int sidePrice= 0;
        int drinkPrice= 0;
        System.out.println("Welcome to Burger Haven! Please place your order: ");
        System.out.println("Burger Selection: ");
        System.out.println("1. Zinger Burger - Rs. 450: ");
        System.out.println("2. Beef Burger - Rs. 500: ");
        System.out.println("3. Chicken Burger - Rs. 400: ");
        System.out.println("4. Exit ");
        System.out.println("Please enter the number of your choice: ");
        int burgerChoice=input.nextInt();
        switch (burgerChoice){
            case 1:
                burgerName= "Zinger Burger";
                burgerPrice =  450;
                break;
            case 2:
                burgerName= "Beef Burger";
                burgerPrice= 500;
                break;
            case 3:
                burgerName= "Chicken Burger";
                burgerPrice = 400;
                break;
            case 4:
                System.out.println("Thank you for visiting Burger Haven!: ");
                System.exit(0);
            default:
                System.out.println("Invalid Selection. Please try again: ");

        }
        System.out.println("Side Selection:");
        System.out.println("1. Fries - Rs. 150: ");
        System.out.println("2. Nuggets - Rs. 200: ");
        System.out.println("3. No Side - Rs. 0: ");
        System.out.println("Please enter the number of your choice: ");
        int sideChoice=input.nextInt();
        switch (sideChoice){
            case 1:
            sideName= "Fries";
            sidePrice= 150;
            break;
            case 2:
                sideName= "Nuggets";
                sidePrice= 200;
                break;
            case 3:
                sideName= "No Side";
                sidePrice= 0;
                break;
            default:
                System.out.println("Invalid Selection: ");
                System.exit(0);

        }
        System.out.println("Drink Selection: ");
        System.out.println("1. Coke - Rs. 100: ");
        System.out.println("2. Sprite - Rs. 100: ");
        System.out.println("3. No drink - Rs. 0: ");
        System.out.println("Please enter the number of your choice: ");
        int drinkChoice= input.nextInt();
        switch (drinkChoice){
            case 1:
                drinkName= "Coke";
                drinkPrice= 100;
                break;
            case 2:
                drinkName= "Sprite";
                drinkPrice= 100;
                break;
            case 3:
                drinkName= "No drink";
                drinkPrice = 0;
                break;
            default:
                System.out.println("Invalid Selection: ");
                System.exit(0);

        }
        System.out.println("Do you want to proceed with your order? (Y/N): ");
        char orderPrice=input.next().toUpperCase().charAt(0);
        if (orderPrice=='Y'){
            int totalBill= burgerPrice + sidePrice + drinkPrice ;
            System.out.println("Your Order’s Summary: ");
            System.out.println("Burger: " + burgerName);
            System.out.println("Side: " + sideName);
            System.out.println("Drink: " + drinkName);
            System.out.println("Total Bill: " + totalBill);
            System.out.println("Thank you for visiting Burger Haven!: ");
        }else {
            System.out.println("Invalid Selection Oder!: ");
        }
        input.close();

    }
}
