import java.util.Scanner;

public class VehicleParkingManagementSystem {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Vehicle Parking Management System
        System.out.println("WELCOME TO VEHICLE PARKING MANAGEMENT SYSTEM: ");
        String vehicleTypes= "";
        int vehicleRate= 0;
        System.out.println("Vehicle Parking Management: ");
        System.out.println("1.Car: Rs. 50/hour:  ");
        System.out.println("2.Bike: Rs. 30/hour: ");
        System.out.println("3.Bus: Rs. 100/hour: ");
        System.out.println("4. Exit ");
        System.out.println("Enter your choice fro vehicle types: ");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                vehicleTypes= "Car";
                vehicleRate= 50;
                break;
            case 2:
                vehicleTypes= "Bike";
                vehicleRate= 30;
                break;
            case 3:
                vehicleTypes= "Bus";
                vehicleRate= 100;
                break;
            case 4:
                System.out.println("Exit the Vehicle Parking Management System!: ");
                System.exit(0);
            default:
                System.out.println("Invalid vehicle types : ");
        }
        System.out.println("Enter Vehicle Number: ");
        String numberCar=input.next();
        System.out.println("Enter the Parking Hours: ");
        int hours=input.nextInt();
        int totalFee= vehicleRate  * hours;

        System.out.println("Vehicle Parking Management System Summary: ");
        System.out.println("Vehicle Types: " + vehicleTypes);
        System.out.println("Vehicle Number: " + numberCar);
        System.out.println("Parking Hours: " + hours);
        System.out.println("Vehicle Rate: " + vehicleRate);
        System.out.println("Total Fees: " + totalFee);
        System.out.println("Thanks your for using  Vehicle Parking Management System!. ");
        input.close();
    }
}
