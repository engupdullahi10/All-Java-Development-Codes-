import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a temperature in celsius: ");
        double celsius=input.nextDouble();
        double Fahrenheit= (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
        input.close();
    }
}
