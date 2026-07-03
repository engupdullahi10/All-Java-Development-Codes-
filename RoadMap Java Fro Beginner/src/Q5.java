import java.util.Scanner;

public class Q5 {
    static void main(String[] args) {
        // Temperature Conversion Formulas
        //Celsius → Fahrenheit
        Scanner input=new Scanner(System.in);
        System.out.println("Celsius → Fahrenheit:  ");
        int c= input.nextInt();
        int f=9/5 * (c + 32);
        System.out.println("Fahrenheit → Celsius: ");
        int fa= input.nextInt();
        int ca=9/5 *(fa - 32);
        System.out.println("Celsius: " + f);
        System.out.println("Fahrenheit: " + ca);
    }
}
