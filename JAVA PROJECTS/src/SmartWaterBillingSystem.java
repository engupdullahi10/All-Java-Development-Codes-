import java.util.Scanner;
public class SmartWaterBillingSystem {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double charge= 0.0;
        System.out.println("Enter total water units consumed (in gallons): ");
        int unit=input.nextInt();
        System.out.println("Enter usage type (Residential/Commercial/Agricultural): ");
        String connectionType=input.next();
        if (unit<0){
            System.out.println("Invalid Input. ");
            return;
        } else if (connectionType.equalsIgnoreCase("Residential")) {
            if (unit<=1000){
                charge= unit * 5;
            }else {
                charge= unit * 7;
            }
        } else if (connectionType.equalsIgnoreCase("Commercial")) {
            if (unit<=500){
                charge= unit * 10;
            }else {
                charge= unit * 15;
            }
        } else if (connectionType.equalsIgnoreCase("Agricultural")) {
            charge=unit * 30;

        }else {
            System.out.println("Invalid Connection Types. ");
            return;
        }
        switch (connectionType.toLowerCase()){
            case "Residential":
                System.out.println("Eco Saver. ");
                break;
            case "Commercial":
                System.out.println("Heavy User. ");
                break;
            case "Agricultural":
                System.out.println("Sustainable Farmer. ");
               return;
        }
        int total= (int) charge;
        System.out.println("BILL SUMMARY. ");
        System.out.println("Unit Of Water: " + unit);
        System.out.println("User Types: " + connectionType);
        System.out.println("Calculated Bill: " + total);
        System.out.println("Final Payable : " + total);
        input.close();
    }
}
