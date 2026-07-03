import java.util.Scanner;

public class Task5 {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilometers=input.nextDouble();
        double meters= 1000;
        double miles= 0.621371;
        double feet= 0.621371;
        System.out.println("Simple Output: ");
        System.out.println("Distance in meters: " + meters);
        System.out.println("Distance in miles: " + miles);
        System.out.println("Distance in feet: " + feet);
        input.close();
    }
}
