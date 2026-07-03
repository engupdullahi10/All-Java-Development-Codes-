import java.util.Scanner;
public class HotelRoomBookingManagementSystem {
    public static void main(String[] args){
        //Hotel Room Booking Management System
        Scanner input=new Scanner(System.in);
        String homeName="";
        String serviceName= "";
        int homePrice= 0;
        int servicePrice= 0;
        System.out.println("Enter Guest name: ");
        String name=input.next();
        System.out.println("Room Categories: ");
        System.out.println("1. Standard Room: Rs. 4000/night: ");
        System.out.println("2. Deluxe Room: Rs. 7000/night: ");
        System.out.println("3. Suite Room: Rs. 12000/night: ");
        System.out.println("Enter your choice: ");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                homeName= "Standard Room";
                homePrice= 4000;
                break;
            case 2:
                homeName= "deluxe Room";
                homePrice= 7000;
                break;
            case 3:
                homeName= "Suite Room";
                homePrice= 12000;
                break;
            default:
                System.out.println("Invalid roon categories. ");
        }
        System.out.println("Additional Services: ");
        System.out.println("1. Breakfast: Rs. 500/day: ");
        System.out.println("2. Wi-Fi: Rs. 300/day: ");
        System.out.println("3. Airport Pickup: Rs. 1000 (one-time): ");
        int service=input.nextInt();
        switch (service){
            case 1:
                serviceName= "BreakFast";
                servicePrice= 500;
                break;
            case 2:
                serviceName= "Wi-Fi";
                servicePrice= 300;
                break;
            case 3:
                serviceName= "AirProt Pickup";
                servicePrice= 1000;
                break;
            default:
                System.out.println("Invalid additional services. ");
        }
        System.out.println("Enter how many days stayed: ");
        int dayStayed=input.nextInt();
        double discount= 0.0;
        if (dayStayed<5){
            discount= 0.10;
        }else {
            discount= 0.20;
        }
        int total= (homePrice * dayStayed) + (servicePrice * dayStayed);
        double discountAmount= total * discount ;
        double finalTotal= total - discountAmount ;
        System.out.println("Hotel Room Booking Management System Summary.! ");
        System.out.println("Guest Name: " + name);
        System.out.println("Room Categories: " + homeName + "  Rs. " + homePrice);
        System.out.println("Additional Services: " + serviceName + "  Rs. " + servicePrice);
        System.out.println("Days Stayed: " + dayStayed);
        System.out.println("Total Bill:  Rs." + total);
        System.out.println("Discount Applied: % " + discount * 100);
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Total Amount Payment:  Rs." + finalTotal);
        System.out.println("Thanks your using for Hotel Room Booking Management System:! ");
        input.close();
    }
}
