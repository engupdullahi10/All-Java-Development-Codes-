import java.util.Scanner;
public class HospitalManagementSystem {
    public static void main(String[] args){
        //Hospital Management System
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Hospital Management System: ");
        String appointmentTypes= "";
        String serviceSelection= "";
        int appointmentPrice= 0;
        int servicePrice= 0;
        double discount= 0.0;
        System.out.println("Enter the patient name: ");
        String name=input.next();
        System.out.println("Enter the patient ID: ");
        String idNumber=input.next();
        System.out.println("Select appointment Types: ");
        System.out.println("1.General Checkup – Rs. 500: ");
        System.out.println("2.Specialist Consultation – Rs. 1000: ");
        System.out.println("3.Emergency Visit – Rs. 2000: ");
        System.out.println("4. Exit The Programming: ");
        System.out.println("Please enter the number your selection: ");
        int selection=input.nextInt();
        switch (selection){
            case 1:
                appointmentTypes= "General Checkup";
                appointmentPrice= 500;
                break;
            case 2:
                appointmentTypes= "Specialist Consultation ";
                appointmentPrice= 1000;
                break;
            case 3:
                appointmentTypes= "Emergency Visit";
                appointmentPrice= 2000;
                break;
            case 4:
                System.out.println("Thanks Your For Visiting Hospital Management System: ");
                System.exit(0);
            default:
                System.out.println("Invalid Selection of the numbers: ");
        }
        System.out.println(" Service Selection: ");
        System.out.println("1.Lab Test – Rs. 700: ");
        System.out.println("2.X-Ray – Rs. 1000: ");
        System.out.println("3.None – Rs. 0: ");
        System.out.println("Enter the service selection: ");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                serviceSelection= "Lab Test ";
                servicePrice= 700;
                break;
            case 2:
                serviceSelection= "X-Ray";
                servicePrice= 1000;
                break;
            case 3:
                serviceSelection= "None";
                servicePrice= 0;
                break;
            default:
                System.out.println("Invalid Selection ");
                System.exit(0);
        }
        int total = appointmentPrice + servicePrice;
        System.out.println("Does the patient have a hospital card? (Y/N): ");
        String card=input.next();
        if (card.equalsIgnoreCase("Y")){
            discount=  total * 0.10;
            //System.out.println("Discount Applied: Rs. " + discount);
        }else {
            discount= 0.0;
            System.out.println("No Discount: ");
        }
        double  finalTotal= total - discount ;
        System.out.println("Hospital Management System Summary: ");
        System.out.println("Patient  Name: " + name);
        System.out.println("Patient ID: " + idNumber);
        System.out.println("Appointment Types: " + appointmentTypes  + "-" +  appointmentPrice);
        System.out.println("Service Selection: " + serviceSelection  + "-" + servicePrice);
        System.out.println("Total Bill: Rs." +  total);
        System.out.println("Patient Card: " + card);
        System.out.println("Discount Applied: $" +  discount);
        System.out.println("Total Amount Payment: Rs." +  finalTotal);
        System.out.println("Thank your for using the Hospital Management System!: ");
        input.close();
    }
}
