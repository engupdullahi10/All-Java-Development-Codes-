import java.util.Scanner;

public class Task4 {
    public  static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Internet Speed (in Mbps): ");
        double speed=input.nextDouble();
        String category;
        if (speed<=5){
            category = "Slow";
        } else if (speed>5 && speed<=20) {
            category= "Average";
            
        } else if (speed>21 && speed<=100) {
            category= "Fast";
            
        }else {
            category= "Ultra-Fast";
        }
        System.out.println("Speed: " + speed);
        System.out.println("Speed Category: " + category);
        input.close();
    }
}
