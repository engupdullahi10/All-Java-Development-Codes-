import java.util.Scanner;
public class ElectricityBillManagement {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Electricity Bill Management
        System.out.println("WELCOME  TO Electricity Bill Management System:  ");
        System.out.println("Enter the consumer name: ");
        String name=input.next();
        System.out.println("Enter the units consumed: ");
        int unit=input.nextInt();
        System.out.println("Enter the connection type (Domestic/Commercial): ");
        String connectionType=input.next().toUpperCase();
        int charge= 0;
      switch (connectionType){
          case "DOMESTIC":
              if (unit<=100){
                  charge= unit * 5;
              } else if (unit<=200) {
                  charge= unit * 8;

              }else {
                  charge= unit * 10;
              }
              break;
          case "COMMERCIAL":
              if (unit<=100){
                  charge= unit * 8;
              } else if (unit<=200) {
                  charge= unit * 12;

              }else {
                  charge= unit * 15;
              }
              break;
          default:
              System.out.println("Invalid Connection Types. ");
              input.close();
              return;
      }
      int total= (int) charge ;
        System.out.println("Electricity Bill Management Summary: ");
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + unit);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: Rs. " + charge);
        System.out.println("Thanks Your Fro Using Electricity Bill Management System.! ");
        input.close();
    }
}
