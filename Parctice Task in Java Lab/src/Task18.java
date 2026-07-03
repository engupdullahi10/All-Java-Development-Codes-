import java.util.Scanner;

public class Task18 {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Internet Speed (in Mbps): ");
        int speed= input.nextInt();
        String category ;
        if (speed<=5){
            category = "Slow";

        } else if (speed>5 && speed<=20) {
            category= "Average";

        } else if (speed>20 && speed<=100) {
            category = "Fast";

        }
        else {
            category = "Ultra-Fast";
        }
        System.out.println("Simple Output: ");
        System.out.println("Speed: " + speed);
        System.out.println("Category: " + category);
        input.close();
    }
}
